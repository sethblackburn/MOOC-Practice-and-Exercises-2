// 21.7 Object-Method Attachment; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e74; 23 Jan 2020

// Seeing how methods built from scratch can be applied to objects is both familiar and not.  On the one hand, I've already done this
// with methods like .getChar() applied to a String, but now I'm building the objects and the methods from scratch and then combining them.
// My sensibilities at this point compel me to say that in order to move this kind of information around, you need a method with an 
// input parameter and a return; so, I'm re-visiting old ideas while re-learning my presuppositions.  Weird.

package com.company;

public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person andrew = new Person("Andrew");

        pekka.becomeOlder();
        pekka.becomeOlder();

        andrew.becomeOlder();

        System.out.println( "Age of Pekka: " + pekka.getAge() );
        System.out.println( "Age of Andrew: " + andrew.getAge() );

        int total = pekka.getAge() + andrew.getAge();

        System.out.println( "Pekka and Andrew total of " + total + " years old" );
    }
}
