package com.example.alone_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mypage extends AppCompatActivity {

    Button footer_menu1;
    Button footer_menu4;
    Button footer_menu2;

    View.OnClickListener footer_menu1_1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent alone_life_intent = new Intent(mypage.this, alone_life.class);
            startActivity(alone_life_intent);
        }
    };

    View.OnClickListener footer_menu2_2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent main_intent = new Intent(mypage.this, MainActivity.class);
            startActivity(main_intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        footer_menu1 = (Button)findViewById(R.id.footer_menu1);
        footer_menu1.setOnClickListener(footer_menu1_1);

        footer_menu2 = (Button)findViewById(R.id.footer_menu2) ;
        footer_menu2.setOnClickListener(footer_menu2_2);
    }
}
