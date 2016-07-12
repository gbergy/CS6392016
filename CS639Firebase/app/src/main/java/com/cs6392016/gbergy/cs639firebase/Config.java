package com.cs6392016.gbergy.cs639firebase;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by gbergy on 7/11/16.
 */
public class Config extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
