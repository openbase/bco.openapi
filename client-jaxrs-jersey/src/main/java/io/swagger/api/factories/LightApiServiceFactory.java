package io.swagger.api.factories;

import io.swagger.api.LightApiService;
import io.swagger.api.impl.LightApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-05-18T13:17:10.342794+02:00[Europe/Berlin]")public class LightApiServiceFactory {
    private final static LightApiService service = new LightApiServiceImpl();

    public static LightApiService getLightApi() {
        return service;
    }
}
