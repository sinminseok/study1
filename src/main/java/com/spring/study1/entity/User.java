package com.spring.study1.entity;


import lombok.Data;

@Data
public class User {

    private Long Id;
    private String name;
    private int age;

    public User(Long id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
