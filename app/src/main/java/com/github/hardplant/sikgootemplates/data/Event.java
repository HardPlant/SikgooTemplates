package com.github.hardplant.sikgootemplates.data;

import android.graphics.drawable.Drawable;

import com.github.hardplant.sikgootemplates.R;

import java.util.Date;

/**
 * Created by KANG on 2018-01-21.
 */

public class Event {
    String name;
    String content;
    Date startDate;
    Date endDate;
    int image;

    public Event(String name, String content, Date startDate, Date endDate) {
        this.name = name;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getImage() {
        return image;
    }

    public Event setTestImage() {
        this.image = R.drawable.people_example;
        return this;
    }
}
