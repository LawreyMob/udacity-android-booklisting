package com.lawrey.booklisting;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import static android.R.attr.resource;

/**
 * Created by Lawrey on 30/12/16.
 */

public class BookListingAdapter extends ArrayAdapter<Book> {

    public BookListingAdapter(Context context, List<Book> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        TextView authorsTextView = (TextView) listItemView.findViewById(R.id.authors_text_view);
        TextView publisherTextView = (TextView) listItemView.findViewById(R.id.publisher_text_view);

        titleTextView.setText(currentBook.getmTitle());

        authorsTextView.setText(currentBook.getmAuthors());
        publisherTextView.setText(currentBook.getPublisher());

        return listItemView;
    }

}
