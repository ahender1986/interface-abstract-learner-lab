package com.codedifferntly.interfaces;

public class Person {
   final long id;
   String name;

    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// @Test
// create method..... public void methodname() {
// create an obj of the class that is being tested} <----

