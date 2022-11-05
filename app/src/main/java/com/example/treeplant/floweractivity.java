package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class floweractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floweractivity);
        this.setTitle("ফুল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}