package com.ganeshbhandarkar.helpinghands.Chapters;

import android.os.Parcel;
import android.os.Parcelable;

public class ChapterItem implements Parcelable {

    int item_images;
    String item_names;
    String item_no;
    String block_name;
    String block;
    String readMode1;
    String readMode2;
    String readMode3;



    public ChapterItem(int item_images, String item_names, String item_no, String block_name, String block, String readMode1, String readMode2, String readMode3) {
        this.item_images = item_images;
        this.item_names = item_names;
        this.item_no = item_no;
        this.block_name = block_name;
        this.block = block;
        this.readMode1 = readMode1;
        this.readMode2 = readMode2;
        this.readMode3 = readMode3;
    }

    protected ChapterItem(Parcel in) {
        item_images = in.readInt();
        item_names = in.readString();
        item_no = in.readString();
        block_name = in.readString();
        block = in.readString();
        readMode1 = in.readString();
        readMode2 = in.readString();
        readMode3 = in.readString();
    }

    public static final Creator<ChapterItem> CREATOR = new Creator<ChapterItem>() {
        @Override
        public ChapterItem createFromParcel(Parcel in) {
            return new ChapterItem(in);
        }

        @Override
        public ChapterItem[] newArray(int size) {
            return new ChapterItem[size];
        }
    };

    public int getItem_images() {
        return item_images;
    }

    public void setItem_images(int item_images) {
        this.item_images = item_images;
    }

    public String getItem_names() {
        return item_names;
    }

    public void setItem_names(String item_names) {
        this.item_names = item_names;
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getReadMode1() {
        return readMode1;
    }

    public void setReadMode1(String readMode1) {
        this.readMode1 = readMode1;
    }

    public String getReadMode2() {
        return readMode2;
    }

    public void setReadMode2(String readMode2) {
        this.readMode2 = readMode2;
    }

    public String getReadMode3() {
        return readMode3;
    }

    public void setReadMode3(String readMode3) {
        this.readMode3 = readMode3;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(item_images);
        dest.writeString(item_names);
        dest.writeString(item_no);
        dest.writeString(block_name);
        dest.writeString(block);
        dest.writeString(readMode1);
        dest.writeString(readMode2);
        dest.writeString(readMode3);
    }

    //    protected ChapterItem(Parcel in) {
//        item_images = in.readInt();
//        item_names = in.readString();
//        item_no = in.readString();
//        block_name = in.readString();
//        block = in.readString();
//        readMode1 = in.readString();
//    }
//
//    public static final Creator<ChapterItem> CREATOR = new Creator<ChapterItem>() {
//        @Override
//        public ChapterItem createFromParcel(Parcel in) {
//            return new ChapterItem(in);
//        }
//
//        @Override
//        public ChapterItem[] newArray(int size) {
//            return new ChapterItem[size];
//        }
//    };
//
//    public String getItem_no() {
//        return item_no;
//    }
//
//    public ChapterItem(int item_images, String item_names, String item_no,String block_name,String block,String readMode1) {
//        this.item_images = item_images;
//        this.item_names = item_names;
//        this.item_no = item_no;
//        this.block_name = block_name;
//        this.block = block;
//        this.readMode1 = readMode1;
//    }
//
//    public String getBlock() {
//        return block;
//    }
//
//    public void setBlock(String block) {
//        this.block = block;
//    }
//
//    public String getReadMode1() {
//        return readMode1;
//    }
//
//    public void setReadMode1(String readMode1) {
//        this.readMode1 = readMode1;
//    }
//
//
//    public String getBlock_name() {
//        return block_name;
//    }
//
//    public void setBlock_name(String block_name) {
//        this.block_name = block_name;
//    }
//
//    public void setItem_no(String item_no) {
//        this.item_no = item_no;
//    }
//
//
//
//    public int getItem_images() {
//        return item_images;
//    }
//
//    public String getItem_names() {
//        return item_names;
//    }
//
//
//
//    public void setItem_images(int item_images) {
//        this.item_images = item_images;
//    }
//
//    public void setItem_names(String item_names) {
//        this.item_names = item_names;
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(item_images);
//        dest.writeString(item_names);
//        dest.writeString(item_no);
//        dest.writeString(block_name);
//        dest.writeString(block);
//        dest.writeString(readMode1);
//    }
}
