package io.swagger.api;

import io.swagger.model.LightData;

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
public class LightApiControllerIntegrationTest {

    @Autowired
    private LightApi api;

    @Test
    public void lightGetTest() throws Exception {
        //ResponseEntity<LightData> responseEntity = api.lightGet();
        //assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void lightPostTest() throws Exception {
        //LightData body = new LightData();
        //ResponseEntity<Void> responseEntity = api.lightPost(body);
        //assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
