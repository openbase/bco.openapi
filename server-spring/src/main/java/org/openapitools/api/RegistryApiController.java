package org.openapitools.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.protobuf.format.JsonFormat;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.openapitools.model.OpenbaseServiceTemplate;
import org.openapitools.model.OpenbaseServiceTemplateServiceType;
import org.openbase.bco.registry.remote.Registries;
import org.openbase.type.domotic.service.ServiceTemplateType;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-17T16:47:17.146638+02:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class RegistryApiController implements RegistryApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegistryApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
