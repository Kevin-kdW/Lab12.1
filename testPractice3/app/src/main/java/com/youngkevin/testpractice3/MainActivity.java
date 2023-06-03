package com.youngkevin.testpractice3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_CATEGORY = "FoodCategoryKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, FoodCategoryActivity.class);
                intent.putExtra(EXTRA_CATEGORY,i);
                startActivity(intent);
            }
        };
        ListView listView = findViewById(R.id.listView_main);
        listView.setOnItemClickListener(itemClickListener);
    }
}