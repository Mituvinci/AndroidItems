package com.androiditems.mitu.androiditems.GsonVolly;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by Hi on 12-Sep-16.
 */
public final class NetworkRequest {
    private static final String TAG = "NetworkRequest";
    public void getDealId(final Context context, final RequestCallback<ModelDemo> requestCallback) {
        String url = "http://api.ajkerdeal.com/DealDetails/GetDealDetails/334139";

        if(! Connectivity.isInternetConnected(context)) {
            Log.e(TAG, "getBanner: No Internet");
            return;
        }
        GsonRequest<ModelDemo> serviceCall = new GsonRequest<>(Request.Method.GET, url,
                ModelDemo.class, null, null, new Response.Listener<ModelDemo>() {
            @Override
            public void onResponse(ModelDemo response) {
                requestCallback.onSuccess(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "onErrorResponse: ", error);
            }
        });

        serviceCall.setRetryPolicy(NetworkRetryPolicy.getRetryPolicyForFiveSecond());
        Volley.getInstance(context).addToRequestQueue(serviceCall);

    }

}
