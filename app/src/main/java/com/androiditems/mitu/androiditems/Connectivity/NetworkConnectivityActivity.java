package com.androiditems.mitu.androiditems.Connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.androiditems.mitu.androiditems.R;

public class NetworkConnectivityActivity extends AppCompatActivity {
    public static final String TAG = "Basic Network Demo";
    // Whether there is a Wi-Fi connection.
    private static boolean wifiConnected = false;
    // Whether there is a mobile connection.
    private static boolean mobileConnected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_connectivity);
        checkNetworkConnection();
    }

    private void checkNetworkConnection() {
        ConnectivityManager connMgr =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();
        if (activeInfo != null && activeInfo.isConnected()) {
            wifiConnected = activeInfo.getType() == ConnectivityManager.TYPE_WIFI;
            mobileConnected = activeInfo.getType() == ConnectivityManager.TYPE_MOBILE;
            if(wifiConnected) {
                Toast.makeText(getBaseContext(), "wifi_connection",Toast.LENGTH_SHORT).show();
            } else if (mobileConnected){
                Toast.makeText(getBaseContext(),  "mobile_connection",Toast.LENGTH_SHORT).show();;
            }
        } else {
            Toast.makeText(getBaseContext(),  "no_wifi_or_mobile",Toast.LENGTH_SHORT).show();;

        }
    }
}
