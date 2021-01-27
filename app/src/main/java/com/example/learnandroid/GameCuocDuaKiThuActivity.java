package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameCuocDuaKiThuActivity extends AppCompatActivity {
    CheckBox ckCuocDua_1, ckCuocDua_2, ckCuocDua_3;
    SeekBar seekBarCuocDua_1, seekBarCuocDua_2, seekBarCuocDua_3;
    ImageButton btnPlay;
    TextView txtScore;
    boolean isPlay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_cuoc_dua_ki_thu);
        addControls();
        setEvents();
    }

    public void addControls(){
        ckCuocDua_1 = findViewById(R.id.ckCuocDua_1);
        ckCuocDua_2 = findViewById(R.id.ckCuocDua_2);
        ckCuocDua_3 = findViewById(R.id.ckCuocDua_3);

        seekBarCuocDua_1 = findViewById(R.id.seekBarCuocDua_1);
        seekBarCuocDua_2 = findViewById(R.id.seekBarCuocDua_2);
        seekBarCuocDua_3 = findViewById(R.id.seekBarCuocDua_3);

        seekBarCuocDua_1.setEnabled(false);
        seekBarCuocDua_2.setEnabled(false);
        seekBarCuocDua_3.setEnabled(false);

        btnPlay = findViewById(R.id.btnPlay);
        txtScore = findViewById(R.id.txtScore);
    }

    public void setEvents(){
        CountDownTimer countDownTimer = new CountDownTimer(10000,300) {
            @Override
            public void onTick(long millisUntilFinished) {
                Random rd = new Random();

                int number1 = rd.nextInt(10);
                int number2 = rd.nextInt(10);
                int number3 = rd.nextInt(10);

                int prog1 = seekBarCuocDua_1.getProgress();
                int prog2 = seekBarCuocDua_2.getProgress();
                int prog3 = seekBarCuocDua_3.getProgress();

                seekBarCuocDua_1.setProgress(number1 + prog1);
                seekBarCuocDua_2.setProgress(number2 + prog2);
                seekBarCuocDua_3.setProgress(number3 + prog3);

                if(seekBarCuocDua_1.getProgress() >= 100){
                    if(ckCuocDua_1.isChecked())
                        plusScore();
                    else
                        substractScore();
                    Toast.makeText(GameCuocDuaKiThuActivity.this, "User 1 win", Toast.LENGTH_SHORT).show();
                    this.cancel();
                    ckCuocDua_1.setEnabled(true);
                    ckCuocDua_2.setEnabled(true);
                    ckCuocDua_3.setEnabled(true);
                }
                if(seekBarCuocDua_2.getProgress() >= 100){
                    if(ckCuocDua_2.isChecked())
                        plusScore();
                    else
                        substractScore();
                    Toast.makeText(GameCuocDuaKiThuActivity.this, "User 2 win", Toast.LENGTH_SHORT).show();
                    this.cancel();
                    ckCuocDua_1.setEnabled(true);
                    ckCuocDua_2.setEnabled(true);
                    ckCuocDua_3.setEnabled(true);
                }
                if(seekBarCuocDua_3.getProgress() >= 100){
                    if(ckCuocDua_3.isChecked())
                        plusScore();
                    else
                        substractScore();
                    Toast.makeText(GameCuocDuaKiThuActivity.this, "User 3 win", Toast.LENGTH_SHORT).show();
                    this.cancel();
                    ckCuocDua_1.setEnabled(true);
                    ckCuocDua_2.setEnabled(true);
                    ckCuocDua_3.setEnabled(true);
                }
            }

            @Override
            public void onFinish() {
            }
        };

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPlay) {
                    if(ckCuocDua_1.isChecked() || ckCuocDua_2.isChecked() || ckCuocDua_3.isChecked())
                    {
                        btnPlay.setImageResource(R.drawable.pause);

                        seekBarCuocDua_1.setProgress(0);
                        seekBarCuocDua_2.setProgress(0);
                        seekBarCuocDua_3.setProgress(0);

                        ckCuocDua_1.setEnabled(false);
                        ckCuocDua_2.setEnabled(false);
                        ckCuocDua_3.setEnabled(false);

                        countDownTimer.start();
                        isPlay = false;
                    }
                    else
                        Toast.makeText(GameCuocDuaKiThuActivity.this, "You don't choose who will win", Toast.LENGTH_SHORT).show();
                }else{
                    btnPlay.setImageResource(R.drawable.play);

                    countDownTimer.cancel();

                    isPlay = true;
                }
            }
        });
        ckCuocDua_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ckCuocDua_2.setChecked(false);
                ckCuocDua_3.setChecked(false);
            }
        });

        ckCuocDua_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ckCuocDua_1.setChecked(false);
                ckCuocDua_3.setChecked(false);
            }
        });

        ckCuocDua_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ckCuocDua_1.setChecked(false);
                ckCuocDua_2.setChecked(false);
            }
        });
    }

    public void plusScore(){
        txtScore.setText((Integer.parseInt(txtScore.getText().toString())+10)+"");
    }

    public void substractScore(){
        txtScore.setText((Integer.parseInt(txtScore.getText().toString())-10)+"");
    }
}