package com.androiditems.mitu.androiditems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androiditems.mitu.androiditems.MusicPlayer.MusicListActivity;
import com.androiditems.mitu.androiditems.Navigation.NavigationDrawerActivity;
import com.androiditems.mitu.androiditems.Searchable.SearchActivity;


public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

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
}
