package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import com.example.learnandroid.R;

import java.util.ArrayList;

public class ComponentActivity extends AppCompatActivity {
    Switch switchTest;
    CheckBox ckAndroid, ckUbuntu, ckWindows;
    RadioButton rdNam, rdNu;
    RadioGroup rgSex;
    Button btnChooseOS, btnChooseSex;
    ProgressBar progressTest;
    SeekBar seekBarTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        addControls();
        setEvents();
    }

    public void addControls(){
        switchTest = findViewById(R.id.switchTest);
        ckAndroid = findViewById(R.id.ckAndroid);
        ckUbuntu = findViewById(R.id.ckUbuntu);
        ckWindows = findViewById(R.id.ckWindows);

        rdNam = findViewById(R.id.rdNam);
        rdNu = findViewById(R.id.rdNu);
        rgSex = findViewById(R.id.rgSex);

        progressTest = findViewById(R.id.progressTest);
        seekBarTest = findViewById(R.id.seekbarTest);

        btnChooseOS = findViewById(R.id.btnChooseOs);

    }

    public void setEvents(){
        switchTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(ComponentActivity.this, "ON", Toast.LENGTH_SHORT).show();
                else Toast.makeText(ComponentActivity.this, "OFF", Toast.LENGTH_SHORT).show();
            }
        });

        btnChooseOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> list = new ArrayList<>();
                if(ckAndroid.isChecked()) list.add("Android");
                if(ckUbuntu.isChecked()) list.add("Ubuntu");
                if(ckWindows.isChecked()) list.add("Windows");
                Toast.makeText(ComponentActivity.this, list.toString()+"", Toast.LENGTH_SHORT).show();
            }
        });

        rgSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rdNam) Toast.makeText(ComponentActivity.this, "Nam", Toast.LENGTH_SHORT).show();
                else Toast.makeText(ComponentActivity.this, "Nữ", Toast.LENGTH_SHORT).show();
            }
        });

        CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                progressTest.setProgress(progressTest.getProgress()+10);
            }

            @Override
            public void onFinish() {
                progressTest.setProgress(0);
            }
        };

        countDownTimer.start();

        seekBarTest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("Seekbar", "Change: "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("Seekbar", "Start ");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("Seekbar", "Stop ");
            }
        });
    }
}