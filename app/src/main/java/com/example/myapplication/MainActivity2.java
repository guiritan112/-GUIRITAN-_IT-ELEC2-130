package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button button4, button5;
    private Button Fragment_A;
    private Button Fragment_B;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Fragment_A = (Button) findViewById(R.id.button4);
        Fragment_B = (Button) findViewById(R.id.button5);


        Fragment_A.setOnClickListener(new.View.onClickListener());

        void onClick;(View v){

            loadFragment(new Fragment_A());
        }
    });

        Fragment_B.setOnClickListener(new.View.onClickListener()

    {
        @Override
        public void onClick (View v){
        Fragment_B.setOnClickListener();
        loadFragment(new Fragment_B());
    }
    });

        private void loadFragment(Fragment fragment) {

            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction fragmentTransaction = fm.beginTransaction();

            fragmentTransaction.replace(R.id.framelayout, fragment);
            fragmentTransaction.commit();

        }
}









