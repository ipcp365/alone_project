package com.example.alone_project;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.alone_project.models.Student;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;

public class PopupActivity extends Activity {

    EditText title_edit;
    EditText content_edit;
    Button bt_click;
    Button end;
    Intent i;

    Realm realm = Realm.getDefaultInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_popup);

        title_edit = (EditText) findViewById(R.id.title_edit);
        content_edit = (EditText) findViewById(R.id.content_edit);
        bt_click = (Button) findViewById(R.id.bt_click);
        end = (Button) findViewById(R.id.end);




        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPreferences commit = getSharedPreferences("commit",MODE_PRIVATE);
//                SharedPreferences.Editor edit = commit.edit(); //sharpr.. 안에 있는 에디터 받아올수 있음
//                edit.putString("title", title_edit.getText().toString());
//                edit.putString("content", content_edit.getText().toString());
//                edit.apply();

                Intent intent = new Intent();
                intent.putExtra("title", title_edit.getText().toString());
                intent.putExtra("content", content_edit.getText().toString());
                setResult(RESULT_OK, intent);

                finish();
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });





    }
}
