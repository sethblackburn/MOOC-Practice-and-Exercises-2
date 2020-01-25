// This one messed me up for a bit.

package com.company;

public class Multiplier {
    private int factor;

    public Multiplier(int number) {
        this.factor = number;
    }

    public int multiply(int otherNumber) {
        int product = this.factor * otherNumber;
        return product;
        
        // I originally tried to write this as "return this.factor *= otherNumber;" before learning the hard way that altered the
        // value of "this.factor" in way that affected the later object.method results.  It was a good learning experience.
        
    }
}
