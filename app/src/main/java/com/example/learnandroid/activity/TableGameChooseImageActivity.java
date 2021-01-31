package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import com.example.learnandroid.R;

import java.util.Collections;

public class TableGameChooseImageActivity extends AppCompatActivity {
    TableLayout tbImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_game_choose_image);
        tbImage = findViewById(R.id.tbImage);

        int size = GameChooseImageActivity.data.size();
        int cols = 3;
        int rows = size % cols == 0 ? size / cols : size / cols + 1;
        Collections.shuffle(GameChooseImageActivity.data);

        for (int i = 0; i < rows; i++){
            TableRow tbRow = new TableRow(this);
            for( int j = 0;j< cols ; j++){
                ImageView imgView = new ImageView(this);
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(200,200);
                imgView.setLayoutParams(layoutParams);

                int location = i * 3 + j;
                if(location > size - 1) break;

                String name = GameChooseImageActivity.data.get(location);
                int id = getResources().getIdentifier(name, "drawable", getPackageName());

                imgView.setImageResource(id);
                tbRow.addView(imgView);
                imgView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(TableGameChooseImageActivity.this, GameChooseImageActivity.class);
                        intent.putExtra("aaa", name);
                        setResult(RESULT_OK, intent);
                        finish();
                    }
                });
            }
            tbImage.addView(tbRow);
        }
    }
}