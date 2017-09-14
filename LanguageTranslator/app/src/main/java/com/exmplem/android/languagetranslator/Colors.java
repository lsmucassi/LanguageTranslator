package com.exmplem.android.languagetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create a string array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        //add data to the array list
        words.add(new Word("Red", "Lokubovu/Bovu", R.drawable.color_red));
        words.add(new Word("Mastered yellow", "Phuzu lomanti", R.drawable.color_mustard_yellow));
        words.add(new Word("Dusty yellow", "phuzu lolitfuli", R.drawable.color_dusty_yellow));
        words.add(new Word("Green", "Luhlata", R.drawable.color_green));
        words.add(new Word("Brown", "Nsundu", R.drawable.color_brown));
        words.add(new Word("Gray", "Mpunga", R.drawable.color_gray));
        words.add(new Word("Black", "Mnyama", R.drawable.color_black));
        words.add(new Word("White", "Mhlophe", R.drawable.color_white));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.num_list);


        listView.setAdapter(adapter);
    }
}
