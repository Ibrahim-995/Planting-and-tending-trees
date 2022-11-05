package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class outdoorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor);
        this.setTitle("আউটডোর প্ল্যান্ট");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}