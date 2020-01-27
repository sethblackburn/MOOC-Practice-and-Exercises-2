// 27.1 Ex75.4; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e75; 27 Jan 2020

// Created a secondary int variable named "initial" that is assigned valueAtStart and then is only used in setInitial().  Easy-peasy.

package com.company;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
