// MOOC 21.7 Ex75.3 DecreasingCounter; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e75; 27 Jan 2020

// Modify value to 100. Create .reset() method. Orgnize methods. Compile and test. Next!

package com.company;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
