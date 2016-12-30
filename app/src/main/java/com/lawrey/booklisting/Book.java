package com.lawrey.booklisting;

/**
 * Created by Lawrey on 30/12/16.
 */

public class Book {

    private String mTitle;
    private String mAuthors;
    private String publisher;

    public Book(String mTitle, String mAuthors, String publisher) {
        this.mTitle = mTitle;
        this.mAuthors = mAuthors;
        this.publisher = publisher;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthors() {
        mAuthors = mAuthors.replace("[", "");
        mAuthors = mAuthors.replace("]", "");
        mAuthors = mAuthors.replace("\"", "");
        return mAuthors;
    }

    public String getPublisher() {
        return publisher;
    }

}
