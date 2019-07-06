package org.openapitools.api;

import org.openapitools.model.InlineObject14;
import org.openapitools.model.OpenbaseServiceTemplate;
import org.openbase.jul.exception.CouldNotPerformException;
import org.openbase.jul.exception.printer.ExceptionPrinter;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-06T14:31:08.291817+02:00[Europe/Berlin]")

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

    @Override
    public ResponseEntity<OpenbaseServiceTemplate> registryTemplateGetServiceTemplateByTypePost(@Valid InlineObject14 inlineObject14) {
        try {
            return ResponseEntity.ok(RegisrtyRPCProcessor.invokeMethod(inlineObject14, OpenbaseServiceTemplate.class));
        } catch (CouldNotPerformException e) {
            ExceptionPrinter.printHistory(e, LoggerFactory.getLogger(RegistryApi.class));
            return ResponseEntity.status(500).build();
        }
    }
}
