package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DAI on 2017-08-07.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherID;

    private int cityID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}