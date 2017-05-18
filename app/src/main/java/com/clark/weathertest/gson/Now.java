package com.clark.weathertest.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by clark on 2017/5/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
