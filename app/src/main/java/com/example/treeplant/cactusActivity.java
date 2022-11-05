package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class cactusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactus);
        this.setTitle("ক্যাকটাস");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}