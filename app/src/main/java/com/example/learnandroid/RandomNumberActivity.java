package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {
    EditText editFrom, editTo;
    Button btnRandom;
    TextView txtRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);
        addControls();
        setEvents();
    }

    public void addControls(){
        editFrom = findViewById(R.id.editFrom);
        editTo = findViewById(R.id.editTo);
        btnRandom = findViewById(R.id.btnRandom);
        txtRandom = findViewById(R.id.txtRandom);
    }

    public void setEvents(){
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int from = Integer.parseInt(editFrom.getText().toString().trim());
                    int to = Integer.parseInt(editTo.getText().toString().trim());

                    Random rd = new Random();

                    int result = from + rd.nextInt(to - from +1);
                    txtRandom.setText(result+"");
                }catch (Exception e){
                    txtRandom.setText("Mời bạn nhập liệu");
                }
            }
        });
    }
}