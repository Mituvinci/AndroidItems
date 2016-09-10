package com.androiditems.mitu.androiditems.Searchable;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.androiditems.mitu.androiditems.R;

public class SearchActivity extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        result=(TextView)findViewById(R.id.textView1);
        this.setDefaultKeyMode(Activity.DEFAULT_KEYS_SEARCH_LOCAL);

        final Intent queryIntent = getIntent();
        final String queryAction = queryIntent.getAction();

        if(Intent.ACTION_SEARCH.equals(queryAction))
        {
            this.doSearchQuery(queryIntent);
        }
        else if (Intent.ACTION_VIEW.equals(queryAction))
        {
            this.doView(queryIntent);
        }
        else
        {
            Log.d("Intent", "Create intent NOT from search");
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        final String queryAction = intent.getAction();
        if (Intent.ACTION_SEARCH.equals(queryAction))
        {
            this.doSearchQuery(intent);
        }
        else if (Intent.ACTION_VIEW.equals(queryAction))
        {
            this.doView(intent);
        }    }

    public void doSearchQuery(Intent intent)
    {
        String queryString = intent.getDataString(); // from suggestions
        if (queryString == null)
        {
            queryString = intent.getStringExtra(SearchManager.QUERY);
            // from search-bar
        }

        finish();
    }
    public void doView(Intent intent)
    {
        Log.e("action view", " suggestion ");

    }
}
