package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class ComponentActivity extends AppCompatActivity {
    Switch switchTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        switchTest = findViewById(R.id.switchTest);

        switchTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(ComponentActivity.this, "ON", Toast.LENGTH_SHORT).show();
                else Toast.makeText(ComponentActivity.this, "OFF", Toast.LENGTH_SHORT).show();
            }
        });
    }
}