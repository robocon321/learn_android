package com.example.learnandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learnandroid.R;
import com.example.learnandroid.utils.Course;

import java.util.ArrayList;

public class CourseAdapter extends BaseAdapter {
    private Context context;
    private int resource;
    private ArrayList<Course> list;

    public CourseAdapter(Context context, int resource, ArrayList<Course> list) {
        this.context = context;
        this.resource = resource;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(resource,null);

        TextView txtName = view.findViewById(R.id.txtCourseName);
        TextView txtPrice = view.findViewById(R.id.txtCoursePrice);
        ImageView imgImage = view.findViewById(R.id.imgImage);

        Course course = list.get(position);

        txtName.setText(course.getName());
        txtPrice.setText(course.getPrice()+"");
        imgImage.setImageResource(course.getImage());

        return view;
    }
}
