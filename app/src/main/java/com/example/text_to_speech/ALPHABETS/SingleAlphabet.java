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
    Button check ;         // Calling all the elements we used in SingleAlphabet layout
    ImageView sound ;
    ImageView alpha ;


    private static final int RECOGNIZER_RESULT = 1;  // Inittializing variables of type integer to use it a method

    private SpeechRecognizer speechRecognizer ;  // Calling a class called SpeechRecognizer and giving it a object to use
    private Intent  speechRecognizerIntent ;    //  Jump to get a service for voice recognition
    String keeper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_alphabet);


        speechRecognizer =  SpeechRecognizer.createSpeechRecognizer(SingleAlphabet.this); // Create a speech Recognizer for this page "singleAlphabet" class
        speechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);    // getting the service
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM); // Types of speech Recognizer
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO"); // choose the Arabic jordanian language
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
                //if the voice catched, put in the arraylist which is called matchesFound, then get the first index in that array and put it in the String called Keeper, then show the Alphabet in the edit text.
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
        check = (Button) findViewById(R.id.check);     // Defining all elements by thier IDs
        sound = (ImageView) findViewById(R.id.soundplayer);
        alpha = (ImageView) findViewById(R.id.alphapic);

        talk.setOnClickListener(v ->  {
          // When button named talk clicked, Use the mic photo and view it in imageview...... the mic photo taken from Resources in drawable
                Toast toast = new Toast(SingleAlphabet.this);
                ImageView imageView = new ImageView(SingleAlphabet.this);
                imageView.setImageResource(R.drawable.mic);
                toast.setView(imageView);
                toast.show();

                speechRecognizer.startListening(speechRecognizerIntent); // As mentioned in the code, start Listening
                keeper= "" ;


        });


        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("thealphabet", "");
        String str2 =sp.getString("thepronunciation", "");
        String str5 =sp.getString("thepronunciation2", "");    // What we saved in the Level1 class in the sharedprefernces , in this class, giving back the saved by there names.. remember the example in
                                                                                                        // Level1
        int str3 =sp.getInt("thesound", -1);
        int str4 =sp.getInt("thepic", -1 ) ;


        alpha.setImageResource(str4);  // str4 , is an integer to get the value of the pic we saved before in Level1 class, now it will show in the image view element named alpha

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, str3); // MediaPlayer is to play the sound we saved in Level1 class which is not str3 of type integer



        check.setOnClickListener(view -> {
          // When button named check clicked, get the text from edittext element called text, is it same as the str2?(str2 a variable got from the Level1 which been saved), or is it same to str5?
            // if one of them is true, show a correct image
            if(text.getText().toString().equals(str2) || text.getText().toString().equals(str5)){

                Toast toast = new Toast(SingleAlphabet.this);
                ImageView imageView = new ImageView(SingleAlphabet.this);
                imageView.setImageResource(R.drawable.good);
                toast.setView(imageView);
                toast.show();
            }else{
                // if one of them isn't true, show a false image

                Toast toast = new Toast(SingleAlphabet.this);
                ImageView imageView = new ImageView(SingleAlphabet.this);
                imageView.setImageResource(R.drawable.bad);
                toast.setView(imageView);
                toast.show();
            }
        });

        sound.setOnClickListener(v ->  {
          //When button named sound clicked, start the mediaplayer
                mediaPlayer.start();
                Toast.makeText(SingleAlphabet.this,str3,Toast.LENGTH_SHORT).show();

        });
    }

}
