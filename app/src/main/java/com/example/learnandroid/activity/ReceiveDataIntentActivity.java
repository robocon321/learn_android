package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.learnandroid.R;

public class ReceiveDataIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_data_intent);
        Intent intent = getIntent();
        Button btnResponse = findViewById(R.id.btnResponse);
        EditText editResponse = findViewById(R.id.editResponse);
        btnResponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("data", editResponse.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}