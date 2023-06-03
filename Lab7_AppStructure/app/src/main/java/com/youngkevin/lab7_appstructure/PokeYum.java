package com.youngkevin.lab7_appstructure;
import androidx.annotation.NonNull;

public class PokeYum {
    private String name;
    private String description;
    private int imageResource;


public static final PokeYum[] pokemon = {
        new PokeYum("PikaSteak", "PikaSteak is served with an in house created sauce and a side of vegetables",R.drawable.pikachu),
        new PokeYum("CharizardWings", "As spicy as they get! The wings will light you up before they hit your mouth",R.drawable.charizard),
        new PokeYum("HaunterHands", "Hard to find.. and harder to catch! Try if you dare..",R.drawable.haunter)
};

private PokeYum(String name, String description, int imageResource){
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


