package com.clark.weathertest.gson;

/**
 * Created by clark on 2017/5/18.
 */

public class AQI {
    public AQICity city;
    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
