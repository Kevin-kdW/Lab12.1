package com.youngkevin.lab7_appstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PokemonCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_category);
        ArrayAdapter<PokeYum> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, PokeYum.pokemon);
        ListView listCakes = findViewById(R.id.list_cakes);
        listCakes.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View
                            view, int position, long id) {
                        Intent intent = new Intent(PokemonCategoryActivity.this, PokeDishActivity .class);
                        intent.putExtra(PokeDishActivity.EXTRA_POKEID, (int) id);
                        startActivity(intent);
                    }
                };
        listCakes.setOnItemClickListener(itemClickListener);
    }
}
