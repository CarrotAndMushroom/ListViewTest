package com.example.zsy.listviewtest;


/**
 * Created by ZSY on 2017/4/17.
 */

public class Poem {
    private String name;

    private int imageId;

    public Poem(String name,int imageId){
        this.name = name;
        this.imageId= imageId;
    }

    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
