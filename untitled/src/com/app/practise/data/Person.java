package com.app.practise.data;

public class Person {
    private String name;

    public Person() {
        //   System.out.println("Person class argument less constructor");
    }

    public Person(String name) {
        // System.out.println("Person class argument constructor");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
