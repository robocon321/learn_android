package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutActivity extends AppCompatActivity {
    Button btnLinearLayout, btnRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        addControls();
        setEvents();
    }

    public void addControls(){
        btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnRelativeLayout = findViewById(R.id.btnRelativeLayout);
    }

    public void setEvents(){
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LayoutActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LayoutActivity.this, RelativeLayout.class);
                startActivity(intent);
            }
        });
    }
}