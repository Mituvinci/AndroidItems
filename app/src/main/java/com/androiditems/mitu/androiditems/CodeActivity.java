package com.androiditems.mitu.androiditems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CodeActivity extends AppCompatActivity {
    private static final String FILE = "file";
    private LinearLayout mLoginLinearLayout;
    private LinearLayout mLoginInnerLinearLayout;
    private LinearLayout mLinearLayoutMusic;
    private LinearLayout mLinearLayoutInnerMusic;
    private TextView mJustShowermusicTextView;
    private TextView mMusicPlayerTextView;
    private TextView mMusicListTextView;
    private TextView mGettingMusicTextView;
    private TextView mRecyclerAdapterTextView;

    private TextView mLoginActivityTextView;
    private TextView mLoginSessionManagerTextView;
    private TextView mJustShowTextView;


    private LinearLayout mVollyMainLinearLayout;
    private LinearLayout mVollyInnerLineaLayout;
    private TextView mJustShowVollyTextViewl;
    private TextView mGsonTextView;
    private TextView mGsonVollyActivityTextView;
    private TextView mNetworkRequestTextView;
    private TextView mVollyTextView;
    private TextView mRequestCallbackTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        mLoginLinearLayout = (LinearLayout) findViewById(R.id.loginlinearlayout);
        mLoginInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearLogin);
        mLoginActivityTextView = (TextView) findViewById(R.id.loginTextview);
        mLoginSessionManagerTextView = (TextView) findViewById(R.id.sessionmanagerTextview);
        mJustShowTextView = (TextView) findViewById(R.id.justshowtext);


        mLinearLayoutMusic = (LinearLayout) findViewById(R.id.musicLinearlayout);
        mLinearLayoutInnerMusic = (LinearLayout) findViewById(R.id.innerlinearMusic);
        mJustShowermusicTextView = (TextView) findViewById(R.id.justshowmusictext);
        mMusicPlayerTextView = (TextView) findViewById(R.id.medialPlayerTextview);
        mMusicListTextView = (TextView) findViewById(R.id.musiclistTextView);
        mGettingMusicTextView = (TextView) findViewById(R.id.SongListTextView);
        mRecyclerAdapterTextView = (TextView) findViewById(R.id.recyclerAdapterTextview);

        mVollyMainLinearLayout = (LinearLayout) findViewById(R.id.gsonVollyTextView);
        mVollyInnerLineaLayout = (LinearLayout) findViewById(R.id.innerlinearVolly);
        mGsonTextView = (TextView) findViewById(R.id.gsonrequestTextview);
        mJustShowVollyTextViewl = (TextView) findViewById(R.id.justshowvollyTextview);
        mGsonVollyActivityTextView = (TextView) findViewById(R.id.vollyActivityTextview);
        mNetworkRequestTextView = (TextView) findViewById(R.id.getNetworkTextview);
        mVollyTextView = (TextView) findViewById(R.id.vollyTextview);
        mRequestCallbackTextView = (TextView) findViewById(R.id.requestCallbackTextview);


        volly();
        login();
        music();
    }

    public void volly(){
        mVollyMainLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mVollyInnerLineaLayout.setVisibility(View.VISIBLE);
                mJustShowVollyTextViewl.setVisibility(View.GONE);
            }
        });

        mGsonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "GsonRequest.txt");
                startActivity(i);
            }
        });

        mGsonVollyActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "GsonVollyActivity.txt");
                startActivity(i);
            }
        });

        mVollyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "Volley.txt");
                startActivity(i);
            }
        });
        mNetworkRequestTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "NetworkRequest.txt");
                startActivity(i);
            }
        });
        mRequestCallbackTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "RequestCallback.txt");
                startActivity(i);
            }
        });
    }

    public void music(){

        mLinearLayoutMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             /*   mMusicPlayerTextView.setVisibility(View.VISIBLE);
                mMusicListTextView.setVisibility(View.VISIBLE);
                mGettingMusicTextView.setVisibility(View.VISIBLE);
                mRecyclerAdapterTextView.setVisibility(View.VISIBLE);
                mJustShowermusicTextView.setVisibility(View.GONE);*/

                mLinearLayoutInnerMusic.setVisibility(View.VISIBLE);
                mJustShowermusicTextView.setVisibility(View.GONE);
            }
        });

        mMusicPlayerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "MusicPlayer.txt");
                startActivity(i);
            }
        });

        mMusicListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "MusicListActivity.txt");
                startActivity(i);
            }
        });

        mGettingMusicTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "SongsList.txt");
                startActivity(i);
            }
        });
        mRecyclerAdapterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "RecyclerViewAdapterFirstWay.txt");
                startActivity(i);
            }
        });
    }

    public void login(){
        mLoginLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mLoginInnerLinearLayout.setVisibility(View.VISIBLE);
                mJustShowTextView.setVisibility(View.GONE);

            }
        });

        mLoginSessionManagerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "SessionManager.txt");
                startActivity(i);
            }
        });

        mLoginActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "LoginActivity.txt");
                startActivity(i);
            }
        });
    }

    public void notification(View view){
        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"notification.txt");
        startActivity(i);

    }
    public void Search(View view){

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
        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"ViewPagerActivity.txt");
        startActivity(i);
    }
    public void sqliteDatabase(View view){

    }

    public void contentProvider(View view){

    }


    public void webApp(View view){

    }

    public void fcm(View view){

    }



    public void endlessRecycleview(View view){

    }

    public void voiceSearch(View view){

    }

    public void retrofit(View view){

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

}
