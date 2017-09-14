package com.exmplem.android.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create a string array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        //add data to the array list
        words.add(new Word("Where are you going?", "Uyaphi?"));
        words.add(new Word("What is your name?", "Nguwe bani ligama lakho?"));
        words.add(new Word("My name is", "Ligama lami ngi"));
        words.add(new Word("How are you feeling?", "Utiva njani?"));
        words.add(new Word("I'm feeling good", "Ngitiva kahle"));
        words.add(new Word("Are you coming?", "Uyeta?"));
        words.add(new Word("Yes, I'm coming", "Yebo, ngiyeta"));
        words.add(new Word("I'm coming", "Ngiyeta"));
        words.add(new Word("Let's go", "Asambe"));
        words.add(new Word("Come here", "Buya la"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.num_list);


        listView.setAdapter(adapter);
    }
}
