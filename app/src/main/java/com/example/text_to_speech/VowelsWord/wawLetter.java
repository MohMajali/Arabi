package com.example.text_to_speech.VowelsWord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.text_to_speech.R;

public class wawLetter extends AppCompatActivity {

    Button bird , lemon , zayton , tot , moz;
    TextView fill;

    SharedPreferences sp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waw_letter);

        bird = findViewById(R.id.bird);
        lemon = findViewById(R.id.lemon);
        zayton = findViewById(R.id.zayton);
        tot = findViewById(R.id.tot);
        moz = findViewById(R.id.moz);

        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        bird.setOnClickListener(v -> {
            String wawWord = "عصفور" ;
            String pronunciation = "عصفور" ;
            int sound = R.raw.bird;
            int pic = R.drawable.birdpic;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(wawLetter.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(wawLetter.this, Singlevowelword.class);
            startActivity(intent);
        });

        lemon.setOnClickListener(v -> {

            String wawWord = "ليمون" ;
            String pronunciation = "ليمون" ;
            int sound = R.raw.lemon;
            int pic = R.drawable.lemonpic;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(wawLetter.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(wawLetter.this, Singlevowelword.class);
            startActivity(intent);
        });

        zayton.setOnClickListener(v -> {

            String wawWord = "زيتون" ;
            String pronunciation = "زيتون" ;
            int sound = R.raw.zayton;
            int pic = R.drawable.olivepic;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(wawLetter.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(wawLetter.this, Singlevowelword.class);
            startActivity(intent);
        });

        tot.setOnClickListener(v -> {

            String wawWord = "توت" ;
            String pronunciation = "توت" ;
            int sound = R.raw.tot;
            int pic = R.drawable.raspberrypic;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(wawLetter.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(wawLetter.this, Singlevowelword.class);
            startActivity(intent);
        });

        moz.setOnClickListener(v -> {
            String wawWord = "موز" ;
            String pronunciation = "موز" ;
            int sound = R.raw.moz;
            int pic = R.drawable.bananapic;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(wawLetter.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(wawLetter.this, Singlevowelword.class);
            startActivity(intent);
        });
    }
}