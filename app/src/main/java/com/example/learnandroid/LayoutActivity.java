package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class LayoutActivity extends AppCompatActivity {
    Button btnLinearLayout, btnRelativeLayout, btnFrameLayout, btnTableLayout;

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
        btnFrameLayout = findViewById(R.id.btnFrameLayout);
        btnTableLayout = findViewById(R.id.btnTableLayout);
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
                Intent intent = new Intent(LayoutActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LayoutActivity.this, FrameLayoutActivity.class);
                startActivity(intent);
            }
        });
        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LayoutActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}