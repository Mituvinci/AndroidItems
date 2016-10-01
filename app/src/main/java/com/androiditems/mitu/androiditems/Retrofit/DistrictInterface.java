package com.androiditems.mitu.androiditems.Retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mitu on 10/1/16.
 */

public interface DistrictInterface {

    @GET("/CustomersOrder/GetDistricts")
    Call<List<DistrictsnIdsModel>> getDistrictIc();

}
