package com.github.hardplant.sikgootemplates.data;

import com.github.hardplant.sikgootemplates.R;

/**
 * Created by KANG on 2018-01-21.
 */

public class TodayRestaurant {
    int id;
    String content;
    RestaurantInfo restaurantInfo;

    public TodayRestaurant(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public RestaurantInfo getRestaurantInfo() {
        return restaurantInfo;
    }
    public TodayRestaurant setTestId(){
        this.id = R.drawable.rest_example;
        return this;
    }
}
