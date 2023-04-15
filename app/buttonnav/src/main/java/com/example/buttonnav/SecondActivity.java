package com.example.buttonnav;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.text_second);

        Intent intent = getIntent();
        String fromMain = intent.getStringExtra("PASS ME");

        textView.setText(fromMain);
    }
}