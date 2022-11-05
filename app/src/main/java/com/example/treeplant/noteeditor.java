package com.example.treeplant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.treeplant.ShareActivity;

import java.util.HashSet;

public class noteeditor extends AppCompatActivity {
    int noteId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noteeditor);
        this.setTitle("Add Note");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        EditText editText=(EditText)findViewById(R.id.edittextid);

        Intent intent=getIntent();

        noteId=intent.getIntExtra("noteId",-1);
        if(noteId !=-1){
            editText.setText(ShareActivity.notes.get(noteId));
        }

        else{
            ShareActivity.notes.add("");
            noteId=ShareActivity.notes.size()-1;
            ShareActivity.arrayAdapter.notifyDataSetChanged();
        }


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ShareActivity.notes.set(noteId,String.valueOf(s));
                ShareActivity.arrayAdapter.notifyDataSetChanged();

                SharedPreferences sharedPreferences=getApplicationContext().getSharedPreferences("com.example.favouritsnoteactivity", Context.MODE_PRIVATE);
                HashSet<String> set= new HashSet<>(ShareActivity.notes);
                sharedPreferences.edit().putStringSet("notes",set).apply();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}