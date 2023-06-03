package com.youngkevin.testpractice2;

import androidx.annotation.NonNull;

public class Food {
    private String name;
    private double price;
    private int calories;

    public static final Food[] Appetisers = {
            new Food("B",6.00,150),
            new Food("CW",8.00,400),
            new Food("MS",7.00,350),

    };
    public static final Food[] MainDish = {
            new Food("B",20.00,500),
            new Food("B",25.00,800),
            new Food("B",15.00,600),
    };

    public static final Food[] Dessert = {
            new Food("B",8.00,550),
            new Food("B",6.00,400),
            new Food("B",7.00,450),
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
