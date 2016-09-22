package com.androiditems.mitu.androiditems.Handler;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.androiditems.mitu.androiditems.R;

public class HandlerActivity extends AppCompatActivity {
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            function();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        runnable.run();

    }

    public void function()
    {
        /*Toast.makeText(getBaseContext(),
                "test",
                Toast.LENGTH_SHORT).show();
        handler.postDelayed(runnable, 1);*/
    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}
