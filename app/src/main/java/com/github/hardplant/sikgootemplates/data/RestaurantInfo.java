package com.github.hardplant.sikgootemplates.data;

/**
 * Created by KANG on 2018-01-11.
 */

public class RestaurantInfo {
    int id;
    String name;

    public RestaurantInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
