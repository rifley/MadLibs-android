package com.epicodus.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
   public static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.haveAnAdventureButton) Button mHaveAnAdventureButton;
    @Bind(R.id.nounEditText) EditText mNounEditText;
    @Bind(R.id.verbEditText) EditText mVerbEditText;
    @Bind(R.id.adjectiveEditText) EditText mAdjectiveEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mHaveAnAdventureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun = mNounEditText.getText().toString();
                String verb = mVerbEditText.getText().toString();
                String adjective = mAdjectiveEditText.getText().toString();
                Log.d(TAG, noun);
                Log.d(TAG, verb);
                Log.d(TAG, adjective);
                Intent intent = new Intent(MainActivity.this, AdventureOne.class);
                startActivity(intent);
            }
        });
    }
}
