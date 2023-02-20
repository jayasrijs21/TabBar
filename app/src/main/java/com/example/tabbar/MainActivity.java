package com.example.tabbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    HomeFragment homeFragment = new HomeFragment();
    ForestFragment forestFragment = new ForestFragment();
    OceanFragment oceanFragment = new OceanFragment();
    DessertFragment dessertFragment = new DessertFragment();
    IceFragment iceFragment = new IceFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, homeFragment)
                                .addToBackStack("name").commit();
                        return true;

                    }
                    case R.id.forest: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, forestFragment)
                                .addToBackStack("name").commit();
                        return true;

                    }
                    case R.id.ocean: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, oceanFragment)
                                .addToBackStack("name").commit();
                        return true;

                    }
                    case R.id.desert: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, dessertFragment)
                                .addToBackStack("name").commit();
                        return true;
                    }
                    case R.id.ice: {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container, iceFragment)
                                .addToBackStack("name").commit();
                        return true;

                    }
                }

                return false;
            }
        });


    }
}