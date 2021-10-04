package com.example.first_app;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "First_App");
        Log.d("Question 1", "activity_main.xml");
        Log.d("Question 2", "app_name");
        Log.d("Question 3", "AVD Manager");
        Log.d("Question 4", "Verbose et Info");

    }
}