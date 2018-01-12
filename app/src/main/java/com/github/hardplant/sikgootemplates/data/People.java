package com.github.hardplant.sikgootemplates.data;

/**
 * Created by KANG on 2018-01-11.
 */

public class People {
    String Image;
    String Name;
    String[] HashTag;

    public People(String image, String name, String[] hashTag) {
        Image = image;
        Name = name;
        HashTag = hashTag;
    }

    public String getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String[] getHashTag() {
        return HashTag;
    }
}
