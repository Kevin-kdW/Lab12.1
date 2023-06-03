package com.youngkevin.lab71_appstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PastriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastries);
        Intent intent = getIntent();
        int id = intent.getIntExtra(EXTRA_PASTRYID, 0);
        Pastry pastry = Pastry.pastries[id];

        ImageView imageView = findViewById( R.id.image_pastry );
        TextView name = findViewById( R.id.text_name_pastry );
        TextView description = findViewById( R.id.text_description_pastry );
        imageView.setImageResource( pastry.getImageResource() );
        name.setText( pastry.getName() );
        description.setText( pastry.getDescription() );


    }

    public static final String EXTRA_PASTRYID = "pastryID";
}