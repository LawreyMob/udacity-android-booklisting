package com.lawrey.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Lawrey on 30/12/16.
 */

public class BookListingLoader extends AsyncTaskLoader<List<Book>> {

    /** Tag for log messages */
    private static final String LOG_TAG = BookListingLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link BookListingLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public BookListingLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.v("Log Loader", "onStartLoading");
        forceLoad();
    }

    /**
     * This is on a background thread.
     */

    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Book> books = BookListingUtils.extractBooks(mUrl);
        Log.v("Log Loader", "loadInBackground");
        //return new ArrayList<Earthquake>();
        return books;
    }

}
