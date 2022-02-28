package com.annot;

public class Person {

    String name;
    int age;

    Person(String name, int age){

        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
