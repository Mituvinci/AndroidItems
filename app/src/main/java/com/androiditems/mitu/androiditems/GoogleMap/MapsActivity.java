package com.androiditems.mitu.androiditems.GoogleMap;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.androiditems.mitu.androiditems.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
       /* LatLng sydney = new LatLng(23.7615828, 90.3879828);
        mMap.addMarker(new MarkerOptions().position(sydney).title("আমার বাড়ি"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
*/
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(23.7615828, 90.3879828), 14));
        mMap.addMarker(new MarkerOptions().position(new LatLng(23.7615828, 90.3879828)).title("Amar Bari"));
    }
}
