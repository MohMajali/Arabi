package com.example.text_to_speech.VowelsWord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.text_to_speech.R;

public class Aclass extends AppCompatActivity {

    Button dad , mama, door,ghazal,roman;

    SharedPreferences sp ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aclass);

        dad = findViewById(R.id.dad);
        mama = findViewById(R.id.mama);
        door = findViewById(R.id.door);
        ghazal = findViewById(R.id.ghazal);
        roman = findViewById(R.id.roman);

        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        dad.setOnClickListener(v -> {

            String AWord = "بابا" ;
            String pronunciation = "بابا" ;
            int sound = R.raw.dad ;
            int pic = R.drawable.baba ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",AWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Aclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Aclass.this, Singlevowelword.class);
            startActivity(intent);

        });

        mama.setOnClickListener(v -> {

            String AWord = "ماما" ;
            String pronunciation = "ماما" ;
            int sound = R.raw.mama ;
            int pic = R.drawable.mama ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",AWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Aclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Aclass.this, Singlevowelword.class);
            startActivity(intent);
        });

        door.setOnClickListener(v -> {

            String AWord = "باب" ;
            String pronunciation = "باب" ;
            int sound = R.raw.door ;
            int pic = R.drawable.bab
                    ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",AWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Aclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Aclass.this, Singlevowelword.class);
            startActivity(intent);
        });

        ghazal.setOnClickListener(v -> {
            String AWord = "غزال" ;
            String pronunciation = "غزال" ;
            int sound = R.raw.ghazal ;
            int pic = R.drawable.ghazal;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",AWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Aclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Aclass.this, Singlevowelword.class);
            startActivity(intent);
        });

        roman.setOnClickListener(v -> {
            String AWord = "رمان" ;
            String pronunciation = "رمان" ;
            int sound = R.raw.roman ;
            int pic = R.drawable.roman;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",AWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Aclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Aclass.this, Singlevowelword.class);
            startActivity(intent);
        });
    }
}