package com.androiditems.mitu.androiditems.MusicPlayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import com.androiditems.mitu.androiditems.R;

import java.util.Arrays;

public class MusicListActivity extends AppCompatActivity {
    ListView lv;
    String[] items;

    MediaPlayer mp;
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapterFirstWay mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        items =  SongsList.AllsongsOfMemory();
        mAdapter = new RecyclerViewAdapterFirstWay(getApplicationContext(), Arrays.asList(items));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new RecyclerViewAdapterFirstWay.customInterface() {
            @Override
            public void onItemClick(int position, View v) {
                Intent i = new Intent(getApplicationContext(),MusicPlayer.class);
                i.putExtra("position",position);
                startActivity(i);
            }
        });
        mRecyclerView.setNestedScrollingEnabled(false);

    }

}
