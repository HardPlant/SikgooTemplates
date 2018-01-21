package com.github.hardplant.sikgootemplates.data;

import android.media.Image;
import android.support.v4.util.Pair;

/**
 * Created by KANG on 2018-01-21.
 */

public class ChatMessage {
    private People people;
    private String message;
    private Image image;
    private Pair<Double, Double> GPS;
    boolean is_me;

    public ChatMessage(People people, String message) {
        this.people = people;
        this.message = message;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Pair<Double, Double> getGPS() {
        return GPS;
    }

    public void setGPS(Pair<Double, Double> GPS) {
        this.GPS = GPS;
    }
}
