package com.androiditems.mitu.androiditems.DeviceId;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import android.widget.TextView;

import com.androiditems.mitu.androiditems.R;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;

public class DeviceIdActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_id);

        final TelephonyManager telephonyManagerm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        TextView textViewDeviceId = (TextView) findViewById(R.id.TextViewdeviceId);
        TextView textViewWifiaddress = (TextView) findViewById(R.id.TextViewwifimacAddress);
        TextView textViewLocalAddress = (TextView) findViewById(R.id.TextViewlocalAddress);

        final String tmDevice, tmSerial, androidId;
        tmDevice = "" + telephonyManagerm.getDeviceId();
        tmSerial = "" + telephonyManagerm.getSimSerialNumber();
        androidId = "" + android.provider.Settings.Secure.getString(getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);

        UUID deviceUuid = new UUID(androidId.hashCode(), ((long)tmDevice.hashCode() << 32) | tmSerial.hashCode());
        String deviceId = deviceUuid.toString();

        WifiManager wm = (WifiManager) getSystemService(WIFI_SERVICE);
        String ip = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());


        String localip = getLocalIpAddress();

        String android_id = Settings.Secure.getString(this.getContentResolver(),
                Settings.Secure.ANDROID_ID);

        textViewDeviceId.setText(android_id);
        textViewWifiaddress.setText(ip);
        textViewLocalAddress.setText(localip);




    }

    public String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        String ip = Formatter.formatIpAddress(inetAddress.hashCode());
                      //  Log.i(TAG, "***** IP="+ ip);
                        return ip;
                    }
                }
            }
        } catch (SocketException ex) {
           // Log.e(TAG, ex.toString());
        }
        return null;
    }
}
