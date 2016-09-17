package com.androiditems.mitu.androiditems.Sensor;

/**
 * Created by Hi on 14-Sep-16.
 */
public interface AccelerometerListener {


    public void onAccelerationChanged(float x, float y, float z);

    public void onShake(float force);
}
