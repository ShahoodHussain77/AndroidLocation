package com.example.gpslocation;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {

    private static MyApplication singleTon;

    private List<Location> myLocations;

    public List<Location> getMyLocations() {
        return myLocations;
    }

    public void setMyLocation(List<Location> myLocations) {
        this.myLocations = myLocations;
    }

    public MyApplication getInstance() {
        return singleTon;
    }

    public void onCreate() {
        super.onCreate();
        singleTon = this;
        myLocations = new ArrayList<>();

    }
}
