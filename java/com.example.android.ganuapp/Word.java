/**
 * Created by JTaqleh on 24/07/2016.
 * This is the custom class that I create to provide the word translation from English to Ganu.
 */

package com.example.android.ganuapp;

import android.content.Context;

public class Word {

    //String value for the English Words
    private String mEnglishWords;

    //String value for the Ganu Words
    private String mGanuWords;

    //Image resource id for the word
    private int mImageId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //Audio resource id for the word
    private int mAudioResourceId;

    //Constructor that creates the Word object with 2 String inputs.
    public Word(String EnglishWords, String GanuWords, int AudioResourceId){
        mEnglishWords = EnglishWords;
        mGanuWords = GanuWords;
        mAudioResourceId = AudioResourceId;
    }

    //Constructor that creates the Word object with 3 inputs.
    public Word(String EnglishWords, String GanuWords, int ImageId, int AudioResourceId){
        mEnglishWords = EnglishWords;
        mGanuWords = GanuWords;
        mImageId = ImageId;
        mAudioResourceId = AudioResourceId;
    }

    //Get and set the English words
    public String getEnglishTranslation(){
        return mEnglishWords;
    }

    //Get and set the Ganu words
    public String getGanuTranslation(){
        return mGanuWords;
    }

    //Get and set the Image based on the ID
    public int getImageId() { return mImageId;}

    //Check to see if there is an image for this Word object
    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }

    //Get and set the audio based on the Id
    public int getAudioId() {return mAudioResourceId;}

}
