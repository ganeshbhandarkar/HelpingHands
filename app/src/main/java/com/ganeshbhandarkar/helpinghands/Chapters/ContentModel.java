package com.ganeshbhandarkar.helpinghands.Chapters;

public class ContentModel {

    String data;
    int images;
    String readMode;

    public ContentModel(String data,int images,String readMode) {
        this.data = data;
        this.images = images;
        this.readMode = readMode;
    }



    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getReadMode() {
        return readMode;
    }

    public void setReadMode(String readMode) {
        this.readMode = readMode;
    }
}
