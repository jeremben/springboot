package com.apside.springboot.tp.service;

import com.apside.springboot.tp.dto.HelloWorldDto;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorldDto getHelloWorld() {
        HelloWorldDto helloWorldDto = new HelloWorldDto();
        helloWorldDto.setId(1);
        helloWorldDto.setMessage("Hello World!");

        return helloWorldDto;
    }
}
