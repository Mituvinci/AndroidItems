package com.androiditems.mitu.androiditems.FCM;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Hi on 12-Sep-16.
 */
public class AndroidItems extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
