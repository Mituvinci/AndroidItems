package com.androiditems.mitu.androiditems.Retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.androiditems.mitu.androiditems.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RetrofitActivity extends AppCompatActivity {

    private Retrofit mRetrofit;
    private DistrictInterface mDistrictInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

        mRetrofit = RetrofitSingletone.getInstance(getApplicationContext());

        mDistrictInterface = mRetrofit.create(DistrictInterface.class);

        Call<List<DistrictsnIdsModel>> districts = mDistrictInterface.getDistrictIc();
        districts.enqueue(new Callback<List<DistrictsnIdsModel>>() {
            @Override
            public void onResponse(Call<List<DistrictsnIdsModel>> call, Response<List<DistrictsnIdsModel>> response) {
                if (response.isSuccessful() && response.body() != null){
                    Toast.makeText(getApplicationContext(),"Retorfit works",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<DistrictsnIdsModel>> call, Throwable t) {

            }
        });
    }
}
