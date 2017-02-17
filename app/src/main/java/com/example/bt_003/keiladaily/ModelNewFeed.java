package com.example.bt_003.keiladaily;

import java.util.ArrayList;

/**
 * Created by BT-003 on 29-Jan-17.
 */
public class ModelNewFeed {
    public String textdate;
    public String textdecription;
    public String imageView;

    public ModelNewFeed(String textdate, String textdecription, String imageView) {
        this.textdate = textdate;
        this.textdecription = textdecription;
        this.imageView = imageView;
    }

    public String getTextdate() {
        return textdate;
    }

    public void setTextdate(String textdate) {
        this.textdate = textdate;
    }

    public String getTextdecription() {
        return textdecription;
    }

    public void setTextdecription(String textdecription) {
        this.textdecription = textdecription;
    }

    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }

    public static ArrayList<ModelNewFeed> generateNewFeed(int num){
        ArrayList<ModelNewFeed> tmp = new ArrayList<>();
        for (int i=0; i<num; i++){
            tmp.add(new ModelNewFeed("Date: " + i, "Des: " + i, "asdfasdjlfsdf"));
        }
        return tmp;
    }
}
