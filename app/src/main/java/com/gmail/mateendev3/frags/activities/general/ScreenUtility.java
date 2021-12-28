package com.gmail.mateendev3.frags.activities.general;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenUtility {
    private final double mPixelHeight;
    private final double mPixelWidth;
    private final double mDPPixelWidth;
    private final double mDPPixelHeight;

    public ScreenUtility(Activity activity) {

        //DisplayMetrics: A structure describing general information about a display, such as its size, density, and font scaling.
        DisplayMetrics metrics = activity.getResources().getDisplayMetrics();
       /*
       //Second Way
        DisplayMetrics metrics = new DisplayMetrics();
        //Display: Provides information about the size and density of a logical display.
        Display display = activity.getWindowManager().getDefaultDisplay();
        display.getMetrics(metrics);
        */
        mPixelHeight = metrics.heightPixels;
        mPixelWidth = metrics.widthPixels;


        double density = metrics.density;
        //double density = activity.getResources().getDisplayMetrics().density;
        mDPPixelWidth = mPixelWidth/density;
        mDPPixelHeight = mPixelHeight/density;
    }

    public double getPixelHeight() {
        return mPixelHeight;
    }

    public double getPixelWidth() {
        return mPixelWidth;
    }

    public double getDPPixelWidth() {
        return mDPPixelWidth;
    }

    public double getDPPixelHeight() {
        return mDPPixelHeight;
    }
}
