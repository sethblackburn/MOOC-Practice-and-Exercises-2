package com.company;

public class DecreasingCounter {
    private int value; 

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value -= 1;
    }
}
