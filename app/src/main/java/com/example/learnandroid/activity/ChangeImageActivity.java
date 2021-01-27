package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.learnandroid.R;

import java.util.ArrayList;
import java.util.Random;

public class ChangeImageActivity extends AppCompatActivity {
    ImageView imgChange;
    Button btnChangeImg;
    ArrayList<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_image);
        list.add(R.drawable.ubuntu);
        list.add(R.drawable.linux);
        list.add(R.drawable.windows);

        imgChange = findViewById(R.id.imgChange);
        btnChangeImg = findViewById(R.id.btnChangeImage_child);

        Random rd = new Random();

        btnChangeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgChange.setImageResource(list.get(rd.nextInt(list.size())));
            }
        });
    }
}