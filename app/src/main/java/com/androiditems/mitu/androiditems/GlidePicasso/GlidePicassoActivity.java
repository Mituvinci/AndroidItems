package com.androiditems.mitu.androiditems.GlidePicasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.androiditems.mitu.androiditems.R;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class GlidePicassoActivity extends AppCompatActivity {
    private ImageView mGlideImageView;
    private ImageView mPiccasoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_picasso);

        mGlideImageView = (ImageView) findViewById(R.id.glideimageview);
        mPiccasoImageView = (ImageView) findViewById(R.id.piccasoimageview);
        Picasso.with(getApplicationContext())
                .load(R.drawable.muplay)
                .into(mPiccasoImageView);

        Glide.with(getApplicationContext())
                .load(R.drawable.muplay).centerCrop()
                .thumbnail(0.1f)
                .into(mGlideImageView);
    }
}
