package com.androiditems.mitu.androiditems.Splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.androiditems.mitu.androiditems.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ProgressBar pb =(ProgressBar) findViewById(R.id.progressplash);
        pb.setMax(5500);
        Thread thread = new Thread(){
            @Override
            public void run() {
               int cur = 100;
                int end =2500;
                try {
                    sleep(2500);
                    while (cur<end){
                        cur +=1000;
                        sleep(cur);

                        finish();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread.start();


    }
}
