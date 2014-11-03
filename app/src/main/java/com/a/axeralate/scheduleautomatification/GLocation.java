package com.a.axeralate.scheduleautomatification;

/**
 * Created by th on 2014/11/03.
 */
import java.util.List;
public class GLocation {
    private double lat;
    private double lng;

    public GLocation() {
        lat = 0.0;
        lng = 0.0;
    }

    public GLocation(double latitude, double longitude) {
        this.lat = latitude;
        this.lng = longitude;
    }

    public void setLocation(double latitude, double longitude) {
        this.lat = latitude;
        this.lng = longitude;
    }

    public void setLatitude(double latitude) {
        this.lat = latitude;
    }

    public void setLongitude(double longitude) {
        this.lng = longitude;
    }

    public double getLatitude() {
        return lat;
    }

    public double getLongitude() {
        return lng;
    }

    public int getLatitudeE6() {
        return (int)(lat * 1E6);
    }

    public int getLongitudeE6() {
        return (int)(lng *1E6);
    }

}