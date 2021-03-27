package com.example.text_to_speech.VowelsWord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.text_to_speech.R;

public class Singlevowelword extends AppCompatActivity {

    Button voice;
    TextView fill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlevowelword);

        voice = findViewById(R.id.avoice);
        fill = findViewById(R.id.fillin);

        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("AWord", "");
        String str2 =sp.getString("TheAPronunciation", "");
        int str3 =sp.getInt("ASound", -1);
        int str4 =sp.getInt("APic", -1 ) ;

        voice.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this,str3);
            mediaPlayer.start();
        });
    }
}