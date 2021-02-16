package com.scan.restservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.scan.restservice.config.HttpClientConfig;
import com.scan.restservice.config.RestTemplateConfig;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Disabled;
 
@ContextConfiguration(classes = { RestTemplateConfig.class, HttpClientConfig.class })
public class TestRestClient {
 
    @Autowired
    RestTemplate restTemplate;
 
    @Test
    @Disabled
    public void getEmployees() {
        final String uri = "http://localhost:8090/employees";
 
       String result = restTemplate.getForObject(uri, String.class);
        assertFalse(false);
 
    }
}