package com.gmail.mateendev3.frags.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;

import com.gmail.mateendev3.frags.R;
import com.gmail.mateendev3.frags.fragments.DetectSizeRes2Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ScreenSizeResActivity extends AppCompatActivity {
    boolean is620Width = false;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_size_res);

        ViewGroup viewGroup = findViewById(R.id.fragment_container_view_res_2);
        fab = findViewById(R.id.btn_floating_action);

        is620Width = viewGroup != null;

        fab.setOnClickListener(v ->  {
            show();
        });

    }

    private void show() {
        if (is620Width) {
            DetectSizeRes2Fragment fragment = new DetectSizeRes2Fragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container_view_res_2, fragment)
                    .commit();
        } else {
            Intent intent = new Intent(ScreenSizeResActivity.this, ScreenSizeRes2Activity.class);
            startActivity(intent);
        }
    }
}