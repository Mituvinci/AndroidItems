package com.androiditems.mitu.androiditems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androiditems.mitu.androiditems.MusicPlayer.MusicListActivity;
import com.androiditems.mitu.androiditems.Searchable.SearchActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
