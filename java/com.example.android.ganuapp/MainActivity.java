/*
This app is called the GanuApp. I've created this app as part of my udacity course project. This app
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

        //Creating event listener

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Find the View that shows the numbers category
        TextView family = (TextView) findViewById(R.id.family);

        // Find the View that shows the numbers category
        TextView action = (TextView) findViewById(R.id.action);

        // Find the View that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on the NumbersActivity View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Set a click listener on the FamilyActivity View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Set a click listener on the ActionActivity View
        action.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent actionIntent = new Intent(MainActivity.this, ActionActivity.class);
                startActivity(actionIntent);
            }
        });

        // Set a click listener on the PhrasesActivity View
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
