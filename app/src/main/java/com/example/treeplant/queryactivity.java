package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class queryactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queryactivity);
        this.setTitle("Query");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}