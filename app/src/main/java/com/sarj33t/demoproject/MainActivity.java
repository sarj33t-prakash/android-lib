package com.sarj33t.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sarj33t.firstlib.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        HelloWorld.printMsg("", "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}