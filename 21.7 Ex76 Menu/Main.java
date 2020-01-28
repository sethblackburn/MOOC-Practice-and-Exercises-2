// MOOC 21.7 Ex76 Menu; https://materiaalit.github.io/2013-oo-programming/part1/week-4/#e76; 28 Jan 2020

// This was a good one. Revisiting lots of commands from previous lessons. (More notes under Menu.java)

package com.company;

public class Main {
    public static void main(String[] args) {
        Menu meals = new Menu();

        meals.addMeal("Hamburger");
        meals.addMeal("Hamburger");
        meals.addMeal("Fish'n'Chips");
        meals.addMeal("Sauerkraut");

        meals.printMeals();

        meals.clearMenu();

        meals.printMeals();
    }
}
