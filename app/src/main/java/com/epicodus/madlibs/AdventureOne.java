package com.epicodus.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AdventureOne extends AppCompatActivity {
    private TextView mAdventureTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_one);
        mAdventureTextView = (TextView) findViewById(R.id.adventureTextView);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String adjective = intent.getStringExtra("adjective");
        mAdventureTextView.setText(noun + " finds their self in a land foreign to them. They quickly " + verb + " in an effort to center themselves. Realizing their futility, " + noun + " settles down for a long " + adjective + " night.");
    }
}
