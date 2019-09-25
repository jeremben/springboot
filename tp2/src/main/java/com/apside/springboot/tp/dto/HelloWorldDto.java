package com.apside.springboot.tp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class HelloWorldDto {

    private long id;

    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
