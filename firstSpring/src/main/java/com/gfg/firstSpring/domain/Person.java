package com.gfg.firstSpring.domain;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("I am the person");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
