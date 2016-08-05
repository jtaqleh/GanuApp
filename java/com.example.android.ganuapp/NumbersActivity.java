package com.example.android.ganuapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Creating an ArrayList to store the values of variable englishWords
        final ArrayList<Word> words = new ArrayList<Word>();

        //Adding elements into the ArrayList englishWords
        words.add(new Word("one", "se", R.drawable.number_one, R.raw.se));
        words.add(new Word("two", "duwe", R.drawable.number_two, R.raw.duwe));
        words.add(new Word("three", "tige", R.drawable.number_three, R.raw.tige));
        words.add(new Word("four", "pak", R.drawable.number_four, R.raw.pak));
        words.add(new Word("five", "lime", R.drawable.number_five, R.raw.lime));
        words.add(new Word("six", "nang", R.drawable.number_six, R.raw.nang));
        words.add(new Word("seven", "tujoh", R.drawable.number_seven, R.raw.tujoh));
        words.add(new Word("eight", "lapang", R.drawable.number_eight, R.raw.lapang));
        words.add(new Word("nine", "smilang", R.drawable.number_nine, R.raw.smilang));
        words.add(new Word("ten", "spuloh", R.drawable.number_ten, R.raw.spuloh));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        //WordAdapter is a custom adapter that we create to accommodate our request to display
        //two words.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        //Creating an event for OnClickListener when the user click on it.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                /**
                 * Test the functionality with Toast message*/
                //Toast.makeText(NumbersActivity.this, "List item clicked", Toast.LENGTH_SHORT).show();

                //The the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);
                
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioId());
                mMediaPlayer.start();
            }
        });
    }
}
