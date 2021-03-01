package com.example.text_to_speech;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_singleAlphabet extends AppCompatActivity {
    EditText text ;
    Button button ;
    Button check ;
    private static final int RECOGNIZER_RESULT = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_alphabet);
        TextView textView =findViewById(R.id.textView);
        text = (EditText) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);
        check = (Button) findViewById(R.id.check);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent text  = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//                text.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//                text.putExtra(RecognizerIntent.EXTRA_PROMPT,"speech to text");
//                startActivityForResult(text,RECOGNIZER_RESULT);
                Intent voicerecogize = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                voicerecogize.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);// spilling
                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO");

                startActivityForResult(voicerecogize,RECOGNIZER_RESULT);

            }
        });

        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("thealphabet", "");
        String str2 =sp.getString("thepronunciation", "");
        String str3 =sp.getString("thepronucVibrio", "");
        String str4 =sp.getString("thepronucslot", "");
        String str5 =sp.getString("thepronucbraek", "");


        textView.setText(str1);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().toString().equals(str3+" "+str4+" "+str5)){
                    Toast.makeText(activity_singleAlphabet.this,"correct",Toast.LENGTH_SHORT).show();

                }else if(text.getText().toString().equals(str2)){
                    Toast.makeText(activity_singleAlphabet.this,"correct",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(activity_singleAlphabet.this,"false",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==RECOGNIZER_RESULT && resultCode == RESULT_OK){
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            text.setText(matches.get(0).toString());
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
