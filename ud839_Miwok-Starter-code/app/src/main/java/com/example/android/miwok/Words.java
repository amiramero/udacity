package com.example.android.miwok;

/**
 * Created by amiraelsayed on 7/20/2017.
 */

public class Words
{
    String miwok;
    String defaultranslate;

    /** Image resource ID for the word */

    private int imageId = NO_IMAGE_PROVIDED;



    /** Constant value that represents no image was provided for this word */

    private static final int NO_IMAGE_PROVIDED = -1;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public String getDefaultranslate() {
        return defaultranslate;
    }

    public void setDefaultranslate(String defaultranslate) {
        this.defaultranslate = defaultranslate;
    }
    public Words(String defaulTransalte,String miwok)
    {
        this.defaultranslate =defaulTransalte;
        this.miwok=miwok;
    }
    public Words(String defaulTransalte,String miwok,int imageId)
    {
        this.defaultranslate =defaulTransalte;
        this.miwok=miwok;
        this.imageId=imageId;
    }
    /**

     * Returns whether or not there is an image for this word.

     */

    public boolean hasImage() {

        return imageId != NO_IMAGE_PROVIDED;

    }
}

