package com.youngkevin.testpractice;

import androidx.annotation.NonNull;

public class Food {
    private String name;
    private double price;
    private int calories;

    public static final Food[] Appetisers = {
            new Food("Bruschetta",6.00,150),
            new Food("Chicken Wings",8.00,400),
            new Food("Mozzarella Sticks",7.00,350)
    };
    public static final Food[] MainDishes = {
            new Food("Grilled Salmon",20.00,500),
            new Food("Ribeye Steak",25.00,800),
            new Food("Margherita Pizza",15.00,600)
    };
    public static final Food[] Desserts = {
          new Food("Chocolate lava cake", 8.00,550),
          new Food("Apple pie", 6.00,400),
          new Food("Cheesecake",7.00,450)
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
