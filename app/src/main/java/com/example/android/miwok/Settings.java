package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import com.example.android.miwok.night.NightMode;


public class Settings extends AppCompatActivity {
    CheckBox dark, green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        dark = (CheckBox) findViewById(R.id.dark_theme);
        green = (CheckBox) findViewById(R.id.default_theme);
    }
    public void defaultTheme(View view){
       // if( green.isChecked() == true){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        //}


    }

    public void darkTheme(View view){
        //if(dark.isChecked() == true){
            Intent intent = new Intent(this, NightMode.class);
            startActivity(intent);
       //  }


    }
}