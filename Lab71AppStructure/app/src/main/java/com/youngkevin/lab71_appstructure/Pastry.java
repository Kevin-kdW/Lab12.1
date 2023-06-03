package com.youngkevin.lab71_appstructure;

import androidx.annotation.NonNull;

public class Pastry {
    private String name;
    private String description;
    private int imageResource;

    public static final Pastry[] pastries = {new Pastry( "Dolicious rolls", "Sponge cake is a light cake made with eggs, flour and sugar, sometimes leavened with baking powder.", R.drawable.charizard ),
            new Pastry( "Red Velvet", "Red velvet cake is a delicacy originating from the Victorian Era.", R.drawable.haunter ),
            new Pastry( "Carrot Cake", "Carrot cake is cake that contains carrots mixed into the batter.", R.drawable.pikachu )
    };


    private Pastry(String name, String description, int imageResource){
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResource() {
        return imageResource;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}
