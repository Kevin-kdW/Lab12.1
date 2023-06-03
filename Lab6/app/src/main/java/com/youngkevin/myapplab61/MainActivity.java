package com.youngkevin.myapplab61;

import static com.youngkevin.myapplab61.R.id.editTextTo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        Button act2 = findViewById(R.id.button4);
        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intent);

            }
        });

        EditText editText = findViewById( R.id.editTextTo );
        String text = editText.getText().toString();

    }
    public void myMethodNameHere (View view )
    {
        //this confused me but my stupid ass finally understood
    }



}