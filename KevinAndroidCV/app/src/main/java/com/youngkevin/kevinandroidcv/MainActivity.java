package com.youngkevin.kevinandroidcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivities(new Intent[]{intent});
            }
        });
    }


    public void onButtonClick(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView3 = findViewById(R.id.imageView3);
        if (imageView.getVisibility() == View.VISIBLE) {
            imageView.setVisibility(View.GONE);
            imageView3.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.GONE);
        }

    }
}
