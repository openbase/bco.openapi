package org.openbase.bco.api.generator;

import com.google.protobuf.Message;
import com.google.protobuf.ProtocolMessageEnum;
import org.openbase.bco.registry.template.lib.TemplateRegistry;
import org.openbase.jul.iface.Shutdownable;
import org.openbase.jul.pattern.provider.DataProvider;
import org.openbase.jul.storage.registry.RegistryService;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
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

    public static void main(final String[] args) {

        parseRegistryMethods(TemplateRegistry.class);

        try {
            /*YamlInput yamlInput = Yaml.createYamlInput(new File("/home/thuxohl/workspace/openbase/bco.openapi/api/bco-openapi.yaml"));
            YamlMapping yamlMapping = yamlInput.readYamlMapping();
            System.out.println(yamlMapping.toString());*/
            Yaml yaml = new Yaml();
            try (FileInputStream stream = new FileInputStream(new File("/home/thuxohl/workspace/openbase/bco.openapi/api/bco-openapi.yaml"))) {
                Map<String, Object> map = (Map) yaml.load(stream);

                //System.out.println(yaml.dump(getAs(map, "paths", Map.class)));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    private static Map<String, Object> getMap(final Map<String, Object> map, final String key) {
        return (Map<String, Object>) map.get(key);
    }

    private static String getString(final Map<String, Object> map, final String key) {
        return (String) map.get(key);
    }

    private static <T> T getAs(final Map<String, ?> map, final String key, final Class<T> clazz) {
        return (T) map.get(key);
    }

    private static void resolveGenerics(Method method) {
        List<Class> list = new ArrayList<Class>();
        if (method.getGenericReturnType() instanceof ParameterizedType) {
            for (Type actualTypeArgument : ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()) {
                if (actualTypeArgument instanceof Class) {
                    System.out.println(((Class) actualTypeArgument).getSimpleName());
                } else {
                    System.out.println("ERROR: " + actualTypeArgument + " is not a Class!");
                }
            }
        } else {
            System.out.println("NOT parametrized: " + method.getName() + ", " + method.getGenericReturnType());
        }
    }

    private static void parseRegistryMethods(final Class registryClass) {
        final Set<Method> methodsToIgnore = new HashSet<>();

        for (Class anInterface : registryClass.getInterfaces()) {
            for (Class aClass : INTERFACES_TO_IGNORE) {
                if (aClass.equals(anInterface)) {
                    for (Method method : anInterface.getMethods()) {
                        methodsToIgnore.add(method);
                    }
                }
            }
        }

        Map<String, Object> pathMap = new HashMap<>();
        pathMap.put("post", new HashMap<>());
        Map<String, Object> post = getMap(pathMap, "post");
        post.put("requestBody", new HashMap<>());
        Map<String, Object> requestBody = getMap(post, "requestBody");
        requestBody.put("required", true);
        requestBody.put("content", new HashMap<>());

        post.put("responses", new HashMap<>());
        Map<String, Object> responses = getMap(post, "responses");
        responses.put("200", new HashMap<>());
        Map<String, Object> map = getMap(responses, "200");
        map.put("description", "Success");
        map.put("content", new HashMap<>());
        Map<String, Object> content = getMap(map, "content");
        //TODO: handle request values, probably as anyOf, add method name as text/plain?

        content.put("application/json", new HashMap<>());
        Map<String, Object> json = getMap(content, "application/json");
        json.put("schema", new HashMap<>());
        Map<String, Object> schema = getMap(json, "schema");
        schema.put("oneOf", new ArrayList<>());
        List oneOf = getAs(schema, "oneOf", List.class);

        Map<Type, Class> returnTypes = new HashMap<>();
        for (Method method : registryClass.getMethods()) {
            if (!methodsToIgnore.contains(method)) {
                returnTypes.put(method.getGenericReturnType(), method.getReturnType());
                String a = "Add method: " + method.getName() + " returns ";
                if (method.getReturnType().equals(List.class) || method.getReturnType().equals(Future.class)) {
                    a += method.getReturnType().getSimpleName() + "<";
                    a += resolveType(((Class) ((ParameterizedType) method.getGenericReturnType()).getActualTypeArguments()[0]));
                    a += "> params ";
                } else {
                    a += resolveType(method.getReturnType()) + " params ";
                }

                /*for (int i = 0; i < method.getParameterTypes().length; i++) {
                    if (i == method.getParameterTypes().length - 1) {
                        a += resolveType(method.getParameterTypes()[i]);
                    } else {
                        a += resolveType(method.getParameterTypes()[i]) + ", ";
                    }
                }*/
                System.out.println(a);
            }
        }

        //TODO: handle primitives (string and boolean, as text/plain?)
        //TODO: handle duplicate booleans through Boolean.class and boolean
        Set<Class> handledClasses = new HashSet<>();
        for (Type returnType : returnTypes.keySet()) {
            System.out.println("Return type: " + returnType);
            HashMap<String, Object> schemaMap = new HashMap<>();

            if(returnTypes.get(returnType).equals(List.class)) {
                Class actualTypeArgument1 = (Class) ((ParameterizedType) returnType).getActualTypeArguments()[0];
                Class actualTypeArgument = actualTypeArgument1;
                schemaMap.put(actualTypeArgument.getSimpleName() + "List", new HashMap<>());
                Map<String, Object> map1 = getMap(schemaMap, actualTypeArgument.getSimpleName() + "List");
                map1.put("type", "array");
                map1.put("items", new HashMap<>());
                Map<String, Object> items = getMap(map1, "items");
                items.put("$ref", resolveType(actualTypeArgument));
            } else if(returnTypes.get(returnType).equals(Future.class)) {

                Class actualTypeArgument1 = (Class) ((ParameterizedType) returnType).getActualTypeArguments()[0];
                if(handledClasses.contains(actualTypeArgument1)) {
                    continue;
                }
                handledClasses.add(actualTypeArgument1);
                schemaMap.put("$ref", resolveType(actualTypeArgument1));
            } else {
                if(handledClasses.contains(returnTypes.get(returnType))) {
                    continue;
                }
                handledClasses.add(returnTypes.get(returnType));
                schemaMap.put("$ref", resolveType(returnTypes.get(returnType)));
            }
            oneOf.add(schemaMap);
            // System.out.println("Return type: " + returnTypes.get(returnType).getSimpleName() + " - " + returnType);
        }

        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        System.out.println(new Yaml(options).dump(pathMap));
    }

    private static String resolveType(final Class clazz) {
        if (Message.class.isAssignableFrom(clazz)
                || ProtocolMessageEnum.class.isAssignableFrom(clazz)) {
            return "#/components/schemas/Openbase" + clazz.getSimpleName();
        } else if (clazz.equals(String.class)) {
            return "string";
        } else if (clazz.equals(Boolean.class)) {
            return "bool";
        } else {
            return clazz.getSimpleName();
        }
    }

}
