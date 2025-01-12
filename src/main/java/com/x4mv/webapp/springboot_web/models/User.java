package com.x4mv.webapp.springboot_web.models;

public class User {

    private String name; 
    private String lastname;
    private String direction;



    public User(String name, String lastname, String direction) {
        this.name = name;
        this.lastname = lastname;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    
}
