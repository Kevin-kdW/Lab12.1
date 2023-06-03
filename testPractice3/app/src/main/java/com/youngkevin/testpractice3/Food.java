package com.youngkevin.testpractice3;

import androidx.annotation.NonNull;

public class Food {

    private String name;
    private double price;
    private int calories;

    public static final Food[] Appetisers = {
            new Food("Name",6.00,150),
            new Food("Name",6.00,150),
            new Food("Name",6.00,150),
    };
    public static final Food[] Maindishes = {
            new Food("Name",6.00,150),
            new Food("Name",6.00,150),
            new Food("Name",6.00,150),
    };
    public static final Food[] Desserts = {
            new Food("Name",6.00,150),
            new Food("Name",6.00,150),
            new Food("Name",6.00,150),
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
