package com.a.axeralate.scheduleautomatification;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.Preferences;

/**
 * Created by axeralate on 2014/11/03.
 */
public class AppPreferences extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String destination = SP.getString("destination", "tokyo");


    }
}
