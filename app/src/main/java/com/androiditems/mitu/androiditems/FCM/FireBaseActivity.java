package com.androiditems.mitu.androiditems.FCM;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androiditems.mitu.androiditems.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class FireBaseActivity extends AppCompatActivity {
    private TextView mShow;
    private Button mFoggy;
    private Button mSunny;
    Firebase myFirebaseRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_base);
        mShow = (TextView) findViewById(R.id.showweather);
        mFoggy = (Button) findViewById(R.id.foggy);
        mSunny = (Button) findViewById(R.id.sunny);
        //https://fir-test-8e54b.firebaseio.com/

        myFirebaseRef = new Firebase("https://androiditems-8305d.firebaseio.com/condition");

        myFirebaseRef.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println(snapshot.getValue());
                String data = snapshot.getValue(String.class);
                Log.d("hell11",data);
                mShow.setText(data);

            }

            @Override
            public void onCancelled(FirebaseError error) {
            }

        });

        mFoggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFirebaseRef.setValue("Foggy");
            }
        });

        mSunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFirebaseRef.setValue("Sunny");

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
