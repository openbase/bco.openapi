/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.LightData;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

@Validated
@Api(value = "light", description = "the light API")
public interface LightApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Returns the light unit data.", nickname = "lightGet", notes = "", response = LightData.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A light data object.", response = LightData.class),
        @ApiResponse(code = 200, message = "Unexpected error") })
    @RequestMapping(value = "/light",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<LightData> lightGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"id\" : \"id\",  \"power_state\" : {    \"value\" : \"true\"  }}");
                    break;
                }
            }
        });

        return ResponseEntity.ok(new LightData().id("1234"));

    }


    @ApiOperation(value = "Set the light unit data.", nickname = "lightPost", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Set successful."),
        @ApiResponse(code = 200, message = "Unexpected error") })
    @RequestMapping(value = "/light",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> lightPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LightData lightData) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
