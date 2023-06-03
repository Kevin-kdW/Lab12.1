package com.youngkevin.testpractice2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int selectedCategory = intent.getIntExtra(MainActivity.EXTRA_CATEGORY,0);

        ArrayAdapter<Food> listAdapter;
        if (selectedCategory == 0) {
            listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Food.Appetisers);
        }
        else if (selectedCategory == 1) {
            listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Food.MainDish);
        }
        else if (selectedCategory == 2) {
            listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Food.Dessert);
        }
        else {
            listAdapter = null;
        }
        ListView listview = findViewById(R.id.listView_items);
        listview.setAdapter(listAdapter);
    }
}