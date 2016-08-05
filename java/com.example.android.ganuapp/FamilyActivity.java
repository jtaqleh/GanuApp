package com.example.android.ganuapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        //Adding elements into the ArrayList englishWords
        words.add(new Word("mother", "mok", R.drawable.family_mother, R.raw.mok));
        words.add(new Word("father", "ayoh", R.drawable.family_father, R.raw.ayoh));
        words.add(new Word("son", "anok", R.drawable.family_son, R.raw.anok));
        words.add(new Word("sister", "kok", R.drawable.family_older_sister, R.raw.kok));
        words.add(new Word("brother", "abang", R.drawable.family_older_brother, R.raw.abang));
        words.add(new Word("little sister", "adik puang", R.drawable.family_younger_sister, R.raw.adik_puang));
        words.add(new Word("little brother", "adik laki", R.drawable.family_younger_brother, R.raw.adik_laki));
        words.add(new Word("uncle", "pok sedara", R.drawable.family_father, R.raw.pok_sedara));
        words.add(new Word("aunty", "mok sedara", R.drawable.family_mother, R.raw.mok_sedara));
        words.add(new Word("grandmother", "tok wang", R.drawable.family_grandmother, R.raw.tok_wang));
        words.add(new Word("grandfather", "tok ki", R.drawable.family_grandfather, R.raw.tok_ki));
        words.add(new Word("cousin brother", "sepupu laki", R.drawable.family_younger_brother, R.raw.sepupu_laki));
        words.add(new Word("cousin sister", "sepupu puang", R.drawable.family_younger_sister, R.raw.sepupu_puang));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        //WordAdapter is a custom adapter that we create to accommodate our request to display
        //two words.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

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

                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioId());
                mMediaPlayer.start();
            }
        });
    }
}
