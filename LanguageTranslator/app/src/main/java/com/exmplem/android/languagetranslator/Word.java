package com.exmplem.android.languagetranslator;

/**
 * Created by User on 11/14/2016.
 */

public class Word {

    private String mDeafualtTranslation;

    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageResourceId = NO_IMAGE_PROVIDED;




    public Word(String defTrans, String miwokTrans){
        mDeafualtTranslation = defTrans;
        mMiwokTranslation = miwokTrans;
    }

    public Word(String defTrans, String miwokTrans, int imageResourceId){
        mDeafualtTranslation = defTrans;
        mMiwokTranslation = miwokTrans;
        mImageResourceId = imageResourceId;
    }

    public String getDefTrans(){
        return mDeafualtTranslation;
    }

    public String getMiwok(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){

       return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
