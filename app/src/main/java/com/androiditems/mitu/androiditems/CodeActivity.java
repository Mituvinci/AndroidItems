package com.androiditems.mitu.androiditems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CodeActivity extends AppCompatActivity {
    private static final String FILE = "file";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
    }

    public void notification(View view){
        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"notification.txt");
        startActivity(i);

    }
    public void Search(View view){

    }
    public void MediaPlayer(View view){


    }
    public void splash(View view){

        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"SplashActivity.txt");
        startActivity(i);


    }

    public void camera(View view){

    }

    public void navigation(View view){

    }
    public void connectivity(View view){

        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"NetworkConnectivityActivity.txt");
        startActivity(i);

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