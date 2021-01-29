package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.learnandroid.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateAndTimePickerDialogActivity extends AppCompatActivity {
    EditText editDatePicker, editTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datetime_picker_dialog);

        // For date
        Calendar calendarDate = Calendar.getInstance();
        editDatePicker = findViewById(R.id.editDatePicker);

        editDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(DateAndTimePickerDialogActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        calendarDate.set(year, month, dayOfMonth);
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        editDatePicker.setText(sdf.format(calendarDate.getTime()));

                    }
                }, calendarDate.get(Calendar.YEAR), calendarDate.get(Calendar.MONTH), calendarDate.get(Calendar.DAY_OF_YEAR));
                datePickerDialog.show();
            }
        });

        // For time
        Calendar calendarTime = Calendar.getInstance();
        editTimePicker = findViewById(R.id.editTimePicker);

        editTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(DateAndTimePickerDialogActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                        calendarTime.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_YEAR, hourOfDay, minute);
                        editTimePicker.setText(sdf.format(calendarTime.getTime()));
                    }
                }, calendarTime.get(Calendar.HOUR_OF_DAY),calendarTime.get(Calendar.MINUTE), true);
                timePickerDialog.show();
            }
        });
    }
}