package com.youngkevin.testpractice4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class FoodCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);
    }

    Toolbar toolbar = findViewById(R.id.toolbar);

    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    Intent intent = getIntent();
    int selectedCategory = intent.getIntExtra(MainActivity.EXTRA_CATEGORY,0);
    ArrayAdapter<Food> listAdapter;
    if(selectedCategory == 0) {
        listAdapter = new ArrayAdapter<>(this.and)
    }
}