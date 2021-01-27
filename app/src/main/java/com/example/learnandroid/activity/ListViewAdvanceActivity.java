package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.learnandroid.R;
import com.example.learnandroid.adapter.CourseAdapter;
import com.example.learnandroid.utils.Course;

import java.util.ArrayList;


public class ListViewAdvanceActivity extends AppCompatActivity {
    ListView lvItemAdvance;
    ArrayList<Course> list;
    CourseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_advance);

        list = new ArrayList<>();

        list.add(new Course("Android", 499, R.drawable.android));
        list.add(new Course("Ubuntu", 299, R.drawable.ubuntu));
        list.add(new Course("Windows", 199, R.drawable.windows));
        list.add(new Course("MacOS", 249, R.drawable.computer));

        adapter = new CourseAdapter(this, R.layout.course_layout, list);
        lvItemAdvance = findViewById(R.id.lvItemAdvance);
        lvItemAdvance.setAdapter(adapter);
    }
}