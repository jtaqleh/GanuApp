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

    //Construct a new words with initial values for English words and Ganu words
    public Word(String EnglishWords, String GanuWords){
        mEnglishWords = EnglishWords;
        mGanuWords = GanuWords;
    }

    //Get and set the English words
    public String getEnglishTranslation(){
        return mEnglishWords;
    }

    //Get and set the Ganu words
    public String getGanuTranslation(){
        return mGanuWords;
    }
}
