package com.example.layoutdraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Switch;

@SuppressLint("UseSwitchCompatOrMaterialCode")
public class MainActivity extends AppCompatActivity {
    ConstraintLayout screen;
    Switch sw;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (Switch) findViewById(R.id.switch1);
        screen = (ConstraintLayout) findViewById(R.id.screen);
    }
    public void go(View view){
        if(count % 2 == 0){
            screen.setBackgroundColor(Color.BLACK);
        }else
            screen.setBackgroundColor(Color.WHITE);
        count++;
    }
}