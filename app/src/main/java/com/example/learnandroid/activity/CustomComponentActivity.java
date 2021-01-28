package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.learnandroid.R;

public class CustomComponentActivity extends AppCompatActivity {
    Button btnCustomShapeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_component);
        addControls();
        setEvents();
    }

    public void addControls(){
        btnCustomShapeButton = findViewById(R.id.btnCustomShape);
    }

    public void setEvents(){
        btnCustomShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomComponentActivity.this, CustomShapeActivity.class);
                startActivity(intent);
            }
        });
    }
}