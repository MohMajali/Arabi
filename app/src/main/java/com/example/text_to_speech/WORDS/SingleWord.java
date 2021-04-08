package com.example.text_to_speech.WORDS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
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

import com.example.text_to_speech.ALPHABETS.SingleAlphabet;
import com.example.text_to_speech.R;
import com.example.text_to_speech.VowelsWord.Singlevowelword;

import java.util.ArrayList;

public class SingleWord extends AppCompatActivity {
    EditText text ;
    Button talk ;
    Button check ;
    ImageView arabic, english;
    TextView textView ;
    private static final int RECOGNIZER_RESULT = 1;
    MediaPlayer mediaPlayer;

    private SpeechRecognizer speechRecognizer ;
    private Intent speechRecognizerIntent ;
    String keeper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_word);

        arabic = findViewById(R.id.soundplayerarabic);
        english = findViewById(R.id.soundplayerenglish);
        textView = findViewById(R.id.wordtext);

        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("TheWorld", "");
        String str2 =sp.getString("ThePronunciation", "");
        int str3 =sp.getInt("TheSoundEnglish", -1);
        int str4 = sp.getInt("TheSoundArabic",-1);

        textView.setText(str1);



        arabic.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this,str4);
            mediaPlayer.start();
        });

        english.setOnClickListener(v -> {
            mediaPlayer = MediaPlayer.create(this,str3);
            mediaPlayer.start();
        });

        speechRecognizer =  SpeechRecognizer.createSpeechRecognizer(SingleWord.this);
        speechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
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

                if(matchesFound!=null){
                    keeper =matchesFound.get(0);
//                    Toast.makeText(SingleWord.this, "Result = " + keeper, Toast.LENGTH_SHORT).show();
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


                Toast toast = new Toast(SingleWord.this);
                ImageView imageView = new ImageView(SingleWord.this);
                imageView.setImageResource(R.drawable.mic);
                toast.setView(imageView);
                toast.show();

                speechRecognizer.startListening(speechRecognizerIntent);
                keeper= "" ;

            }
        });



        final MediaPlayer mediaPlayer = MediaPlayer.create(this, str3);

        check.setOnClickListener(view -> {

            if(text.getText().toString().equals(str2)){

                Toast toast = new Toast(SingleWord.this);
                ImageView imageView = new ImageView(SingleWord.this);
                imageView.setImageResource(R.drawable.good);
                toast.setView(imageView);
                toast.show();
            }else{
                Toast toast = new Toast(SingleWord.this);
                ImageView imageView = new ImageView(SingleWord.this);
                imageView.setImageResource(R.drawable.bad);
                toast.setView(imageView);
                toast.show();
            }
        });



    }
}


