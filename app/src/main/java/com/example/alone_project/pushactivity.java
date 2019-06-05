package com.example.alone_project;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class pushactivity extends AppCompatActivity {

    Switch sw1, sw2, sw3, sw4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushactivity);

        sw1 = (Switch)findViewById(R.id.switch1);
        sw2 = (Switch)findViewById(R.id.switch2);
        sw3 = (Switch)findViewById(R.id.switch3);
        sw4 = (Switch)findViewById(R.id.switch4);


        String str1, str2, str3, str4;
        if (sw1.isChecked())
            str1 = sw1.getTextOn().toString();
        else
            str1 = sw1.getTextOff().toString();
        if (sw2.isChecked())
            str2 = sw2.getTextOn().toString();
        else
            str2 = sw2.getTextOff().toString();
        if (sw3.isChecked())
            str3 = sw3.getTextOn().toString();
        else
            str3 = sw3.getTextOff().toString();
        if (sw4.isChecked())
            str4 = sw4.getTextOn().toString();
        else
            str4= sw4.getTextOff().toString();





        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    Toast.makeText(getApplicationContext(), "ON",Toast.LENGTH_SHORT).show();
                } else {
                    // The toggle is disabled
                    Toast.makeText(getApplicationContext(), "OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
