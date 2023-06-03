package com.youngkevin.lab7_appstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PokeDishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_dish);
        Intent intent = getIntent();
        int id = intent.getIntExtra(EXTRA_POKEID, 0);
        PokeYum pokemon = PokeYum.pokemon[id];

        ImageView imageView = findViewById( R.id.image_cake );
        TextView name = findViewById( R.id.text_name );
        TextView description = findViewById( R.id.text_description );
        imageView.setImageResource( pokemon.getImageResource() );
        name.setText( pokemon.getName() );
        description.setText( pokemon.getDescription() );
    }

    public static final String EXTRA_POKEID = "pokeID";

}