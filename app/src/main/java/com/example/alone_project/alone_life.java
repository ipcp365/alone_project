package com.example.alone_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alone_life extends AppCompatActivity {

    Button footer_menu4;
    Button footer_menu2;

    View.OnClickListener footer_menu4_4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mypage_intent = new Intent(alone_life.this, mypage.class);
            startActivity(mypage_intent);
        }
    };

    View.OnClickListener footer_menu2_2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent main_intent = new Intent(alone_life.this, MainActivity.class);
            startActivity(main_intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alone_life);

        footer_menu2 = (Button)findViewById(R.id.footer_menu2) ;
        footer_menu2.setOnClickListener(footer_menu2_2);

        footer_menu4 = (Button)findViewById(R.id.footer_menu4);
        footer_menu4.setOnClickListener(footer_menu4_4);
    }
}
