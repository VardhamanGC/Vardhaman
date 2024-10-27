package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController //Whatever Rest calls are made automatically SpringBoot will ask to come here for implementation
public class GreetingController {
    @Autowired //This annotation automatically creates an object of the class by dependency injection
    Greeting greeting;

    AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting") //When Get requests are made then SpringBoot will look for the annotation @GetMapping and implement it (@PostMapping for post requests)
    public Greeting greeting(@RequestParam(value="name")String name)
    {
        greeting.setId(counter.incrementAndGet());
        greeting.setContent("Hey I am learning SpringBoot from "+name);
        return greeting; //Due to SpringBoot the id and content are returned directly in json format otherwise we had to use Jackson API to achieve the output in json format
    }
}
