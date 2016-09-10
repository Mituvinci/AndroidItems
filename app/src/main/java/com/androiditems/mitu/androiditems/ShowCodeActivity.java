package com.androiditems.mitu.androiditems;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowCodeActivity extends AppCompatActivity {
    private TextView mTextView;
    private String mString;
    private static final String FILE = "file";
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_code);
        mTextView = (TextView) findViewById(R.id.codeText);
        mToolbar = (Toolbar) findViewById(R.id.toolbarfordealdetails);
        TextView TitleTextView = (TextView) findViewById(R.id.toolbarTitle);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String file = bundle.getString(FILE, "");
        Log.d("file name : ", file);
        TitleTextView.setText(file);
        try {
            mString =  readFromAssets(getApplicationContext(),file);
            mTextView.setText(mString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readFromAssets(Context context, String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(context.getAssets().open(filename)));

        // do reading, usually loop until end of file reading
        StringBuilder sb = new StringBuilder();
        String mLine = reader.readLine();
        int i=0;
        while (mLine != null) {
            sb.append(mLine+"\n"); // process line
            mLine = reader.readLine();
            // Log.d("mLine",mLine);

        }
        reader.close();
        return sb.toString();
    }
}
