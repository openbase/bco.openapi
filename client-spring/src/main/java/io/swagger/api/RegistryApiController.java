package io.swagger.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.protobuf.format.JsonFormat;
import io.swagger.annotations.ApiParam;
import io.swagger.model.*;
import org.openbase.bco.registry.remote.Registries;
import org.openbase.type.domotic.service.ServiceTemplateType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
@Controller
public class RegistryApiController implements RegistryApi {

    private static final Logger log = LoggerFactory.getLogger(RegistryApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegistryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Boolean> registryTemplateContainsActivityTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateContainsActivityTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseActivityTemplate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateContainsServiceTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateContainsServiceTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseServiceTemplate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateContainsUnitTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateContainsUnitTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseUnitTemplate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseActivityTemplate> registryTemplateGetActivityTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseActivityTemplate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseActivityTemplate> registryTemplateGetActivityTemplateByTypePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseActivityTemplate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OpenbaseActivityTemplate>> registryTemplateGetActivityTemplatesGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<OpenbaseActivityTemplate>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> registryTemplateGetServiceStateClassNamePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseServiceTemplate> registryTemplateGetServiceTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");

        final ObjectMapper objectMapper = new ObjectMapper();
        final JsonFormat jsonFormat = new JsonFormat();

        try {
            ServiceTemplateType.ServiceTemplate serviceTemplateById = Registries.getTemplateRegistry(true).getServiceTemplateById(body);
            OpenbaseServiceTemplate openbaseServiceTemplate = objectMapper.readValue(jsonFormat.printToString(serviceTemplateById), OpenbaseServiceTemplate.class);
            return ResponseEntity.ok(openbaseServiceTemplate);
        }catch (Exception ex) {
            return new ResponseEntity<OpenbaseServiceTemplate>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<OpenbaseServiceTemplate> registryTemplateGetServiceTemplateByTypePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");

        final ObjectMapper objectMapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        final JsonFormat jsonFormat = new JsonFormat();

        try {
            OpenbaseServiceTemplateServiceType openbaseServiceTemplateServiceType = OpenbaseServiceTemplateServiceType.fromValue(body);
            ServiceTemplateType.ServiceTemplate.ServiceType serviceType = ServiceTemplateType.ServiceTemplate.ServiceType.valueOf(openbaseServiceTemplateServiceType.name());
            ServiceTemplateType.ServiceTemplate serviceTemplateById = Registries.getTemplateRegistry(true).getServiceTemplateByType(serviceType);
            OpenbaseServiceTemplate openbaseServiceTemplate = objectMapper.readValue(jsonFormat.printToString(serviceTemplateById), OpenbaseServiceTemplate.class);
            return ResponseEntity.ok(openbaseServiceTemplate);
        }catch (Exception ex) {
            System.out.println("Error: " + ex);
            return new ResponseEntity<OpenbaseServiceTemplate>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<OpenbaseServiceTemplate>> registryTemplateGetServiceTemplatesGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<OpenbaseServiceTemplate>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OpenbaseServiceTemplateServiceType>> registryTemplateGetSubServiceTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<OpenbaseServiceTemplateServiceType>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OpenbaseUnitTemplateUnitType>> registryTemplateGetSubUnitTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<OpenbaseUnitTemplateUnitType>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OpenbaseServiceTemplateServiceType>> registryTemplateGetSuperServiceTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<OpenbaseServiceTemplateServiceType>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OpenbaseUnitTemplateUnitType>> registryTemplateGetSuperUnitTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<OpenbaseUnitTemplateUnitType>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseUnitTemplate> registryTemplateGetUnitTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseUnitTemplate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseUnitTemplate> registryTemplateGetUnitTemplateByTypePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseUnitTemplate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<OpenbaseUnitTemplate>> registryTemplateGetUnitTemplatesGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<OpenbaseUnitTemplate>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateIsActivityTemplateRegistryConsistentGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateIsActivityTemplateRegistryReadOnlyGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateIsServiceTemplateRegistryConsistentGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateIsServiceTemplateRegistryReadOnlyGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateIsUnitTemplateRegistryConsistentGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateIsUnitTemplateRegistryReadOnlyGet() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseActivityTemplate> registryTemplateUpdateActivityTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseActivityTemplate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseActivityTemplate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseTransactionValue> registryTemplateUpdateActivityTemplateVerifiedPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseTransactionValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseTransactionValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseServiceTemplate> registryTemplateUpdateServiceTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseServiceTemplate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseServiceTemplate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseTransactionValue> registryTemplateUpdateServiceTemplateVerifiedPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseTransactionValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseTransactionValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseUnitTemplate> registryTemplateUpdateUnitTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseUnitTemplate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseUnitTemplate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpenbaseTransactionValue> registryTemplateUpdateUnitTemplateVerifiedPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseTransactionValue body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<OpenbaseTransactionValue>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Boolean> registryTemplateValidateServicePatternSupportPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Boolean>(HttpStatus.NOT_IMPLEMENTED);
    }

}
