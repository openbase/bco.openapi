package org.openbase.bco.api.generator;

import com.google.protobuf.Message;
import com.google.protobuf.ProtocolMessageEnum;
import org.eclipse.jgit.lib.ObjectIdOwnerMap;
import org.openbase.bco.registry.template.lib.TemplateRegistry;
import org.openbase.jul.exception.CouldNotPerformException;
import org.openbase.jul.exception.NotAvailableException;
import org.openbase.jul.exception.printer.ExceptionPrinter;
import org.openbase.jul.iface.Shutdownable;
import org.openbase.jul.pattern.provider.DataProvider;
import org.openbase.jul.storage.registry.RegistryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.Future;

/*-
 * #%L
 * BCO Authentication Core
 * %%
 * Copyright (C) 2017 - 2019 openbase.org
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

/**
 * @author <a href="mailto:thuxohl@techfak.uni-bielefeld.de">Tamino Huxohl</a>
 */
public class Generator {

    public static Class[] INTERFACES_TO_IGNORE = {
            DataProvider.class,
            Shutdownable.class,
            RegistryService.class
    };

    private static final Logger LOGGER = LoggerFactory.getLogger(Generator.class);

    public static void main(final String[] args) {

        final DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        final Yaml yaml = new Yaml(options);

        try {
            final File file = new File("/home/thuxohl/workspace/openbase/bco.openapi/api/bco-openapi.yaml");
            final Map<String, Object> apiDefinition;
            try (FileInputStream stream = new FileInputStream(file)) {
                apiDefinition = (Map) yaml.load(stream);
            }

            for (Map.Entry<String, Object> entry : parseRegistryMethods(TemplateRegistry.class).entrySet()) {
                ((Map<String, Object>) apiDefinition.get("paths")).put(entry.getKey(), entry.getValue());
            }

            try(FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(yaml.dump(apiDefinition));
            }
        } catch (Exception ex) {
            ExceptionPrinter.printHistory(ex, LOGGER);
        }
    }

    private static Set<Method> methodsToIgnore() {
        final Set<Method> methodSet = new HashSet<>();
        for (Class clazz : INTERFACES_TO_IGNORE) {
            methodSet.addAll(Arrays.asList(clazz.getMethods()));
        }
        return methodSet;
    }

    private static Map<String, Object> parseRegistryMethods(final Class registryInterface) throws CouldNotPerformException {
        final Set<Method> methodsToIgnore = methodsToIgnore();

        final Map<String, Object> result = new HashMap<>();
        final String pathPrefix = "/registry/" + registryInterface.getSimpleName().toLowerCase().replace("registry", "");

        final Set<String> methodNameSet = new HashSet<>();
        for (Method method : registryInterface.getMethods()) {
            if (methodsToIgnore.contains(method)) {
                continue;
            }

            if (methodNameSet.contains(method.getName())) {
                throw new CouldNotPerformException("Could not add method[" + method.getName() + "] for [" + registryInterface.getSimpleName() + "] because method with same name is defined more than once!");
            }
            methodNameSet.add(method.getName());

            addMethodEntry(result, method, pathPrefix);
        }

        return result;
    }

    private static void addMethodEntry(final Map<String, Object> pathMap, final Method method, final String pathPrefix) throws CouldNotPerformException {
        final Map<String, Object> methodMap = addObject(pathPrefix + "/" + method.getName(), pathMap);

        final Map<String, Object> methodTypeMap;
        if (method.getParameters().length > 0) {
            methodTypeMap = addObject("post", methodMap);
            addParameters(methodTypeMap, method);
        } else {
            methodTypeMap = addObject("get", methodMap);
        }

        addResponse(methodTypeMap, method);
    }

    private static void addParameters(final Map<String, Object> methodTypeMap, final Method method) throws CouldNotPerformException {
        final Map<String, Object> requestBody = addObject("requestBody", methodTypeMap);
        requestBody.put("required", true);

        final Map<String, Object> content = addObject("content", requestBody);
        final Map<String, Object> applicationJson = addObject("application/json", content);
        final Map<String, Object> schema = addObject("schema", applicationJson);

        if (method.getParameters().length > 1) {
            schema.put("type", "object");
            final Map<String, Object> properties = addObject("properties", schema);

            for (final Class parameter : method.getParameterTypes()) {
                addType(addObject(getParameterName(parameter, method.getName()), properties), parameter);
            }
        } else {
            addType(schema, method.getParameterTypes()[0]);
        }
    }

    private static String getParameterName(final Class parameter, final String methodName) {
        if (parameter.getClasses().equals(String.class)) {
            if (methodName.split("By").length > 1) {
                return methodName.split("By")[1].substring(0, 1) + methodName.split("By")[1].substring(1);
            }
        }
        return parameter.getSimpleName().substring(0, 1).toLowerCase() + parameter.getSimpleName().substring(1);
    }

    private static void addResponse(final Map<String, Object> methodTypeMap, final Method method) throws CouldNotPerformException {
        final Map<String, Object> responses = addObject("responses", methodTypeMap);
        final Map<String, Object> response200 = addObject("200", responses);
        final Map<String, Object> content = addObject("content", response200);
        final Map<String, Object> applicationJson = addObject("application/json", content);
        final Map<String, Object> schema = addObject("schema", applicationJson);

        if (method.getReturnType().equals(List.class)) {
            final Class actualTypeArgument = (Class) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
            schema.put("type", "array");
            addType(addObject("items", schema), actualTypeArgument);
        } else if (method.getReturnType().equals(Future.class)) {
            final Class actualTypeArgument = (Class) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0];
            addType(schema, actualTypeArgument);
        } else {
            addType(schema, method.getReturnType());
        }
    }

    private static Map<String, Object> addObject(final String name, final Map<String, Object> objectToAddTo) {
        final Map<String, Object> map = new HashMap<>();
        objectToAddTo.put(name, map);
        return map;
    }

    private static boolean isReferencedType(final Class clazz) {
        return Message.class.isAssignableFrom(clazz) || ProtocolMessageEnum.class.isAssignableFrom(clazz);
    }

    private static void addType(final Map<String, Object> objectToAddTo, final Class type) throws CouldNotPerformException {
        final String key = isReferencedType(type) ? "$ref" : "type";
        objectToAddTo.put(key, resolveType(type));
    }

    private static String resolveType(final Class clazz) throws CouldNotPerformException {
        if (isReferencedType(clazz)) {
            String[] split = clazz.getName().split("\\$");
            if (split.length < 1 || split.length > 3) {
                throw new CouldNotPerformException("Unexpected split length for class[" + clazz.getName() + "]");
            }

            if (split.length == 2) {
                return "#/components/schemas/Openbase" + split[1];
            } else {
                return "#/components/schemas/Openbase" + split[1] + "." + split[2];
            }
        } else if (clazz.equals(String.class)) {
            return "string";
        } else if (clazz.equals(Boolean.class) || clazz.equals(boolean.class)) {
            return "boolean";
        } else {
            return clazz.getSimpleName();
        }
    }

}
