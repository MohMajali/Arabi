package com.example.text_to_speech.NUMBERS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.text_to_speech.R;

public class Numbers extends AppCompatActivity {

    Button one , two , three , four , five , six , sev , eig , nine , ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        SharedPreferences sp ;
        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        one = findViewById(R.id.one1);
        two = findViewById(R.id.two2);
        three = findViewById(R.id.three3);
        four = findViewById(R.id.four4);
        five = findViewById(R.id.five5);
        six = findViewById(R.id.six6);
        sev = findViewById(R.id.seven7);
        eig = findViewById(R.id.eight8);
        nine = findViewById(R.id.nine9);
        ten = findViewById(R.id.ten10);

        one.setOnClickListener(v -> {
            String word = "1" ;
            String pronunciation = "1" ;
            int SoundNum = R.raw.learnnumber1 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheColor",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        two.setOnClickListener(v -> {
            String word = "2" ;
            String pronunciation = "2" ;
            int SoundNum = R.raw.learnnumber2 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        three.setOnClickListener(v -> {
            String word = "3" ;
            String pronunciation = "3" ;
            int SoundNum = R.raw.learnnumber3 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        four.setOnClickListener(v -> {
            String word = "4" ;
            String pronunciation = "4" ;
            int SoundNum = R.raw.learnnumber4 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        five.setOnClickListener(v -> {
            String word = "5" ;
            String pronunciation = "5" ;
            int SoundNum = R.raw.learnnumber5 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        six.setOnClickListener(v -> {
            String word = "6" ;
            String pronunciation = "6" ;
            int SoundNum = R.raw.learnnumber6 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        sev.setOnClickListener(v -> {
            String word = "7" ;
            String pronunciation = "7" ;
            int SoundNum = R.raw.learnnumber7 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        eig.setOnClickListener(v -> {
            String word = "8" ;
            String pronunciation = "8" ;
            int SoundNum = R.raw.learnnumber8 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        nine.setOnClickListener(v -> {
            String word = "9" ;
            String pronunciation = "9" ;
            int SoundNum = R.raw.learnnumber9 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        ten.setOnClickListener(v -> {
            String word = "10" ;
            String pronunciation = "10" ;
            int SoundNum = R.raw.learnnumber10 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });
    }
}