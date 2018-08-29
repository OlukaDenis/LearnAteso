package com.example.android.miwok;

/**
 * Created by McDenny Lucaz on 6/16/2018.
 */

public class Word {
    private String englishTranslation;
    private String atesoTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceID = NO_IMAGE_PROVIDED;
    private int resourceAudio;

    public  Word(String english, String ateso){
        englishTranslation = english;
        atesoTranslation = ateso;

    }

    public  Word(String english, String ateso, int image, int audio){
        englishTranslation = english;
        atesoTranslation = ateso;
        imageResourceID = image;
        resourceAudio = audio;
    }

    public String getAtesoTranslation() {
        return atesoTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
    public int getResourceAudio(){
        return resourceAudio;
    }

    // Returns whether or not the word has an image
    public boolean hasImage(){
        return imageResourceID != NO_IMAGE_PROVIDED;
    }
}












