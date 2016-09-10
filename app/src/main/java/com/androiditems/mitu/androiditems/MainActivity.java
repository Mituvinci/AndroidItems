package com.androiditems.mitu.androiditems;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androiditems.mitu.androiditems.Connectivity.NetworkConnectivityActivity;
import com.androiditems.mitu.androiditems.MusicPlayer.MusicListActivity;
import com.androiditems.mitu.androiditems.Navigation.NavigationDrawerActivity;
import com.androiditems.mitu.androiditems.Searchable.SearchActivity;
import com.androiditems.mitu.androiditems.Splash.SplashActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void notification(View view){
        Intent intent = new Intent(MainActivity.this,MusicListActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);
        notificationBuilder.setSmallIcon(R.drawable.ic_launcher);
        notificationBuilder.setContentIntent(pendingIntent);
        notificationBuilder.setAutoCancel(true);
        notificationBuilder.setContentTitle("Title");
        notificationBuilder.setContentText("Content Text");
        notificationBuilder.setSubText("Sub Text");
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1, notificationBuilder.build());
    }
    public void Search(View view){

        startActivity(new Intent(MainActivity.this, SearchActivity.class));
    }
    public void MediaPlayer(View view){
        startActivity(new Intent(MainActivity.this, MusicListActivity.class));

    }
    public void splash(View view){

        startActivity(new Intent(MainActivity.this, SplashActivity.class));

    }

    public void camera(View view){

    }

    public void navigation(View view){
        startActivity(new Intent(MainActivity.this,NavigationDrawerActivity.class));
    }
    public void connectivity(View view){
        startActivity(new Intent(MainActivity.this,NetworkConnectivityActivity.class));


    }
    public void service(View view){

    }
    public void broadcast(View view){

    }
    public void googleMap(View view){

    }
    public void sensor(View view){

    }
    public void security(View view){

    }
    public void animation(View view){

    }
    public void viewpager(View view){

    }
    public void sqliteDatabase(View view){

    }

    public void contentProvider(View view){

    }


    public void webApp(View view){

    }

    public void fcm(View view){

    }

    public void gcm(View view){

    }

    public void endlessRecycleview(View view){

    }

    public void voiceSearch(View view){

    }

    public void retrofit(View view){

    }

    public void volly(View view){

    }

    public void json(View view){

    }

    public void glide(View view){

    }
    public void toggleButton(View view){

    }

    public void facebookLogin(View view){

    }
    public void googleLogin(View view){

    }
    public void sharedPreference(View view){

    }

    public void dialog(View view){

    }

    public void storeDatainaFile(View view){

    }
    public void login(View view){

    }

}
