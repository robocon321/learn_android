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

    private class ViewHolder{
        private TextView txtName, txtPrice;
        private ImageView imgImage;
    }

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
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder ;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(resource,null);

            holder.txtName = view.findViewById(R.id.txtCourseName);
            holder.txtPrice = view.findViewById(R.id.txtCoursePrice);
            holder.imgImage = view.findViewById(R.id.imgImage);

            view.setTag(holder);
        }else holder = (ViewHolder) view.getTag();

        Course course = list.get(position);

        holder.txtName.setText(course.getName());
        holder.txtPrice.setText(course.getPrice()+"");
        holder.imgImage.setImageResource(course.getImage());

        return view;
    }
}
