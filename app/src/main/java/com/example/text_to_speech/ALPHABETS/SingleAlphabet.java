package com.example.text_to_speech.ALPHABETS;

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
import android.widget.Toast;

import com.example.text_to_speech.R;

import java.util.ArrayList;

public class SingleAlphabet extends AppCompatActivity {
    EditText text ;
    Button talk ;
    Button check ;
    ImageView sound ;
    ImageView alpha ;
    private static final int RECOGNIZER_RESULT = 1;

    private SpeechRecognizer speechRecognizer ;
    private Intent  speechRecognizerIntent ;
    String keeper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_alphabet);


        speechRecognizer =  SpeechRecognizer.createSpeechRecognizer(SingleAlphabet.this);
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
//                    Toast.makeText(SingleAlphabet.this, "Result = " + keeper, Toast.LENGTH_SHORT).show();
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
        sound = (ImageView) findViewById(R.id.soundplayer);
        alpha = (ImageView) findViewById(R.id.alphapic);

        talk.setOnClickListener(v ->  {

                Toast toast = new Toast(SingleAlphabet.this);
                ImageView imageView = new ImageView(SingleAlphabet.this);
                imageView.setImageResource(R.drawable.mic);
                toast.setView(imageView);
                toast.show();

                speechRecognizer.startListening(speechRecognizerIntent);
                keeper= "" ;


        });


        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("thealphabet", "");
        String str2 =sp.getString("thepronunciation", "");
        String str5 =sp.getString("thepronunciation2", "");
        int str3 =sp.getInt("thesound", -1);
        int str4 =sp.getInt("thepic", -1 ) ;


        alpha.setImageResource(str4);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, str3);



        check.setOnClickListener(view -> {

            if(text.getText().toString().equals(str2) || text.getText().toString().equals(str5)){

                Toast toast = new Toast(SingleAlphabet.this);
                ImageView imageView = new ImageView(SingleAlphabet.this);
                imageView.setImageResource(R.drawable.good);
                toast.setView(imageView);
                toast.show();
            }else{
                Toast toast = new Toast(SingleAlphabet.this);
                ImageView imageView = new ImageView(SingleAlphabet.this);
                imageView.setImageResource(R.drawable.bad);
                toast.setView(imageView);
                toast.show();
            }
        });

        sound.setOnClickListener(v ->  {

                mediaPlayer.start();
                Toast.makeText(SingleAlphabet.this,str3,Toast.LENGTH_SHORT).show();

        });
    }

}
