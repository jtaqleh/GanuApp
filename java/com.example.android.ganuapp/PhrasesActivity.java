package com.example.android.ganuapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        //Adding elements into the ArrayList englishWords
        words.add(new Word("very loud", "bising bango", R.raw.bising_bango));
        words.add(new Word("very pale", "pucak lesi", R.raw.pucak_lesi));
        words.add(new Word("all grown up", "beso jallo", R.raw.besor_jallo));
        words.add(new Word("very cold", "sejuk ketor", R.raw.sejuk_ketor));
        words.add(new Word("it goes horribly wrong", "ke lauk", R.raw.ke_lauk));
        words.add(new Word("very bitter", "tawo hebbe", R.raw.tawo_hebbe));
        words.add(new Word("visit frequently", "maghi sokmo", R.raw.maghi_sokmo));
        words.add(new Word("very cute", "comey lotey", R.raw.comey_lotte));
        words.add(new Word("big", "bapok", R.raw.bapok));
        words.add(new Word("skinny", "kuruh kering", R.raw.kuruh_kering));
        words.add(new Word("fat", "debbo", R.raw.debbo));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        //WordAdapter is a custom adapter that we create to accommodate our request to display
        //two words.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                /**
                 * Test the functionality with Toast message*/
                //Toast.makeText(NumbersActivity.this, "List item clicked", Toast.LENGTH_SHORT).show();

                //The the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioId());
                mMediaPlayer.start();
            }
        });
    }
}
