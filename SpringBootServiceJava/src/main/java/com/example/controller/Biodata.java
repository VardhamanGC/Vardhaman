//This class is a setter and getter class for BiodataController
package com.example.controller;

import org.springframework.stereotype.Component;

@Component
public class Biodata {

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
