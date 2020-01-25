// 21.7 Ex74; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e74; 24 Jan 2020

package com.company;

public class Main {
    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(3);
        Multiplier fourMultiplier = new Multiplier(4);
        
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));
        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
}
