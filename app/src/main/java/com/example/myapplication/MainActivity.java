package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;


public class  MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is verbose log");
        Log.d(TAG, "This is debug log") ;
        Log.i(TAG, "This is an info log");
        Log.v(TAG, "This is warn log") ;
        Log.e(TAG, "This is an error log");


            Log.i(TAG, "Button Clicked");

        Button button = findViewById(R.id.button2);

        button.setOnClickListener(v -> Log.i(TAG, "Button Clicked"));
 Intent intent = new Intent(MainActivity.this,SecondActivity.class);
 startActivity(intent);
    }
}