package com.example.text_to_speech.LEVELS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.text_to_speech.COLORS.Colors;
import com.example.text_to_speech.NUMBERS.Numbers;
import com.example.text_to_speech.R;
import com.example.text_to_speech.WORDS.Words;

public class Level3 extends AppCompatActivity {

    Button words, colors, numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        words = (Button) findViewById(R.id.words);
        colors = (Button) findViewById(R.id.colors);
        numbers = (Button) findViewById(R.id.number);

        words.setOnClickListener(v -> startActivity(new Intent(Level3.this, Words.class)));

        colors.setOnClickListener(v -> startActivity(new Intent(Level3.this, Colors.class)));

        numbers.setOnClickListener(v -> startActivity(new Intent(Level3.this, Numbers.class)));
    }
}