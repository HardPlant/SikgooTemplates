package com.github.hardplant.sikgootemplates.data;

import com.github.hardplant.sikgootemplates.R;

/**
 * Created by KANG on 2018-01-11.
 */

public class RestaurantInfo {
    String name;
    int id;

    public RestaurantInfo(String name) {
        this.id = R.drawable.rest_example;
        this.name = name;
    }

    public RestaurantInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
