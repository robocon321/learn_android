package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.learnandroid.R;

public class GlobalAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_app);
        Toast.makeText(this, getResources().getString(R.string.welcome)+"", Toast.LENGTH_SHORT).show();
    }
}