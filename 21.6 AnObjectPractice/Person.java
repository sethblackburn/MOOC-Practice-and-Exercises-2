// MOOC 2.16 Object Practice; https://materiaalit.github.io/2013-oo-programming/part1/week-4/; 22 Jan 2020

package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
