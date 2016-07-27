package com.example.android.ganuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //Adding elements into the ArrayList englishWords
        words.add(new Word("mother", "mok"));
        words.add(new Word("father", "ayoh"));
        words.add(new Word("son", "anok"));
        words.add(new Word("sister", "kok"));
        words.add(new Word("brother", "abang"));
        words.add(new Word("little sister", "adik puang"));
        words.add(new Word("little brother", "adik laki"));
        words.add(new Word("uncle", "pok sedara"));
        words.add(new Word("aunty", "mok sedara"));
        words.add(new Word("grandmother", "tok wang"));
        words.add(new Word("grandfather", "tok ki"));
        words.add(new Word("cousin brother", "sepupu laki"));
        words.add(new Word("cousin sister", "sepupu puang"));

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
