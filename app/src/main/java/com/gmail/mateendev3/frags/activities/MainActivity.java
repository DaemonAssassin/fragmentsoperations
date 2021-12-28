package com.gmail.mateendev3.frags.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gmail.mateendev3.frags.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_add_remove_fragment).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddRemoveFragment.class));
        });
        findViewById(R.id.btn_send_data_to_fragment).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SendDataToFragment.class));
        });
        findViewById(R.id.btn_find_screen_size).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, CalculateScreenSizeActivity.class));
        });
        findViewById(R.id.btn_find_screen_size_res).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ScreenSizeResActivity.class));
        });
    }
}