package com.androiditems.mitu.androiditems.Login;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by Hi on 11-Sep-16.
 */
public class SessionManager {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;
    private int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "mitupref";
    public static final String VALUE = "value";

    public SessionManager(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void store(String cavule) {
        // Storing login value as TRUE
        editor.putString(VALUE, cavule);
        editor.commit();
    }

    public HashMap<String, String> getValue() {
        HashMap<String, String> user = new HashMap<String, String>();
        // user password
        user.put(VALUE, pref.getString(VALUE, ""));

        return user;
    }

    }
