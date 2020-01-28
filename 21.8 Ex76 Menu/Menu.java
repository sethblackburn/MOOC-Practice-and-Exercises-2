package com.company;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {

        if (!meals.contains(meal)) {
            meals.add(meal);
        }

        // Referring back to Ex71 helped me with the check on arrays to prevent multiples of the same item...
    }
        // ...and the loop for printing the assigned output format.

    public void printMeals() {
        int count = 0;

        while (count < meals.size()) {
            System.out.println(meals.get(count));
            count++;
        }
    }

    public void clearMenu() {
        meals.clear();
    }
}
