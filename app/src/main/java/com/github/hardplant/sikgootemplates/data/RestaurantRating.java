package com.github.hardplant.sikgootemplates.data;

import java.util.Date;

/**
 * Created by KANG on 2018-01-13.
 */

public class RestaurantRating {
    int rating;
    String content;
    Date date;

    public RestaurantRating(int rating, String content, Date date) {
        this.rating = rating;
        this.content = content;
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date.toString();
    }
}
