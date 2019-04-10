package com.example.alone_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button login_btn;
    EditText id;
    EditText pwd;

    View.OnClickListener login_btn_1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent login_intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(login_intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_btn = (Button) findViewById(R.id.login_btn);
        id = (EditText) findViewById(R.id.id);
        pwd = (EditText) findViewById(R.id.pwd);


        login_btn.setOnClickListener(login_btn_1);

    }
}
