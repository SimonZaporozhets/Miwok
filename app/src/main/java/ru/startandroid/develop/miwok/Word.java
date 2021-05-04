package ru.startandroid.develop.miwok;

public class Word {

    private int miwokWordId;
    private int englishWordId;
    private int imageResId = -1;
    private int soundIdRes;

    public Word(int miwokWordId, int englishWordId, int imageResId, int soundIdRes) {
        this.miwokWordId = miwokWordId;
        this.englishWordId = englishWordId;
        this.imageResId = imageResId;
        this.soundIdRes = soundIdRes;
    }

    public Word(int miwokWordId, int englishWordId, int soundIdRes) {
        this.miwokWordId = miwokWordId;
        this.englishWordId = englishWordId;
        this.soundIdRes = soundIdRes;
    }

    public int getSoundIdRes() {
        return soundIdRes;
    }

    public void setSoundIdRes(int soundIdRes) {
        this.soundIdRes = soundIdRes;
    }

    public int getMiwokWordId() {
        return miwokWordId;
    }

    public void setMiwokWordId(int miwokWordId) {
        this.miwokWordId = miwokWordId;
    }

    public int getEnglishWordId() {
        return englishWordId;
    }

    public void setEnglishWordId(int englishWordId) {
        this.englishWordId = englishWordId;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
