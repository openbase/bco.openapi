/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.OpenbaseActivityTemplate;
import io.swagger.model.OpenbaseServiceTemplate;
import io.swagger.model.OpenbaseServiceTemplateServiceType;
import io.swagger.model.OpenbaseTransactionValue;
import io.swagger.model.OpenbaseUnitTemplate;
import io.swagger.model.OpenbaseUnitTemplateUnitType;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T16:31:38.671215+02:00[Europe/Berlin]")
@Api(value = "registry", description = "the registry API")
public interface RegistryApi {

    @ApiOperation(value = "", nickname = "registryTemplateContainsActivityTemplateByIdPost", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/containsActivityTemplateById",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> registryTemplateContainsActivityTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateContainsActivityTemplatePost", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/containsActivityTemplate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> registryTemplateContainsActivityTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseActivityTemplate body);


    @ApiOperation(value = "", nickname = "registryTemplateContainsServiceTemplateByIdPost", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/containsServiceTemplateById",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> registryTemplateContainsServiceTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateContainsServiceTemplatePost", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/containsServiceTemplate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> registryTemplateContainsServiceTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseServiceTemplate body);


    @ApiOperation(value = "", nickname = "registryTemplateContainsUnitTemplateByIdPost", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/containsUnitTemplateById",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> registryTemplateContainsUnitTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateContainsUnitTemplatePost", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/containsUnitTemplate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> registryTemplateContainsUnitTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseUnitTemplate body);


    @ApiOperation(value = "", nickname = "registryTemplateGetActivityTemplateByIdPost", notes = "", response = OpenbaseActivityTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseActivityTemplate.class) })
    @RequestMapping(value = "/registry/template/getActivityTemplateById",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseActivityTemplate> registryTemplateGetActivityTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetActivityTemplateByTypePost", notes = "", response = OpenbaseActivityTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseActivityTemplate.class) })
    @RequestMapping(value = "/registry/template/getActivityTemplateByType",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseActivityTemplate> registryTemplateGetActivityTemplateByTypePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetActivityTemplatesGet", notes = "", response = OpenbaseActivityTemplate.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseActivityTemplate.class, responseContainer = "List") })
    @RequestMapping(value = "/registry/template/getActivityTemplates",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<OpenbaseActivityTemplate>> registryTemplateGetActivityTemplatesGet();


    @ApiOperation(value = "", nickname = "registryTemplateGetServiceStateClassNamePost", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = String.class) })
    @RequestMapping(value = "/registry/template/getServiceStateClassName",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<String> registryTemplateGetServiceStateClassNamePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetServiceTemplateByIdPost", notes = "", response = OpenbaseServiceTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseServiceTemplate.class) })
    @RequestMapping(value = "/registry/template/getServiceTemplateById",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseServiceTemplate> registryTemplateGetServiceTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetServiceTemplateByTypePost", notes = "", response = OpenbaseServiceTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseServiceTemplate.class) })
    @RequestMapping(value = "/registry/template/getServiceTemplateByType",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseServiceTemplate> registryTemplateGetServiceTemplateByTypePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetServiceTemplatesGet", notes = "", response = OpenbaseServiceTemplate.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseServiceTemplate.class, responseContainer = "List") })
    @RequestMapping(value = "/registry/template/getServiceTemplates",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<OpenbaseServiceTemplate>> registryTemplateGetServiceTemplatesGet();


    @ApiOperation(value = "", nickname = "registryTemplateGetSubServiceTypesPost", notes = "", response = OpenbaseServiceTemplateServiceType.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseServiceTemplateServiceType.class, responseContainer = "List") })
    @RequestMapping(value = "/registry/template/getSubServiceTypes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<OpenbaseServiceTemplateServiceType>> registryTemplateGetSubServiceTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetSubUnitTypesPost", notes = "", response = OpenbaseUnitTemplateUnitType.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseUnitTemplateUnitType.class, responseContainer = "List") })
    @RequestMapping(value = "/registry/template/getSubUnitTypes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<OpenbaseUnitTemplateUnitType>> registryTemplateGetSubUnitTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetSuperServiceTypesPost", notes = "", response = OpenbaseServiceTemplateServiceType.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseServiceTemplateServiceType.class, responseContainer = "List") })
    @RequestMapping(value = "/registry/template/getSuperServiceTypes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<OpenbaseServiceTemplateServiceType>> registryTemplateGetSuperServiceTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetSuperUnitTypesPost", notes = "", response = OpenbaseUnitTemplateUnitType.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseUnitTemplateUnitType.class, responseContainer = "List") })
    @RequestMapping(value = "/registry/template/getSuperUnitTypes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<OpenbaseUnitTemplateUnitType>> registryTemplateGetSuperUnitTypesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetUnitTemplateByIdPost", notes = "", response = OpenbaseUnitTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseUnitTemplate.class) })
    @RequestMapping(value = "/registry/template/getUnitTemplateById",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseUnitTemplate> registryTemplateGetUnitTemplateByIdPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetUnitTemplateByTypePost", notes = "", response = OpenbaseUnitTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseUnitTemplate.class) })
    @RequestMapping(value = "/registry/template/getUnitTemplateByType",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseUnitTemplate> registryTemplateGetUnitTemplateByTypePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "", nickname = "registryTemplateGetUnitTemplatesGet", notes = "", response = OpenbaseUnitTemplate.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseUnitTemplate.class, responseContainer = "List") })
    @RequestMapping(value = "/registry/template/getUnitTemplates",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<OpenbaseUnitTemplate>> registryTemplateGetUnitTemplatesGet();


    @ApiOperation(value = "", nickname = "registryTemplateIsActivityTemplateRegistryConsistentGet", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/isActivityTemplateRegistryConsistent",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> registryTemplateIsActivityTemplateRegistryConsistentGet();


    @ApiOperation(value = "", nickname = "registryTemplateIsActivityTemplateRegistryReadOnlyGet", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/isActivityTemplateRegistryReadOnly",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> registryTemplateIsActivityTemplateRegistryReadOnlyGet();


    @ApiOperation(value = "", nickname = "registryTemplateIsServiceTemplateRegistryConsistentGet", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/isServiceTemplateRegistryConsistent",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> registryTemplateIsServiceTemplateRegistryConsistentGet();


    @ApiOperation(value = "", nickname = "registryTemplateIsServiceTemplateRegistryReadOnlyGet", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/isServiceTemplateRegistryReadOnly",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> registryTemplateIsServiceTemplateRegistryReadOnlyGet();


    @ApiOperation(value = "", nickname = "registryTemplateIsUnitTemplateRegistryConsistentGet", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/isUnitTemplateRegistryConsistent",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> registryTemplateIsUnitTemplateRegistryConsistentGet();


    @ApiOperation(value = "", nickname = "registryTemplateIsUnitTemplateRegistryReadOnlyGet", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/isUnitTemplateRegistryReadOnly",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> registryTemplateIsUnitTemplateRegistryReadOnlyGet();


    @ApiOperation(value = "", nickname = "registryTemplateUpdateActivityTemplatePost", notes = "", response = OpenbaseActivityTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseActivityTemplate.class) })
    @RequestMapping(value = "/registry/template/updateActivityTemplate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseActivityTemplate> registryTemplateUpdateActivityTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseActivityTemplate body);


    @ApiOperation(value = "", nickname = "registryTemplateUpdateActivityTemplateVerifiedPost", notes = "", response = OpenbaseTransactionValue.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseTransactionValue.class) })
    @RequestMapping(value = "/registry/template/updateActivityTemplateVerified",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseTransactionValue> registryTemplateUpdateActivityTemplateVerifiedPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseTransactionValue body);


    @ApiOperation(value = "", nickname = "registryTemplateUpdateServiceTemplatePost", notes = "", response = OpenbaseServiceTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseServiceTemplate.class) })
    @RequestMapping(value = "/registry/template/updateServiceTemplate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseServiceTemplate> registryTemplateUpdateServiceTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseServiceTemplate body);


    @ApiOperation(value = "", nickname = "registryTemplateUpdateServiceTemplateVerifiedPost", notes = "", response = OpenbaseTransactionValue.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseTransactionValue.class) })
    @RequestMapping(value = "/registry/template/updateServiceTemplateVerified",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseTransactionValue> registryTemplateUpdateServiceTemplateVerifiedPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseTransactionValue body);


    @ApiOperation(value = "", nickname = "registryTemplateUpdateUnitTemplatePost", notes = "", response = OpenbaseUnitTemplate.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseUnitTemplate.class) })
    @RequestMapping(value = "/registry/template/updateUnitTemplate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseUnitTemplate> registryTemplateUpdateUnitTemplatePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseUnitTemplate body);


    @ApiOperation(value = "", nickname = "registryTemplateUpdateUnitTemplateVerifiedPost", notes = "", response = OpenbaseTransactionValue.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = OpenbaseTransactionValue.class) })
    @RequestMapping(value = "/registry/template/updateUnitTemplateVerified",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OpenbaseTransactionValue> registryTemplateUpdateUnitTemplateVerifiedPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OpenbaseTransactionValue body);


    @ApiOperation(value = "", nickname = "registryTemplateValidateServicePatternSupportPost", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Boolean.class) })
    @RequestMapping(value = "/registry/template/validateServicePatternSupport",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Boolean> registryTemplateValidateServicePatternSupportPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body);

}
