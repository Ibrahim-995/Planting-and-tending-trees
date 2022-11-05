package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class fruitsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitsactivity);
        this.setTitle("ফল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}