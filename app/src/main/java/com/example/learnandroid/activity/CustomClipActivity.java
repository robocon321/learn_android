package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.learnandroid.R;

public class CustomClipActivity extends AppCompatActivity {
    ImageView imgClip;
    Button btnChangeClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_clip);
        imgClip = findViewById(R.id.imgClip);
        btnChangeClip = findViewById(R.id.btnChangeClip);

        imgClip.setImageLevel(1000);
        ClipDrawable clipDrawable = (ClipDrawable) imgClip.getDrawable();

        btnChangeClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgClip.setImageLevel(clipDrawable.getLevel()+500);
            }
        });
    }
}