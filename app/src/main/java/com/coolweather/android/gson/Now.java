package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DAI on 2017-08-07.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    private class More {

        @SerializedName("txt")
        public String info;
    }
}
