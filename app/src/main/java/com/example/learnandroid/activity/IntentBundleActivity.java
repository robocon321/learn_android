package com.example.learnandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.learnandroid.R;

public class IntentBundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_bundle);

        Intent intent = getIntent();
        Toast.makeText(this, "int: \t"+intent.getIntExtra("int", -1), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "string: \t"+intent.getStringExtra("string"), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "arr: \t"+intent.getStringArrayExtra("arr"), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "obj: \t"+intent.getSerializableExtra("obj"), Toast.LENGTH_SHORT).show();

        Bundle bundle = intent.getBundleExtra("bundle");

        Toast.makeText(this, "bundle_int: \t"+bundle.getInt("bundle_int"), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "bundle_obj: \t"+bundle.getSerializable("bundle_obj"), Toast.LENGTH_SHORT).show();

    }
}