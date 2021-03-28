package com.example.text_to_speech.VowelsWord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.text_to_speech.NUMBERS.SingleNumber;
import com.example.text_to_speech.R;

import java.util.ArrayList;

public class Singlevowelword extends AppCompatActivity {

    EditText text;
    Button talk;
    Button check;
    ImageView imageView;
    private static final int RECOGNIZER_RESULT = 1;
    MediaPlayer mediaPlayer;

    private SpeechRecognizer speechRecognizer;
    private Intent speechRecognizerIntent;
    String keeper = "";

    ImageView sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlevowelword);

        imageView = findViewById(R.id.aword);
//        textView = findViewById(R.id.aword);
        sound = findViewById(R.id.avoice);

        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("AWord", "");
        String str2 =sp.getString("TheAPronunciation", "");
        int str3 =sp.getInt("ASound", -1);
        int str4 =sp.getInt("APic", -1 ) ;

        sound.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(this,str3);
            mediaPlayer.start();
        });
//        textView.setText(str1);
        imageView.setImageResource(str4);

        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(Singlevowelword.this);
        speechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO");
        //Locale.getDefault()


        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle bundle) {

            }

            @Override
            public void onBeginningOfSpeech() {

            }

            @Override
            public void onRmsChanged(float v) {

            }

            @Override
            public void onBufferReceived(byte[] bytes) {

            }

            @Override
            public void onEndOfSpeech() {

            }

            @Override
            public void onError(int i) {

            }

            @Override
            public void onResults(Bundle bundle) {
                ArrayList<String> matchesFound = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);

                if (matchesFound != null) {
                    keeper = matchesFound.get(0);
                    Toast.makeText(Singlevowelword.this, "Result = " + keeper, Toast.LENGTH_SHORT).show();
                    text.setText(keeper);
                }
            }

            @Override
            public void onPartialResults(Bundle bundle) {

            }

            @Override
            public void onEvent(int i, Bundle bundle) {

            }
        });

        text = (EditText) findViewById(R.id.text);
        talk = (Button) findViewById(R.id.Talk);
        check = (Button) findViewById(R.id.check);

        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
////                Intent text  = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
////                text.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
////                text.putExtra(RecognizerIntent.EXTRA_PROMPT,"speech to text");
////                startActivityForResult(text,RECOGNIZER_RESULT);
//                Intent voicerecogize = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//
//                voicerecogize.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
//                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);// spilling
//                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO");
//
//                startActivityForResult(voicerecogize,RECOGNIZER_RESULT);

                Toast toast = new Toast(Singlevowelword.this);
                ImageView imageView = new ImageView(Singlevowelword.this);
                imageView.setImageResource(R.drawable.mic);
                toast.setView(imageView);
                toast.show();

                speechRecognizer.startListening(speechRecognizerIntent);
                keeper = "";

            }
        });


        check.setOnClickListener(view -> {
            /*
            if(text.getText().toString().equals(str3+" "+str4+" "+str5)){
                Toast.makeText(activity_singleAlphabet.this,"correct",Toast.LENGTH_SHORT).show();

            }*/
            if (text.getText().toString().equals(str2) || text.getText().toString().equals(str4)) {

                Toast.makeText(Singlevowelword.this, "correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Singlevowelword.this, "false", Toast.LENGTH_SHORT).show();
            }
        });


    }
}