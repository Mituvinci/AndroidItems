package com.androiditems.mitu.androiditems.GsonVolly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.androiditems.mitu.androiditems.R;

public class GsonVollyActivity extends AppCompatActivity {
    private TextView mshowdealId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_volly);
        mshowdealId = (TextView) findViewById(R.id.showdealId);

        new NetworkRequest().getDealId(this, new RequestCallback<ModelDemo>() {
            @Override
            public void onSuccess(ModelDemo data) {
                Log.d("dealid",data.getDealId()+"");
                mshowdealId.setText(data.getDealId()+"");
            }
        });
    }
}
