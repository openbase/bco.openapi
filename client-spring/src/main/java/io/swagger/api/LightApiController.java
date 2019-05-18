package io.swagger.api;

import io.swagger.model.LightData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.PowerState;
import org.openbase.bco.dal.remote.layer.unit.ColorableLightRemote;
import org.openbase.bco.dal.remote.layer.unit.Units;
import org.openbase.bco.registry.remote.Registries;
import org.openbase.jul.exception.NotAvailableException;
import org.openbase.type.domotic.state.PowerStateType;
import org.openbase.type.domotic.unit.UnitTemplateType.UnitTemplate.UnitType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-18T13:17:07.324917+02:00[Europe/Berlin]")
@Controller
public class LightApiController implements LightApi {

    private static final Logger log = LoggerFactory.getLogger(LightApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LightApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;


    }

    public ResponseEntity<LightData> lightGet() {
        try {
            final ColorableLightRemote unitRemote = Units.getUnitByAlias("ColorableLight-9", true, Units.COLORABLE_LIGHT);
            return ResponseEntity.ok(new LightData()
                    .id(unitRemote.getId())
                    .powerState(new PowerState().value(unitRemote.getPowerState().getValue().name())));
        } catch (Exception e) {
            return new ResponseEntity<LightData>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        //String accept = request.getHeader("Accept");


    }

    public ResponseEntity<Void> lightPost(@ApiParam(value = "", required = true) @Valid @RequestBody LightData body) {
        try {
            Units.getUnitByAlias("ColorableLight-9", true, Units.COLORABLE_LIGHT).setPowerState(PowerStateType.PowerState.State.valueOf(body.getPowerState().getValue()));
            return ResponseEntity.ok(null);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
