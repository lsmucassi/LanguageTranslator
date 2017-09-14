package com.exmplem.android.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create a string array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        //add data to the array list
        words.add(new Word("Father", "Babe", R.drawable.family_father));
        words.add(new Word("Mother", "Make", R.drawable.family_mother));
        words.add(new Word("Son", "Indvodzana", R.drawable.family_son));
        words.add(new Word("Daughter", "Indvondzakati", R.drawable.family_daughter));
        words.add(new Word("Older brother", "Bhuti lomkhulu", R.drawable.family_older_brother));
        words.add(new Word("Younger brother", "Bhuti lomncane", R.drawable.family_younger_brother));
        words.add(new Word("Older sister", "Sesi lomkhulu", R.drawable.family_older_sister));
        words.add(new Word("Younger sister", "Sesi lomncane", R.drawable.family_younger_sister));
        words.add(new Word("Grandmother", "Gogo", R.drawable.family_grandmother));
        words.add(new Word("Grandfather", "Mkhulu", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.num_list);


        listView.setAdapter(adapter);
    }
}
