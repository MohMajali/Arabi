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
            String word = "أحمر" ;
            String pronunciation = "أحمر" ;
            int Sound = R.raw.red ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        black.setOnClickListener(v -> {
            String word = "أسود" ;
            String pronunciation = "أسود" ;
            int Sound = R.raw.black ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        blue.setOnClickListener(v -> {
            String word = "أزرق" ;
            String pronunciation = "أزرق" ;
            int Sound = R.raw.blue ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        brown.setOnClickListener(v -> {
            String word = "بني" ;
            String pronunciation = "بني" ;
            int Sound = R.raw.brown ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        green.setOnClickListener(v -> {
            String word = "أخضر" ;
            String pronunciation = "أخضر" ;
            int Sound = R.raw.green ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        yallow.setOnClickListener(v -> {
            String word = "أصفر" ;
            String pronunciation = "أصفر" ;
            int Sound = R.raw.yallow ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        white.setOnClickListener(v -> {
            String word = "أبيض" ;
            String pronunciation = "أبيض" ;
            int Sound = R.raw.white ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });

        orange.setOnClickListener(v -> {
            String word = "برتقالي" ;
            String pronunciation = "برتقالي" ;
            int Sound = R.raw.orange ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSound",Sound);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Colors.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Colors.this, SingleColor.class);
            startActivity(intent);
        });
    }
}