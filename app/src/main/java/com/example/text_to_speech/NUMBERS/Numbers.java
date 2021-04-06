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
            String word = "واحد" ;
            String pronunciation = "واحد" ;
            String pronunciation2 = "1" ;
            int SoundNum = R.raw.learnnumber1 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        two.setOnClickListener(v -> {
            String word = "اثنين" ;
            String pronunciation = "اثنين" ;
            String pronunciation2 = "2" ;
            int SoundNum = R.raw.learnnumber2 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        three.setOnClickListener(v -> {
            String word = "ثلاثه" ;
            String pronunciation = "ثلاثه" ;
            String pronunciation2 = "3" ;
            int SoundNum = R.raw.learnnumber3 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        four.setOnClickListener(v -> {
            String word = "اربعه" ;
            String pronunciation = "اربعه" ;
            String pronunciation2 = "4" ;
            int SoundNum = R.raw.learnnumber4 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        five.setOnClickListener(v -> {
            String word = "خمسه" ;
            String pronunciation = "خمسه" ;
            String pronunciation2 = "5" ;
            int SoundNum = R.raw.learnnumber5 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        six.setOnClickListener(v -> {
            String word = "سته" ;
            String pronunciation = "سته" ;
            String pronunciation2 = "6" ;
            int SoundNum = R.raw.learnnumber6 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        sev.setOnClickListener(v -> {
            String word = "سبعه" ;
            String pronunciation = "سبعه" ;
            String pronunciation2 = "7" ;
            int SoundNum = R.raw.learnnumber7 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        eig.setOnClickListener(v -> {
            String word = "ثمانيه" ;
            String pronunciation = "ثمانيه" ;
            String pronunciation2 = "8" ;
            int SoundNum = R.raw.learnnumber8 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        nine.setOnClickListener(v -> {
            String word = "تسعه" ;
//            String num = "9";
            String pronunciation = "رقم تسعه" ;
            String pronunciation2 = "9" ;
            int SoundNum = R.raw.learnnumber9 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
//            editor.putString("TheNum",num);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });

        ten.setOnClickListener(v -> {
            String word = "عشره" ;
            String pronunciation = "رقم عشره" ;
            String pronunciation2 = "10" ;
//            String num = "10";
            int SoundNum = R.raw.learnnumber10 ;
            // int pic = R.drawable.ch1pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("TheNumber",word);
            editor.putString("ThePronunciation",pronunciation);
            editor.putString("ThePronunciation2",pronunciation2);
//            editor.putString("TheNum",num);
            editor.putInt("TheSoundNum",SoundNum);
            //editor.putInt("thepic",pic);

            editor.apply();

            Toast.makeText(Numbers.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Numbers.this, SingleNumber.class);
            startActivity(intent);
        });
    }
}