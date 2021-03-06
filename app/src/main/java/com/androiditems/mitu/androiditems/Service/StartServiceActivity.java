package com.androiditems.mitu.androiditems.Service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androiditems.mitu.androiditems.R;

public class StartServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_service);
    }

    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), StartService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), StartService.class));
    }

    public void  secondActivity(View view){

        startActivity(new Intent(getBaseContext(), BoundServiceActivity.class));
    }
}
