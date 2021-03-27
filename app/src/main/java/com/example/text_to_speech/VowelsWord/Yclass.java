package com.example.text_to_speech.VowelsWord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.text_to_speech.R;

public class Yclass extends AppCompatActivity {

    Button milk , korsi , feel , reesh , baet;
    SharedPreferences sp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yclass);

        milk = findViewById(R.id.milk);
        korsi = findViewById(R.id.korsi);
        feel = findViewById(R.id.feel);
        reesh = findViewById(R.id.reesh);
        baet = findViewById(R.id.baet);

        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        milk.setOnClickListener(v -> {

            String wawWord = "حليب" ;
            String pronunciation = "حليب" ;
            int sound = R.raw.milk;
            int pic = R.drawable.milk;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Yclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Yclass.this, Singlevowelword.class);
            startActivity(intent);
        });

        korsi.setOnClickListener(v -> {

            String wawWord = "كرسي" ;
            String pronunciation = "كرسي" ;
            int sound = R.raw.korsi;
            int pic = R.drawable.korsi;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Yclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Yclass.this, Singlevowelword.class);
            startActivity(intent);
        });

        feel.setOnClickListener(v -> {

            String wawWord = "فيل" ;
            String pronunciation = "فيل" ;
            int sound = R.raw.feel;
            int pic = R.drawable.feel;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Yclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Yclass.this, Singlevowelword.class);
            startActivity(intent);
        });

        reesh.setOnClickListener(v -> {

            String wawWord = "ريش" ;
            String pronunciation = "ريش" ;
            int sound = R.raw.reesh;
            int pic = R.drawable.reesh;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Yclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Yclass.this, Singlevowelword.class);
            startActivity(intent);
        });

        baet.setOnClickListener(v -> {
            String wawWord = "بيت" ;
            String pronunciation = "بيت" ;
            int sound = R.raw.baet;
            int pic = R.drawable.baet;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("AWord",wawWord);
            editor.putString("TheAPronunciation",pronunciation);
            editor.putInt("ASound",sound);
            editor.putInt("APic",pic);

            editor.apply();

            Toast.makeText(Yclass.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Yclass.this, Singlevowelword.class);
            startActivity(intent);
        });
    }
}