package com.youngkevin.myapplab61;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        Spinner spinner = findViewById(R.id.spinner);
        String string = String.valueOf(spinner.getSelectedItem());
        Button act2 = findViewById(R.id.button2);
        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrameActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });




    }
    public void onStateChange(View view) {
        ToggleButton toggleButton = (ToggleButton) view;
        boolean isOn = toggleButton.isChecked();
        if (isOn) {
            //on
        } else {
            //off
        }
    }

//    public void onCheckboxClick(View view) {
//        CheckBox checkBox = (CheckBox) view;
//        boolean checked = checkBox.isChecked();
//        switch (view.getId()) {
//            case R.id.checkBox:
//                if (checked) {
//                    //code here
//                } else {
//                    //more code here if not checked
//                }
//                break;
//        }
//    }

//    public void onRadioButtonClick(View view) {
//        RadioGroup radioGroup = findViewById(R.id.radioGroup);
//        int id = radioGroup.getCheckedRadioButtonId();
//        switch (id) {
//            case R.id.radio1:
//                break;
//            case R.id.radio2:
//                break;
//            case R.id.radio3:
//                break;
//        }
//    }
    public void onMethodThing(View view){
        Toast toast = Toast.makeText( this, "This is a toast",
                Toast.LENGTH_SHORT );
        toast.show();
    }

}