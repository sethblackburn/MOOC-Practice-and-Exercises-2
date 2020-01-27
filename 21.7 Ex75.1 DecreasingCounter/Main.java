MOOC 21.7 Ex75 Decreasing Counter Object; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e75; 27 Jan 2020

// This one was bizzarely simple. The exercise made it look like I'd have to complete the code for method "decrease"
// as well as write one or more new methods under the "DecreasingCounter" class.  But all that was needed was a line
// of "this number -= 1;" under "decrease" to get the assigned result.  Strange.

package com.company;

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}
