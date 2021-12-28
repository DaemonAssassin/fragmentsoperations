package com.gmail.mateendev3.frags.activities.general;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenCalculator {
    //declaring members
    private final float pixelsHeight;
    private final float pixelsWidth;
    private final float pixelsHeightDP;
    private final float pixelsWidthDP;

    public ScreenCalculator(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        Display display = activity.getWindowManager().getDefaultDisplay();
        display.getMetrics(metrics);

        pixelsWidth = metrics.widthPixels;
        pixelsHeight = metrics.heightPixels;

        float density = metrics.density;

        pixelsWidthDP = pixelsWidth/density;
        pixelsHeightDP = pixelsHeight/density;
    }

    public float getPixelsHeight() {
        return pixelsHeight;
    }

    public float getPixelsWidth() {
        return pixelsWidth;
    }

    public float getPixelsHeightDP() {
        return pixelsHeightDP;
    }

    public float getPixelsWidthDP() {
        return pixelsWidthDP;
    }
}
