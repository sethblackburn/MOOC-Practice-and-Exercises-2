// MOOC 2.16 Object Practice; https://materiaalit.github.io/2013-oo-programming/part1/week-4/; 22 Jan 2020

// Since I've started learning this, I've been brainstorming ways to use Java for development.  Reaching the point of 
// classes REALLY opens things up.

public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person brian = new Person("Brian");
        Person martin = new Person("Martin");

        pekka.printPerson();
        brian.printPerson();
        martin.printPerson();
    }
}
