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
        if (this.value <= 0) {
            this.value = 0;
        } else {
            this.value -= 1;
        }
    }

    public void reset() {
        this.value = 0;
    }
}
