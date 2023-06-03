package com.youngkevin.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity(View view) {
        Intent intent = new Intent(this, ReceiveLayout.class);
        intent.putExtra("Message", "Hello IT617!");
        startActivity(intent);

    }

    public void withAlways(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello IT617!");
        startActivity(intent);


    }

    public void notAlways(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        TextView PersonNameTextView = findViewById(R.id.PersonName);
        String personName = PersonNameTextView.getText().toString();
        intent.putExtra(Intent.EXTRA_TEXT, personName);
        Intent chosenIntent = Intent.createChooser(intent, "Choose an activity:");
        chosenIntent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        startActivity(chosenIntent);
    }


}