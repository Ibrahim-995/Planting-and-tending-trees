package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class vegitableactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegitableactivity);
        this.setTitle("সবজি");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}