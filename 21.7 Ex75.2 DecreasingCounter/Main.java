// 21.7 Ex75.2; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e75; 27 Jan 2020

// Simple modification of value at start to "2" here, simple if-else in the other class to prevent .decrease() from reducing the object
// value below zero, and moving on.

package com.company;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
