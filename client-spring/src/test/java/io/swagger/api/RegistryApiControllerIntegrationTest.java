package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.OpenbaseActivityTemplate;
import io.swagger.model.OpenbaseServiceTemplate;
import io.swagger.model.OpenbaseServiceTemplateServiceType;
import io.swagger.model.OpenbaseTransactionValue;
import io.swagger.model.OpenbaseUnitTemplate;
import io.swagger.model.OpenbaseUnitTemplateUnitType;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistryApiControllerIntegrationTest {

    @Autowired
    private RegistryApi api;

    @Test
    public void registryTemplateContainsActivityTemplateByIdPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<Boolean> responseEntity = api.registryTemplateContainsActivityTemplateByIdPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateContainsActivityTemplatePostTest() throws Exception {
        OpenbaseActivityTemplate body = new OpenbaseActivityTemplate();
        ResponseEntity<Boolean> responseEntity = api.registryTemplateContainsActivityTemplatePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateContainsServiceTemplateByIdPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<Boolean> responseEntity = api.registryTemplateContainsServiceTemplateByIdPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateContainsServiceTemplatePostTest() throws Exception {
        OpenbaseServiceTemplate body = new OpenbaseServiceTemplate();
        ResponseEntity<Boolean> responseEntity = api.registryTemplateContainsServiceTemplatePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateContainsUnitTemplateByIdPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<Boolean> responseEntity = api.registryTemplateContainsUnitTemplateByIdPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateContainsUnitTemplatePostTest() throws Exception {
        OpenbaseUnitTemplate body = new OpenbaseUnitTemplate();
        ResponseEntity<Boolean> responseEntity = api.registryTemplateContainsUnitTemplatePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetActivityTemplateByIdPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<OpenbaseActivityTemplate> responseEntity = api.registryTemplateGetActivityTemplateByIdPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetActivityTemplateByTypePostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<OpenbaseActivityTemplate> responseEntity = api.registryTemplateGetActivityTemplateByTypePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetActivityTemplatesGetTest() throws Exception {
        ResponseEntity<List<OpenbaseActivityTemplate>> responseEntity = api.registryTemplateGetActivityTemplatesGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetServiceStateClassNamePostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<String> responseEntity = api.registryTemplateGetServiceStateClassNamePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetServiceTemplateByIdPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<OpenbaseServiceTemplate> responseEntity = api.registryTemplateGetServiceTemplateByIdPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetServiceTemplateByTypePostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<OpenbaseServiceTemplate> responseEntity = api.registryTemplateGetServiceTemplateByTypePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetServiceTemplatesGetTest() throws Exception {
        ResponseEntity<List<OpenbaseServiceTemplate>> responseEntity = api.registryTemplateGetServiceTemplatesGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetSubServiceTypesPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<List<OpenbaseServiceTemplateServiceType>> responseEntity = api.registryTemplateGetSubServiceTypesPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetSubUnitTypesPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<List<OpenbaseUnitTemplateUnitType>> responseEntity = api.registryTemplateGetSubUnitTypesPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetSuperServiceTypesPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<List<OpenbaseServiceTemplateServiceType>> responseEntity = api.registryTemplateGetSuperServiceTypesPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetSuperUnitTypesPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<List<OpenbaseUnitTemplateUnitType>> responseEntity = api.registryTemplateGetSuperUnitTypesPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetUnitTemplateByIdPostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<OpenbaseUnitTemplate> responseEntity = api.registryTemplateGetUnitTemplateByIdPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetUnitTemplateByTypePostTest() throws Exception {
        String body = "body_example";
        ResponseEntity<OpenbaseUnitTemplate> responseEntity = api.registryTemplateGetUnitTemplateByTypePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateGetUnitTemplatesGetTest() throws Exception {
        ResponseEntity<List<OpenbaseUnitTemplate>> responseEntity = api.registryTemplateGetUnitTemplatesGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateIsActivityTemplateRegistryConsistentGetTest() throws Exception {
        ResponseEntity<Boolean> responseEntity = api.registryTemplateIsActivityTemplateRegistryConsistentGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateIsActivityTemplateRegistryReadOnlyGetTest() throws Exception {
        ResponseEntity<Boolean> responseEntity = api.registryTemplateIsActivityTemplateRegistryReadOnlyGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateIsServiceTemplateRegistryConsistentGetTest() throws Exception {
        ResponseEntity<Boolean> responseEntity = api.registryTemplateIsServiceTemplateRegistryConsistentGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateIsServiceTemplateRegistryReadOnlyGetTest() throws Exception {
        ResponseEntity<Boolean> responseEntity = api.registryTemplateIsServiceTemplateRegistryReadOnlyGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateIsUnitTemplateRegistryConsistentGetTest() throws Exception {
        ResponseEntity<Boolean> responseEntity = api.registryTemplateIsUnitTemplateRegistryConsistentGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateIsUnitTemplateRegistryReadOnlyGetTest() throws Exception {
        ResponseEntity<Boolean> responseEntity = api.registryTemplateIsUnitTemplateRegistryReadOnlyGet();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateUpdateActivityTemplatePostTest() throws Exception {
        OpenbaseActivityTemplate body = new OpenbaseActivityTemplate();
        ResponseEntity<OpenbaseActivityTemplate> responseEntity = api.registryTemplateUpdateActivityTemplatePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateUpdateActivityTemplateVerifiedPostTest() throws Exception {
        OpenbaseTransactionValue body = new OpenbaseTransactionValue();
        ResponseEntity<OpenbaseTransactionValue> responseEntity = api.registryTemplateUpdateActivityTemplateVerifiedPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateUpdateServiceTemplatePostTest() throws Exception {
        OpenbaseServiceTemplate body = new OpenbaseServiceTemplate();
        ResponseEntity<OpenbaseServiceTemplate> responseEntity = api.registryTemplateUpdateServiceTemplatePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateUpdateServiceTemplateVerifiedPostTest() throws Exception {
        OpenbaseTransactionValue body = new OpenbaseTransactionValue();
        ResponseEntity<OpenbaseTransactionValue> responseEntity = api.registryTemplateUpdateServiceTemplateVerifiedPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateUpdateUnitTemplatePostTest() throws Exception {
        OpenbaseUnitTemplate body = new OpenbaseUnitTemplate();
        ResponseEntity<OpenbaseUnitTemplate> responseEntity = api.registryTemplateUpdateUnitTemplatePost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateUpdateUnitTemplateVerifiedPostTest() throws Exception {
        OpenbaseTransactionValue body = new OpenbaseTransactionValue();
        ResponseEntity<OpenbaseTransactionValue> responseEntity = api.registryTemplateUpdateUnitTemplateVerifiedPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void registryTemplateValidateServicePatternSupportPostTest() throws Exception {
        Body body = new Body();
        ResponseEntity<Boolean> responseEntity = api.registryTemplateValidateServicePatternSupportPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
