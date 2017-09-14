package com.exmplem.android.languagetranslator;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 11/14/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColoreResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){

        super(context, 0 , words);
        mColoreResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        Word currentWord = getItem(position);

        TextView swatiView = (TextView) listItemView. findViewById(R.id.swati_text);

        swatiView.setText(currentWord.getMiwok());

        TextView engView = (TextView) listItemView. findViewById(R.id.eng_default);

        engView.setText(currentWord.getDefTrans());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView. findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColoreResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
