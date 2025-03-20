package com.learning.jdbc.model;

import org.springframework.stereotype.Component;

@Component
public class Programmer {
    private int id;
    private String name;
    private String tech;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTech() {
        return tech;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void setName(String name) {
        this.name = name;
    }
}
