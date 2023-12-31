package com.youngkevin.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements RecipeListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowRecipe(View view) {
        Intent intent = new Intent(this,RecipeActivity.class);
        startActivity(intent);
    }
    public void itemClicked(long id){
        Intent intent = new Intent(this, RecipeActivity.class);
        intent.putExtra(RecipeActivity.EXTRA_RECIPE_ID, (int) id);
        startActivity(intent);
    }

}