package com.example.controller;

import org.springframework.stereotype.Component;

@Component //By mentioning this annotation SpringBoot understands that this class is a bean, so it will inject it into Controller class and tells that this class is a Bean
public class Greeting {

    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
