package com.example.android.ganuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Creating an ArrayList to store the values of variable englishWords
        ArrayList<Word> words = new ArrayList<Word>();

        //Adding elements into the ArrayList englishWords
        words.add(new Word("one", "se"));
        words.add(new Word("two", "duwe"));
        words.add(new Word("three", "tige"));
        words.add(new Word("four", "pak"));
        words.add(new Word("five", "lime"));
        words.add(new Word("six", "nang"));
        words.add(new Word("seven", "tujoh"));
        words.add(new Word("eight", "lapang"));
        words.add(new Word("nine", "smilang"));
        words.add(new Word("ten", "spuloh"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        //WordAdapter is a custom adapter that we create to accommodate our request to display
        //two words.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
