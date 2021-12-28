package com.gmail.mateendev3.frags.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.gmail.mateendev3.frags.R;
import com.gmail.mateendev3.frags.activities.general.ScreenCalculator;
import com.gmail.mateendev3.frags.activities.general.ScreenUtility;

public class CalculateScreenSizeActivity extends AppCompatActivity {
    TextView tvShowPixels, tvShowDPPixels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_screen_size);
        tvShowDPPixels = findViewById(R.id.tv_show_dp_pixels);
        tvShowPixels = findViewById(R.id.tv_show_pixels);

        ScreenCalculator screenCalculator = new ScreenCalculator(this);
        tvShowPixels.setText(String.format("Width: %s, Height: %s",
                screenCalculator.getPixelsWidth(), screenCalculator.getPixelsHeight()));
        tvShowDPPixels.setText(String.format("WidthDP: %s, HeightDP: %s",
                screenCalculator.getPixelsWidthDP(), screenCalculator.getPixelsHeightDP()));
    }
}