package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level3 extends AppCompatActivity {

    Button words, colors, numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        words = (Button) findViewById(R.id.words);
        colors = (Button) findViewById(R.id.colors);
        numbers = (Button) findViewById(R.id.numbers);
    }
}