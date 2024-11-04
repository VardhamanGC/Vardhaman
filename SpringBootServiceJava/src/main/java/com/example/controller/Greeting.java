package com.example.controller;

import org.springframework.stereotype.Component;

@Component //By using the @Component annotation, Spring Boot marks this class as a managed bean, meaning it will be created and managed by Spring. This allows it to be injected into other classes (such as a Controller) as needed, using @Autowired or other dependency injection methods.
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
