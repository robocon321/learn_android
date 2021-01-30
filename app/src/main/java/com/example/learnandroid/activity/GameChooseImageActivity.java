package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learnandroid.R;

public class GameChooseImageActivity extends AppCompatActivity {
    ImageView imgSrc, imgDes;
    TextView txtChooseImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_choose_image);
    }

    public void addControls(){
        imgSrc = findViewById(R.id.imgSrc);
        imgDes = findViewById(R.id.imgDes);
        txtChooseImage = findViewById(R.id.txtChooseImage);
    }

    public void setEvents(){
        txtChooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}