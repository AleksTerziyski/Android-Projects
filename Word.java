package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String engTranslation;
    private int id=-1;
    private int mAudioResourceId;

    public Word(String miwok,String eng,int audioResourceId)
    {
        miwokTranslation=miwok;
        engTranslation=eng;
        mAudioResourceId=audioResourceId;
    }
    public Word(String eng,String miwok,int ID, int audioResourceId)
    {
        miwokTranslation=miwok;
        engTranslation=eng;
        id=ID;
        mAudioResourceId=audioResourceId;
    }

    public String getMiwokTranslation()
    {
        return miwokTranslation;
    }
    public String getEngTranslation()
    {
        return engTranslation;
    }
    public int getImageId()
    {
        return id;
    }
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
