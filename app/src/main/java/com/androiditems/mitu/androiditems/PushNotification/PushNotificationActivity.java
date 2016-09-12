package com.androiditems.mitu.androiditems.PushNotification;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.androiditems.mitu.androiditems.R;

public class PushNotificationActivity extends AppCompatActivity {
    Button mPushButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_notification);
        mPushButton = (Button) findViewById(R.id.pushnotificationButton);
        mPushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
