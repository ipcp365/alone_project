package com.example.alone_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button footer_menu1;
    Button footer_menu4;

    View.OnClickListener footer_menu1_1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent alone_life_intent = new Intent(MainActivity.this, alone_life.class);
            startActivity(alone_life_intent);
        }
    };

    View.OnClickListener footer_menu4_4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mypage_intent = new Intent(MainActivity.this, mypage.class);
            startActivity(mypage_intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        footer_menu1 = (Button)findViewById(R.id.footer_menu1);
        footer_menu1.setOnClickListener(footer_menu1_1);

        footer_menu4 = (Button)findViewById(R.id.footer_menu4);
        footer_menu4.setOnClickListener(footer_menu4_4);



    }
}
