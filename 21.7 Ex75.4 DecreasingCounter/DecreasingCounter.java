package com.company;

public class DecreasingCounter {
    private int value;
    private int initial;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial = valueAtStart;
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

    public void setInitial() {
        this.value = this.initial;
    }
}
