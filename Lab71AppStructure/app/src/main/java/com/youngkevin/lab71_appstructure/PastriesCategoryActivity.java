package com.youngkevin.lab71_appstructure;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PastriesCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastries_category);
        ArrayAdapter<Pastry> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Pastry.pastries);
        ListView listPastries = findViewById(R.id.list_pastry);
        listPastries.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(PastriesCategoryActivity.this, PastriesActivity.class);
                intent.putExtra(PastriesActivity.EXTRA_PASTRYID, (int) id);
                startActivity(intent);
            }
        };
        listPastries.setOnItemClickListener(itemClickListener);
    }
}