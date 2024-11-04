package com.example.controller;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component//This indicates the below class should be mapped to a database table
@Table(name="BD_Storage") //The table name and class name should not start with the same word. Itwould be better if they are unique
public class BiodataTable {

    @Column(name="id")
    @Id
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="yob")
    private int yob;
    @Column(name="pob")
    private String pob;
    @Column(name="age")
    private int age;
    @Column(name="profession")
    private String profession;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
