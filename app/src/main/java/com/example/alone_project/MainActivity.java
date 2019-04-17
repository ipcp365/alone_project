package com.example.alone_project;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    Frag1 blankfragment1;
    Frag2 blankfragment2;
    Frag3 blankfragment3;
    Frag4 blankfragment4;
   //수정수정

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        blankfragment1 = new Frag1();
        blankfragment2 = new Frag2();
        blankfragment3 = new Frag3();
        blankfragment4 = new Frag4();

        MypagerAdapter mypagerAdapter = new MypagerAdapter(getSupportFragmentManager());
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(mypagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    class MypagerAdapter extends FragmentPagerAdapter {

        String[] fragmentname = {"Frag1", "Frag2", "Frag3", "Frag4"};

        public MypagerAdapter(FragmentManager fr) {
            super(fr);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return blankfragment1;
                case 1:
                    return blankfragment2;
                case 2:
                    return blankfragment3;
                case 3:
                    return blankfragment4;
            }
            return null;
        }

        @Override
        public int getCount() {
            return fragmentname.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentname[position];
        }
    }
}