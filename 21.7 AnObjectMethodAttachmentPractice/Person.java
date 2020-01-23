// 21.7 Object-Method Attachment; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e74; 23 Jan 2020

package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String nameAtStart) {
        this.name = nameAtStart;
        this.age = 0;
    }

    public void becomeOlder() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }
}
