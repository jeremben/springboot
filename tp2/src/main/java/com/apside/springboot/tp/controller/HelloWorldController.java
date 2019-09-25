package com.apside.springboot.tp.controller;

import com.apside.springboot.tp.dto.HelloWorldDto;
import com.apside.springboot.tp.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping
    public HelloWorldDto getHelloWorldDto() {
        return helloWorldService.getHelloWorld();
    }

}
