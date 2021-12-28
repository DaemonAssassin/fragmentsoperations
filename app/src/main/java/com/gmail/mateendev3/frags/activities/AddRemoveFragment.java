package com.gmail.mateendev3.frags.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gmail.mateendev3.frags.R;
import com.gmail.mateendev3.frags.fragments.FragmentOne;

public class AddRemoveFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_fragment);

        //Basic Type
        findViewById(R.id.btn_add_fragment)
                .setOnClickListener(v -> {
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.fragmentContainerView, new FragmentOne(), "Frag_1")
                            .commit();
                });

        findViewById(R.id.btn_delete_fragment)
                .setOnClickListener(v -> {
                    FragmentOne one = (FragmentOne) getSupportFragmentManager().findFragmentByTag("Frag_1");
                    getSupportFragmentManager().beginTransaction()
                            .remove(one)
                            .commit();
                });

        //Advance Type
        /*
        findViewById(R.id.btn_add_fragment)
                .setOnClickListener(v -> {
                    if (getSupportFragmentManager().findFragmentByTag("Frag_1") == null) {
                        getSupportFragmentManager().beginTransaction()
                                .add(R.id.fragmentContainerView, new FragmentOne(), "Frag_1")
                                .commit();
                    }
                });

        findViewById(R.id.btn_delete_fragment)
                .setOnClickListener(v -> {
                    FragmentOne one = (FragmentOne) getSupportFragmentManager().findFragmentByTag("Frag_1");
                    if (one != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(one)
                                .commit();
                    }
                });
                */
    }
}