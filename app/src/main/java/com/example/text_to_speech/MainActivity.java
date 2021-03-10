package com.example.text_to_speech;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button nextAlphabet , quizAlph , login, signup;
     ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextAlphabet = (Button) findViewById(R.id.nextAlphabet);
        quizAlph = (Button) findViewById(R.id.quiz_alph);
        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.sign);

    nextAlphabet.setOnClickListener(view -> {
        Intent intent = new Intent(MainActivity.this,activity_alphabet.class);
        startActivity(intent);
    });
    quizAlph.setOnClickListener(view -> {
        Intent intent = new Intent(MainActivity.this,Quiz_alph.class);
        startActivity(intent);
    });

    login.setOnClickListener(v -> {
      Intent intent = new Intent(MainActivity.this, login_page.class);
      startActivity(intent);
    });

    signup.setOnClickListener(v -> {
        Intent intent = new Intent(MainActivity.this, signup.class);
        startActivity(intent);
    });
    }

}