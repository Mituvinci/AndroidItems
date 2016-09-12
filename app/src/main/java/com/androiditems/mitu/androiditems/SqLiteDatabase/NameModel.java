package com.androiditems.mitu.androiditems.SqLiteDatabase;

/**
 * Created by Hi on 13-Sep-16.
 */
public class NameModel {

    public int id;
    public String name;

    public NameModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public NameModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
