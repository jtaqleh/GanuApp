/**
 * Created by JTaqleh on 24/07/2016. This class is created so that it can accommodate the two text
 * view we want to display for our ArrayAdapter.
 */

package com.example.android.ganuapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version name from the current englishTextView object and
        // set this text on the name TextView
        englishTextView.setText(currentWord.getEnglishTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView ganuTextView = (TextView) listItemView.findViewById(R.id.ganu_text_view);
        // Get the version number from the current ganuTextView object and
        // set this text on the number TextView
        ganuTextView.setText(currentWord.getGanuTranslation());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
