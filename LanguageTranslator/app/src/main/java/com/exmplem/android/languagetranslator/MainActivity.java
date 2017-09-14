package com.exmplem.android.languagetranslator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openNumLst(View view) {
        Intent openNumbers = new Intent(this, Numbers.class);
        startActivity(openNumbers);

    }

    public void openFamLst(View view) {
        Intent openFamily = new Intent(this, Family.class);
        startActivity(openFamily);

    }

    public void openColLst(View view) {
        Intent openColors = new Intent(this, Colors.class);
        startActivity(openColors);

    }

    public void openPhrLst(View view) {
        Intent openPhrases = new Intent(this, Phrases.class);
        startActivity(openPhrases);

    }


}
