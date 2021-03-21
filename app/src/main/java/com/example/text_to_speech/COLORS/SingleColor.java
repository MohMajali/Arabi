package com.example.text_to_speech.COLORS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.text_to_speech.R;

public class SingleColor extends AppCompatActivity {

    TextView textView;
    Button sound;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_color);

        textView = findViewById(R.id.colorspeak);
        sound = findViewById(R.id.sound);

        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("TheWorld", "");
        String str2 =sp.getString("ThePronunciation", "");
        int str3 =sp.getInt("TheSound", -1);

        sound.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this,str3);
            mediaPlayer.start();
        });
    }
}