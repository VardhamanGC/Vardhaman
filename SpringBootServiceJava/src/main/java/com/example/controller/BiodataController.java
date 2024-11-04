package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BiodataController {
    @Autowired
    Biodata biodata;
    AtomicLong count = new AtomicLong();

    @GetMapping("/biodata")
    public Biodata biodata(@RequestParam int YOB){

        String name,pob,profession;
        int yob,age;
        biodata.setId(count.incrementAndGet());
        if(YOB==1967){
            name = "Malleshwar";
            yob = 1967;
            pob = "Hyderabad";
            age = 2024-1967;
            profession = "Software Engineer";
        }
        else if(YOB==1984){
            name = "Kalpana Madhavi";
            yob = 1984;
            pob = "Pothireddypally";
            age = 2024-1984;
            profession = "Home Maker";
        }
        else if(YOB==2002){
            name = "Vardhaman";
            yob = 2002;
            pob = "Nagarkurnool";
            age = 2024-2002;
            profession = "Student";
        }
        else if(YOB==2006){
            name = "Deshna";
            yob = 2006;
            pob = "Nagarkurnool";
            age = 2024-2006;
            profession = "Student";
        }
        else{
            biodata.setContent("Not an invalid Year of Birth");
            return biodata;
        }
        biodata.setContent("Hello "+name+"."+"You were born in "+yob+" in "+pob+"."+"Your age is "+age+"."+"You are a "+profession);


        return biodata;
    }
}
