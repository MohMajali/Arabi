package com.example.text_to_speech.WORDS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.text_to_speech.R;

public class SingleWord extends AppCompatActivity {

    TextView textView;
    Button arabic, english;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_word);

        textView = findViewById(R.id.speaker);
        arabic = findViewById(R.id.arabic);
        english = findViewById(R.id.english);

        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("TheWorld", "");
        String str2 =sp.getString("ThePronunciation", "");
        int str3 =sp.getInt("TheSoundEnglish", -1);
        int str4 = sp.getInt("TheSoundArabic",-1);
       // int str4 =sp.getInt("thepic", -1 ) ;
        //String str3 =sp.getString("thepronucVibrio", "");
        //String str4 =sp.getString("thepronucslot", "");
        //String str5 =sp.getString("thepronucbraek", "");


       // final MediaPlayer mediaPlayer = MediaPlayer.create(this, str3);


        arabic.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this,str4);
            mediaPlayer.start();
        });

        english.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this,str3);
            mediaPlayer.start();
        });
    }
}