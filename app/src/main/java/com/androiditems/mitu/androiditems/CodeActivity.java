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

    private LinearLayout mBroadcastMainLinearlayout;
    private LinearLayout mBroadcastInnerLinearLayout;
    private TextView mJustShowBroadcastTextView;
    private TextView mManifestTextView;
    private TextView mBroadCastTextView;
    private TextView mBroadCastRecieverTextView;


    private LinearLayout mPushnotificationMainLinearlayout;
    private LinearLayout mPushnotificationInnerLinearLayout;
    private TextView mJustShowPushnotificationTextView;
    private TextView mManifestPushnotificationTextView;
    private TextView mPushnotificationActivityTextView;
    private TextView mPushnotificationInstanceIdTextView;
    private TextView mPushnotificationMessagingTextView;

    private LinearLayout mSqLiteMainLinearlayout;
    private LinearLayout mSqLiteInnerLinearLayout;
    private TextView mJustShowSqLiteTextView;
    private TextView mSqLiteActivityMainTextView;
    private TextView mSqLiteAddActivityTextView;
    private TextView mSqLiteDatabaseHelperTextView;


    private LinearLayout mServiceMainLinearlayout;
    private LinearLayout mServiceInnerLinearLayout;
    private TextView mJustServiceTextView;
    private TextView mStartServiceActivityMainTextView;
    private TextView mStartServiceTextView;
    private TextView mBoundServiceActivityTextView;
    private TextView mBoundServiceTextView;

    private LinearLayout mSensorMainLinearlayout;
    private LinearLayout mSensorInnerLinearLayout;
    private TextView mJustSensorTextView;
    private TextView mSensorActivityMainTextView;
    private TextView mAccelerometerListenerTextView;
    private TextView mAccelerometerManagerTextView;

    private LinearLayout mContentProviderMainLinearlayout;
    private LinearLayout mContentProviderInnerLinearLayout;
    private TextView mJustContentproviderTextView;
    private TextView mContentProviderActivityMainTextView;
    private TextView mContentProviderManifestTextView;
    private TextView mContentProviderTextView;


    private LinearLayout mRetrofitLinearlayout;
    private LinearLayout mRetrofitInnerLinearLayout;
    private TextView mRetrofitTextView;
    private TextView mRetrofitActivityMainTextView;
    private TextView mRetrofitSingletonTextView;


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


        mBroadcastMainLinearlayout = (LinearLayout) findViewById(R.id.BroadcastLinearLayout);
        mBroadcastInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearBroadcast);
        mJustShowBroadcastTextView = (TextView) findViewById(R.id.justshowBroadcastTextview);
        mManifestTextView = (TextView) findViewById(R.id.BroadcasManifestTextview);
        mBroadCastTextView = (TextView) findViewById(R.id.BroadcastActivityTextview);
        mBroadCastRecieverTextView = (TextView) findViewById(R.id.BroadcastRecieverTextview);


        mPushnotificationMainLinearlayout = (LinearLayout) findViewById(R.id.pushnotificationLinearlayout);
        mPushnotificationInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearpushnotification);
        mJustShowPushnotificationTextView = (TextView) findViewById(R.id.justshopushnotificationTextview);
        mManifestPushnotificationTextView = (TextView) findViewById(R.id.firabseManifestTextview);
        mPushnotificationActivityTextView = (TextView) findViewById(R.id.pushActivityTextview);
        mPushnotificationInstanceIdTextView = (TextView) findViewById(R.id.firebaseInstanceidTextview);
        mPushnotificationMessagingTextView = (TextView) findViewById(R.id.firebaseMessagingTextview);

        mSqLiteMainLinearlayout = (LinearLayout) findViewById(R.id.sqlitemainLinear);
        mSqLiteInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearSqlite);
        mJustShowSqLiteTextView = (TextView) findViewById(R.id.justoShowTextview);
        mSqLiteActivityMainTextView = (TextView) findViewById(R.id.DatabaseActivityTextview);
        mSqLiteAddActivityTextView = (TextView) findViewById(R.id.DhbeHelperTextview);
        mSqLiteDatabaseHelperTextView = (TextView) findViewById(R.id.AddActivityTextview);



        mServiceMainLinearlayout = (LinearLayout) findViewById(R.id.ServiceMainLinearlayout);
        mServiceInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearServiceTextView);
        mJustServiceTextView = (TextView) findViewById(R.id.justtshowServiceTextview);
        mStartServiceActivityMainTextView = (TextView) findViewById(R.id.startServiceActivityTextview);
        mStartServiceTextView = (TextView) findViewById(R.id.startserviceTextview);
        mBoundServiceActivityTextView = (TextView) findViewById(R.id.boundserviceactivityTextview);
        mBoundServiceTextView = (TextView) findViewById(R.id.boundserviceTextview);


        mSensorMainLinearlayout = (LinearLayout) findViewById(R.id.SensorMainLinearlayout);
        mSensorInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearsensorTextView);
        mJustSensorTextView = (TextView) findViewById(R.id.justtsensorTextview);
        mSensorActivityMainTextView = (TextView) findViewById(R.id.sensoractivityTextview);
        mAccelerometerListenerTextView = (TextView) findViewById(R.id.accelerometerListenerTextview);
        mAccelerometerManagerTextView = (TextView) findViewById(R.id.accelerometermanagerTextview);


        mContentProviderMainLinearlayout = (LinearLayout) findViewById(R.id.contentprovideLinearLayout);
        mContentProviderInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearcontentproviderTextView);
        mJustContentproviderTextView = (TextView) findViewById(R.id.justshowcontentproviderTextview);
        mContentProviderActivityMainTextView = (TextView) findViewById(R.id.contentProvidersactivityTextview);
        mContentProviderManifestTextView = (TextView) findViewById(R.id.contentProvidersmanifestTextview);
        mContentProviderTextView = (TextView) findViewById(R.id.contentProvidersTextview);


        mRetrofitLinearlayout = (LinearLayout) findViewById(R.id.retrofitLinearlayout);
        mRetrofitInnerLinearLayout = (LinearLayout) findViewById(R.id.innerlinearretrofit);
        mRetrofitTextView = (TextView) findViewById(R.id.retrofitTextview);
        mRetrofitActivityMainTextView = (TextView) findViewById(R.id.retrofitactivityTextview);
        mRetrofitSingletonTextView = (TextView) findViewById(R.id.retrofitSingltonTextview);

        retrofit();
        contentProvider();
        sensor();
        service();
        sqLiteDatabase();
        pushNotification();
        broadcast();
        volly();
        login();
        music();
    }


    public void retrofit(){

        mRetrofitLinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mRetrofitInnerLinearLayout.setVisibility(View.VISIBLE);
                mRetrofitTextView.setVisibility(View.GONE);
            }
        });

        mRetrofitActivityMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "RetrofitActivity.txt");
                startActivity(i);
            }
        });

        mRetrofitSingletonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "RetrofitSingletone.txt");
                startActivity(i);
            }
        });



    }
    public void contentProvider(){

        mContentProviderMainLinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mContentProviderInnerLinearLayout.setVisibility(View.VISIBLE);
                mJustContentproviderTextView.setVisibility(View.GONE);
            }
        });

        mContentProviderActivityMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "ContentProviderActivity.txt");
                startActivity(i);
            }
        });

        mContentProviderManifestTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "ContentProviderAndroidManifest.txt");
                startActivity(i);
            }
        });

        mContentProviderTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "MyProvider.txt");
                startActivity(i);
            }
        });





    }

    public void sensor(){

        mSensorMainLinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mSensorInnerLinearLayout.setVisibility(View.VISIBLE);
                mJustSensorTextView.setVisibility(View.GONE);
            }
        });

        mSensorActivityMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "SensorActivity.txt");
                startActivity(i);
            }
        });

        mAccelerometerListenerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "AccelerometerListener.txt");
                startActivity(i);
            }
        });

        mAccelerometerManagerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "AccelerometerManager.txt");
                startActivity(i);
            }
        });





    }
    public void service(){

        mServiceMainLinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mServiceInnerLinearLayout.setVisibility(View.VISIBLE);
                mJustServiceTextView.setVisibility(View.GONE);
            }
        });

        mStartServiceActivityMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "StartServiceActivity.txt");
                startActivity(i);
            }
        });

        mStartServiceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "StartService.txt");
                startActivity(i);
            }
        });

        mBoundServiceActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "BoundServiceActivity.txt");
                startActivity(i);
            }
        });

        mBoundServiceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "BoundService.txt");
                startActivity(i);
            }
        });



    }
    public void sqLiteDatabase(){

        mSqLiteMainLinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mSqLiteInnerLinearLayout.setVisibility(View.VISIBLE);
                mJustShowSqLiteTextView.setVisibility(View.GONE);
            }
        });

        mSqLiteActivityMainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "DataBaseActivity.txt");
                startActivity(i);
            }
        });

        mSqLiteAddActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "AddActivity.txt");
                startActivity(i);
            }
        });

        mSqLiteDatabaseHelperTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "DBHelper.txt");
                startActivity(i);
            }
        });



    }

    public void pushNotification(){

        mPushnotificationMainLinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPushnotificationInnerLinearLayout.setVisibility(View.VISIBLE);
                mJustShowPushnotificationTextView.setVisibility(View.GONE);
            }
        });

        mManifestPushnotificationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "AndroidManifestFirebase.txt");
                startActivity(i);
            }
        });

        mPushnotificationActivityTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "MainActivityFirebase.txt");
                startActivity(i);
            }
        });

        mPushnotificationInstanceIdTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "MyFirebaseInstanceIDService.txt");
                startActivity(i);
            }
        });

        mPushnotificationMessagingTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "MyFirebaseMessagingService.txt");
                startActivity(i);
            }
        });

    }

    public void broadcast(){

        mBroadcastMainLinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mBroadcastInnerLinearLayout.setVisibility(View.VISIBLE);
                mJustShowBroadcastTextView.setVisibility(View.GONE);
            }
        });

        mManifestTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "AndroidManifest.txt");
                startActivity(i);
            }
        });

        mBroadCastTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
                i.putExtra(FILE, "BroadCastActivity.txt");
                startActivity(i);
            }
        });

        mBroadCastRecieverTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ShowCodeActivity.class);
                i.putExtra(FILE, "BroadCastReceiver.txt");
                startActivity(i);
            }
        });

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

    public void googleMap(View view){

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





    public void webApp(View view){

    }





    public void endlessRecycleview(View view){

    }

    public void voiceSearch(View view){

    }

    public void retrofit(View view){

    }



    public void json(View view){
        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"HttpurlConnectionActivity.txt");
        startActivity(i);
    }

    public void glide(View view){
        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"GlidePicassoActivity.txt");
        startActivity(i);
    }
    public void toggleButton(View view){

    }

    public void facebookLogin(View view){

    }
    public void googleLogin(View view){

    }
    public void sharedPreference(View view){

        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"SharedpreferanceActivity.txt");
        startActivity(i);

    }


    public void handler(View view){

        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"HandlerActivity.txt");
        startActivity(i);

    }

    public void dialog(View view){

    }

    public void storeDatainaFile(View view){
        Intent i = new Intent(getApplicationContext(),ShowCodeActivity.class);
        i.putExtra(FILE,"ShowCodeActivity.txt");
        startActivity(i);
    }

}
