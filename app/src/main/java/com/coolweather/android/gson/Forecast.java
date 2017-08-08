package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DAI on 2017-08-07.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperation temperation;

    @SerializedName("cond")
    public More more;

    public class Temperation {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
