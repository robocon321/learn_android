package com.example.learnandroid.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.learnandroid.R;

public class SendIntentDataResultActivity extends AppCompatActivity {
    int REQUEST_CODE = 123;
    TextView txtRequest ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_intent_data_result);
        Button btnSendRequestIntent =  findViewById(R.id.btnSendRequestIntent);
        txtRequest = findViewById(R.id.txtRequest);

        btnSendRequestIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SendIntentDataResultActivity.this, ReceiveDataIntentActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null){
            txtRequest.setText(data.getStringExtra("data"));
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}