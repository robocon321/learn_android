package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLayout, btnRandomExercise, btnChangeImage, btnComponent, btnGameCuocDua;
    Button btnListViewBasic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        setEvents();
    }

    public void addControls(){
        btnLayout = findViewById(R.id.btnLayout);
        btnRandomExercise = findViewById(R.id.btnRandomExercise);
        btnChangeImage = findViewById(R.id.btnChangeImage_parent);
        btnComponent = findViewById(R.id.btnComponent);
        btnGameCuocDua = findViewById(R.id.btnGameCuocDua);
        btnListViewBasic = findViewById(R.id.btnListViewBasic);
    }

    public void setEvents(){
        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, LayoutActivity.class);
                startActivity(intent);
            }
        });

        btnRandomExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RandomNumberActivity.class);
                startActivity(intent);
            }
        });

        btnChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChangeImageActivity.class);
                startActivity(intent);
            }
        });

        btnComponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ComponentActivity.class);
                startActivity(intent);
            }
        });

        btnGameCuocDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameCuocDuaKiThuActivity.class);
                startActivity(intent);
            }
        });

        btnListViewBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewBasicActivity.class);
                startActivity(intent);
            }
        });
    }
}