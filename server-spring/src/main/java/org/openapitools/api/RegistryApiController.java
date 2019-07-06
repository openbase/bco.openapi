package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T17:42:17.060512+02:00[Europe/Berlin]")

@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class RegistryApiController implements RegistryApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegistryApiController(NativeWebRequest request) {
        this.request = request;    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
