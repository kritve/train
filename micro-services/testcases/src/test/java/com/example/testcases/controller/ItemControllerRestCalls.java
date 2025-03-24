package com.example.testcases.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemControllerRestCalls {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads2() throws JSONException {
        String response = this.restTemplate.getForObject("/all-items-from-database", String.class);

        JSONAssert.assertEquals("[{\"id\":10001,\"name\":\"Item1\",\"price\":100,\"quantity\":20,\"value\":2000},{\"id\":10002,\"name\":\"Item3\",\"price\":200,\"quantity\":10,\"value\":2000},{\"id\":10003,\"name\":\"Item3\",\"price\":150,\"quantity\":25,\"value\":3750}]"
        , response, false);
    }
}
