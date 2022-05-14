package com.beckytech.galatagooftaa;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/** The Application class that manages AppOpenManager. */
public class MyApplication extends Application {

    private static AppOpenManager appOpenManager;

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(
                this,
                initializationStatus -> {
                });

        appOpenManager = new AppOpenManager(this);
    }
}