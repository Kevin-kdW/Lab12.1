package com.youngkevin.testpractice5;

import androidx.annotation.NonNull;

public class Food {

    private String name;
    private double price;
    private int calories;

    public static final Food[] Appetisers = {
            new Food("name", 1.00,1),
            new Food("name", 1.00,1),
            new Food("name", 1.00,1)
    };
    public static final Food[] MainDishes = {
            new Food("name", 1.00,1),
            new Food("name", 1.00,1),
            new Food("name", 1.00,1)
    };
    public static final Food[] DEssrts = {
            new Food("name", 1.00,1),
            new Food("name", 1.00,1),
            new Food("name", 1.00,1)
    };

    public Food(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
