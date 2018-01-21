package com.github.hardplant.sikgootemplates.data;

import com.github.hardplant.sikgootemplates.R;

/**
 * Created by KANG on 2018-01-11.
 */

public class RestaurantArticle {
    int id;
    String name;
    String content;
    String editor;

    public RestaurantArticle(String name, String content, String editor) {
        this.name = name;
        this.content = content;
        this.editor = editor;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getEditor() {
        return editor;
    }

    public RestaurantArticle setTestId() {
        this.id = R.drawable.rest_example;
        return this;
    }
}
