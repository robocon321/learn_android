package com.example.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewBasicActivity extends AppCompatActivity {
    EditText editShowListView;
    Button btnAddItem, btnEditItem;
    ListView lvItem;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter adapter;
    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basic);
        addControls();
        setEvents();
    }

    public void addControls(){
        editShowListView = findViewById(R.id.editShowListView);
        btnAddItem = findViewById(R.id.btnAddItem);
        btnEditItem = findViewById(R.id.btnEditItem);
        lvItem = findViewById(R.id.lvItem);

        list.add("Android");
        list.add("Ubuntu");
        list.add("Windows");
        list.add("Kali linux");
        list.add("MacOS");
        list.add("CenOS");

        adapter = new ArrayAdapter(ListViewBasicActivity.this, android.R.layout.simple_list_item_1,list);
        lvItem.setAdapter(adapter);
    }

    public void setEvents(){
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pos = position;
                editShowListView.setText(list.get(position));
            }
        });

        lvItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                pos = position;
                Toast.makeText(ListViewBasicActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(editShowListView.getText().toString());
                editShowListView.setText("");
                adapter.notifyDataSetChanged();
            }
        });

        btnEditItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.set(pos, editShowListView.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
    }
}