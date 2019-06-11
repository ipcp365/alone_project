package com.example.alone_project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import static com.example.alone_project.Fragment1.REQUEST_CODE;


public class Fragment4 extends Fragment {
    Button bt22;
    Button bt3;

    public Fragment4() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_fragment4, container, false);

        bt22 = rootView.findViewById(R.id.btt);
        bt3 = rootView.findViewById(R.id.bt3);

        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), pushactivity.class);
                startActivity(i);
            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getActivity().getSharedPreferences("sp", Context.MODE_PRIVATE); //선언 밑 생성
                SharedPreferences.Editor edit = sp.edit(); //sharpr.. 안에 있는 에디터 받아올수 있음
                edit.clear();
                Intent i = new Intent(getActivity(), LoginActivity.class);
                startActivity(i);
            }
        });


        return rootView;

    }
}
