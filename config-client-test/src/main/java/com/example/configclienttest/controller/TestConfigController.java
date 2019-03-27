package com.example.configclienttest.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestConfigController {

    @Value("${user}")
    private String user;
    @Value("${age}")
    private String age;

    @GetMapping("/config")
    public String getInfoFromProperties(){
        return user+age;
    }
}
