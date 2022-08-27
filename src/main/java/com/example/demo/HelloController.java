package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application.properties")
public class HelloController {
    @Value("${getvar}")
    private String hello;

    @GetMapping("/")
    public String index() {
        return hello;
    }

}