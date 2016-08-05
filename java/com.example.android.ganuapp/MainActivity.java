/*
This app is called the GanuApp. I've created this app as part of my udacity android project. This app
will function as a dictionary from English to Malay in Terengganu accent. As part of my heritage I
am proud to be working on this project and I hope this app will function as intended.
 Programmer: b1G_p4Pp1 (Jake Taqleh)
 */
package com.example.android.ganuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        /*
        *Long way of creating event listener
        NumbersClickListener clickListener = new NumbersClickListener();

        //Find the views that shows the Numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);

        //Set a ClickListener on that view
        numbers.setOnClickListener(clickListener);
        */

        //Shorter way of creating event listener

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Find the View that shows the numbers category
        TextView family = (TextView) findViewById(R.id.family);

        // Find the View that shows the numbers category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Find the View that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
