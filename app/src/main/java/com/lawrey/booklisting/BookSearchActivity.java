package com.lawrey.booklisting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BookSearchActivity extends AppCompatActivity {

    private TextView searchTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_search);

        searchTextView = (TextView) findViewById(R.id.search_edit_text);
    }

    @Override
    protected void onResume() {
        super.onResume();
        searchTextView.setText("");
    }

    public void onSearch(View view) {
        Intent intent = new Intent(this, BookListingActivity.class);
        intent.putExtra(getString(R.string.searchIntent), searchTextView.getText().toString());
        startActivity(intent);
    }
}
