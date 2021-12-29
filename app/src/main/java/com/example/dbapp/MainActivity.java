package com.example.dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dbapp.Data.DbHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DbHandler db = new DbHandler(MainActivity.this);

    }
}