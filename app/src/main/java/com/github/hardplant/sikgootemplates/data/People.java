package com.github.hardplant.sikgootemplates.data;

/**
 * Created by KANG on 2018-01-11.
 */

public class People {
    int id;
    String Image;
    String Name;
    String[] HashTag;

    int resCode;
    Food[] likes;
    Food[] dislikes;
    TimeTable timeTable;

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

    public int getId() {
        return id;
    }
}
