package com.example.learnandroid.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learnandroid.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GameChooseImageActivity extends AppCompatActivity {
    ImageView imgSrc, imgDes;
    TextView txtChooseImage;
    String name;
    public static ArrayList<String> data;
    int REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_choose_image);
        addControls();
        initGame();
        setEvents();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.game_choose_image, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menuReload){
            Collections.shuffle(data);
            name = data.get(5);

            int id = getResources().getIdentifier(name,"drawable", getPackageName());
            imgSrc.setImageResource(id);
        }
        return super.onOptionsItemSelected(item);
    }

    public void addControls(){
        imgSrc = findViewById(R.id.imgSrc);
        imgDes = findViewById(R.id.imgDes);
        txtChooseImage = findViewById(R.id.txtChooseImage);
    }

    public void initGame(){
        String[] arr = getResources().getStringArray(R.array.arr);
        data = new ArrayList<>();
        data.addAll(Arrays.asList(arr));
        Collections.shuffle(data);
        name = data.get(5);

        int id = getResources().getIdentifier(name,"drawable", getPackageName());
        imgSrc.setImageResource(id);
    }

    public void setEvents(){
        txtChooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameChooseImageActivity.this, TableGameChooseImageActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    if(requestCode ==  REQUEST_CODE && resultCode == RESULT_OK && data != null){
        String des = data.getStringExtra("aaa");
        int id = getResources().getIdentifier(des, "drawable", getPackageName());
        imgDes.setImageResource(id);
        if(des.equals(name)) Toast.makeText(this, "You choose true", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "You choose false", Toast.LENGTH_SHORT).show();
    }
        super.onActivityResult(requestCode, resultCode, data);
    }
}