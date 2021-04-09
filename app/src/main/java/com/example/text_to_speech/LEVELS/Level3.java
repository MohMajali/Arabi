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

    Button words, colors, numbers;   // calling the elements from the Level3 layout we used

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        words = (Button) findViewById(R.id.words);
        colors = (Button) findViewById(R.id.colors);    //Defin each element by thier IDs
        numbers = (Button) findViewById(R.id.number);

        words.setOnClickListener(v -> startActivity(new Intent(Level3.this, Words.class)));  // if button named words clicked, jump from Level3 class to Words class

        colors.setOnClickListener(v -> startActivity(new Intent(Level3.this, Colors.class)));

        numbers.setOnClickListener(v -> startActivity(new Intent(Level3.this, Numbers.class)));
    }
}