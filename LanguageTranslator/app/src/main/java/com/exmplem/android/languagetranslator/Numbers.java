package com.exmplem.android.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create a string array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        //add data to the array list
        words.add(new Word("One", "Kunye", R.drawable.number_one));
        words.add(new Word("Two", "Kubili", R.drawable.number_two));
        words.add(new Word("Three", "Kutsatfu", R.drawable.number_three));
        words.add(new Word("Four", "Kune", R.drawable.number_four));
        words.add(new Word("Five", "Sihlanu", R.drawable.number_five));
        words.add(new Word("Six", "Sitfupha", R.drawable.number_six));
        words.add(new Word("Seven", "Sikhombisa", R.drawable.number_seven));
        words.add(new Word("Eight", "Siphohlongo", R.drawable.number_eight));
        words.add(new Word("Nine", "Imfica", R.drawable.number_nine));
        words.add(new Word("Ten", "Lishumi", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.num_list);


        listView.setAdapter(adapter);

    }
}


