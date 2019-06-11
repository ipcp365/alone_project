package com.example.alone_project;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Button bt1;
    private DrawerLayout drawer;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            drawer = findViewById(R.id.drawer_layout);

            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();


            NavigationView navigationView = findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

            View navHeaderView = navigationView.getHeaderView(0);

            bt1 = navHeaderView.findViewById(R.id.bt_my_page);
            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "이동할까요?.", Toast.LENGTH_SHORT).show();
                    Log.d("123", "onClick: bt1");

                    FragmentManager manager = getSupportFragmentManager();
                    Fragment fragment4 = manager.findFragmentById(R.id.fragment4);
                    FragmentTransaction fragmentTransaction = manager.beginTransaction();
                    fragmentTransaction.show(fragment4);


                }
            });

            Button bt_logout_page = navHeaderView.findViewById(R.id.logout_btn);
            bt_logout_page.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "로그아웃할까요?", Toast.LENGTH_SHORT).show();
                    Log.d("123", "onClick: bt1");
                }
            });



            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    switch (item.getItemId()) {
                        case R.id.action_item1: {
                            transaction.replace(R.id.container, new Fragment1()).commitAllowingStateLoss();
                            break;
                        }
                        case R.id.action_item2: {
                            transaction.replace(R.id.container, new Fragment2()).commitAllowingStateLoss();
                            break;
                        }
                        case R.id.action_item3: {
                            transaction.replace(R.id.container, new Fragment3()).commitAllowingStateLoss();
                            break;
                        }
                        case R.id.action_item4: {
                            transaction.replace(R.id.container, new Fragment4()).commitAllowingStateLoss();
                            break;
                        }
                    }

                    return true;
                }
            });
            bottomNavigationView.setSelectedItemId(R.id.action_item2); // 무조건 한번 눌러주게 하는 명령어!!



        }

        @Override
        public void onBackPressed() {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.navigation, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            } else if (id == R.id.app_bar_search) {
                startActivity(new Intent(this, SearchActivity.class));
            }

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
            int id = item.getItemId();

            if (id == R.id.nav_category) {
                // Handle the camera action
                Toast.makeText(this, "눌렀다", Toast.LENGTH_SHORT).show();

            } else if (id == R.id.nav_notice) {

            } else if (id == R.id.nav_contact) {

            }

            //여기





            drawer.closeDrawers();
            return false;
        }


    }