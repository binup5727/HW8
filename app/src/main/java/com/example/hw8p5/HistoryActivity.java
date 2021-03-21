package com.example.hw8p5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent0 = new Intent(HistoryActivity.this, HomeActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.navigation_weather:
                        Intent intent1 = new Intent(HistoryActivity.this, DisplayActivity.class);
                        startActivity(intent1);
                    case R.id.navigation_map:
                        Intent intent2 = new Intent(HistoryActivity.this, MapActivity.class);
                        startActivity(intent2);

                }
                return true;
            }
        });
    }
}