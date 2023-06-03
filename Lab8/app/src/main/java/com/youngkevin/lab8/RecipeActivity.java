package com.youngkevin.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecipeActivity extends AppCompatActivity {
    public static final String EXTRA_RECIPE_ID = "RecipeID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        RecipeDetailFragment fragment = (RecipeDetailFragment)getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
        //hardcoded to 1 for testing purposes
        int recipeId = getIntent().getIntExtra(EXTRA_RECIPE_ID, 0);
        fragment.setRecipe(recipeId);
    }
}