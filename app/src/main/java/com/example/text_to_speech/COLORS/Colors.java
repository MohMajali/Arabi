package com.example.text_to_speech.COLORS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.text_to_speech.R;

public class Colors extends AppCompatActivity {

    Button red , black , blue , brown , green , yallow , white , orange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        SharedPreferences sp ;
        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        red = findViewById(R.id.red);
        black = findViewById(R.id.black);
        blue = findViewById(R.id.blue);
        brown = findViewById(R.id.brown);
        green = findViewById(R.id.green);
        yallow = findViewById(R.id.yallow);
        white = findViewById(R.id.white);
        orange = findViewById(R.id.orange);

        red.setOnClickListener(v -> {
            String word = "احمر" ;
            String pronunciation = "احمر" ;
            int Sound = R.raw.red ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        black.setOnClickListener(v -> {
            String word = "اسود" ;
            String pronunciation = "اسود" ;
            int Sound = R.raw.black ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        blue.setOnClickListener(v -> {
            String word = "ازرق" ;
            String pronunciation = "ازرق" ;
            int Sound = R.raw.blue ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        brown.setOnClickListener(v -> {
            String word = "بني" ;
            String pronunciation = "بني" ;
            int Sound = R.raw.brown ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        green.setOnClickListener(v -> {
            String word = "اخضر" ;
            String pronunciation = "اخضر" ;
            int Sound = R.raw.green ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        yallow.setOnClickListener(v -> {
            String word = "اصفر" ;
            String pronunciation = "اصفر" ;
            int Sound = R.raw.yallow ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        white.setOnClickListener(v -> {
            String word = "ابيض" ;
            String pronunciation = "ابيض" ;
            int Sound = R.raw.white ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        orange.setOnClickListener(v -> {
            String word = "برتقالي" ;
            String pronunciation = "برتقالي" ;
            int Sound = R.raw.orange ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);

            editor.apply();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });
    }
}