package com.example.alone_project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.alone_project.models.Student;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;

import static android.content.Context.MODE_PRIVATE;


public class Fragment1 extends Fragment {

    public static final int REQUEST_CODE = 1000;
    public static Object mContext;
    Button popup;
    Button bt_delete;
    RecyclerView mRecyclerView;

    Realm realm = Realm.getDefaultInstance();

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_fragment1, container, false);

        popup = rootView.findViewById(R.id.popup_click);
        mRecyclerView = rootView.findViewById(R.id.recycler_view);
        bt_delete = rootView.findViewById(R.id.bt_delete);

//        SharedPreferences commit = getActivity().getSharedPreferences("commit",MODE_PRIVATE);
//        String title = commit.getString("title","");
//        String content = commit.getString("content", "");


        RealmResults<Student> results = realm.where(Student.class)
                .sort("name", Sort.ASCENDING).findAll();

        StudentRecyclerAdapter adapter = new StudentRecyclerAdapter(results);
        mRecyclerView.setAdapter(adapter);





        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), PopupActivity.class);
                startActivityForResult(i, REQUEST_CODE);
            }
        });





        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK && data != null) {
            String title = data.getStringExtra("title");
            String content = data.getStringExtra("content");

            // DB에 저장
            realm.beginTransaction();
            Student english1 = realm.createObject(Student.class);
            english1.setName(title);
            english1.setAge(content);
            realm.commitTransaction();
        }
    }
}
