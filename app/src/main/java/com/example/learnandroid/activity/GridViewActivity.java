package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.learnandroid.R;
import com.example.learnandroid.adapter.CourseAdapter;
import com.example.learnandroid.utils.Course;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {
    ArrayList<Course> list;
    GridView gvShowItem;
    CourseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        list = new ArrayList<>();

        list.add(new Course("Android", 499, R.drawable.android));
        list.add(new Course("Ubuntu", 299, R.drawable.ubuntu));
        list.add(new Course("Windows", 199, R.drawable.windows));
        list.add(new Course("MacOS", 249, R.drawable.computer));

        adapter = new CourseAdapter(this, R.layout.course_layout, list);
        gvShowItem = findViewById(R.id.gvShowItem);
        gvShowItem.setAdapter(adapter);
    }
}