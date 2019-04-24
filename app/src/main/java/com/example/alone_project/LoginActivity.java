package com.example.alone_project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button login_btn;
    EditText id;
    EditText pwd;
    CheckBox auto;

    View.OnClickListener login_btn_1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent login_intent = new Intent(LoginActivity.this, MainActivity.class);

                startActivity(login_intent);
                finish();

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



        // auto:자동로그인 체크 박스...  if부분 설명:만약 체크표시가 되어잇으면 자동로그인하기위한 값들을 넘겨준다.


        findViewById(R.id.auto).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("sp", MODE_PRIVATE); //선언 밑 생성
                SharedPreferences.Editor edit = sp.edit(); //sharpr.. 안에 있는 에디터 받아올수 있음
                edit.putString("id", id.getText().toString());
                edit.putString("pwd", pwd.getText().toString());

            }
            });


    }


}
