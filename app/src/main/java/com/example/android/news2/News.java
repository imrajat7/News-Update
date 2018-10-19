package com.example.android.news2;

public class News {

    private String mTitle;

    private String mAuthor;

    private String mSection;

    private String mDate;

    private String mUrl;

    //Constructor to set the values of the above variables
    News(String title, String author, String section, String date, String url) {
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    public String getTtitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    public String getDdate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

}