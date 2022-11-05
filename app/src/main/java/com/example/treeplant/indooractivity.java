package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class indooractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indooractivity);
        this.setTitle("ইনডোর প্ল্যান্ট");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}