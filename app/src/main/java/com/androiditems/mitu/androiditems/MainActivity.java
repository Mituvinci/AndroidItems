package com.androiditems.mitu.androiditems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androiditems.mitu.androiditems.MusicPlayer.MusicListActivity;
import com.androiditems.mitu.androiditems.Navigation.NavigationDrawerActivity;
import com.androiditems.mitu.androiditems.Searchable.SearchActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void notification(View view){

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

    }
    public void service(View view){

    }
    public void broadcast(View view){

    }
    public void googlemap(View view){

    }
    public void sensor(View view){

    }
    public void security(View view){

    }
    public void animation(View view){

    }
    public void viewpager(View view){

    }
    public void sqlitedatabase(View view){

    }

    public void contentprovider(View view){

    }


    public void webapp(View view){

    }

    public void fcm(View view){

    }

    public void gcm(View view){

    }

    public void endlessrecycleview(View view){

    }

    public void voicesearch(View view){

    }

    public void retorfit(View view){

    }

    public void glide(View view){

    }
    public void toogleButton(View view){

    }

    public void facebooklogin(View view){

    }
    public void googleLogin(View view){

    }
    public void sharedprefarence(View view){

    }

    public void storedatainafile(View view){

    }


}
