package com.example.text_to_speech;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class SingleAlphabet extends AppCompatActivity {
    EditText text ;
    Button button ;
    Button check ;
    Button sound ;
    private static final int RECOGNIZER_RESULT = 1;

    private SpeechRecognizer speechRecognizer ;
    private Intent  speechRecognizerIntent ;
    String keeper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_alphabet);

        checkVoiceCommandPermission();
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
                    Toast.makeText(SingleAlphabet.this, "Result = " + keeper, Toast.LENGTH_SHORT).show();
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




        TextView textView =findViewById(R.id.textView);
        text = (EditText) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);
        check = (Button) findViewById(R.id.check);
        sound = (Button) findViewById(R.id.soundplayer);
        button.setOnClickListener(new View.OnClickListener() {
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

                speechRecognizer.startListening(speechRecognizerIntent);
                keeper= "" ;

            }
        });


        SharedPreferences sp =getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String str1 =sp.getString("thealphabet", "");
        String str2 =sp.getString("thepronunciation", "");
        int str3 =sp.getInt("thesound", -1);
        //String str3 =sp.getString("thepronucVibrio", "");
        //String str4 =sp.getString("thepronucslot", "");
        //String str5 =sp.getString("thepronucbraek", "");


        final MediaPlayer mediaPlayer = MediaPlayer.create(this, str3);

        textView.setText(str1);

        check.setOnClickListener(view -> {
            /*
            if(text.getText().toString().equals(str3+" "+str4+" "+str5)){
                Toast.makeText(activity_singleAlphabet.this,"correct",Toast.LENGTH_SHORT).show();

            }*/
            if(text.getText().toString().equals(str2)){

                Toast.makeText(SingleAlphabet.this,"correct",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(SingleAlphabet.this,"false",Toast.LENGTH_SHORT).show();
            }
        });

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(SingleAlphabet.this,str3,Toast.LENGTH_SHORT).show();
            }
        });
    }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        if(requestCode==RECOGNIZER_RESULT && resultCode == RESULT_OK){
//            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
//            text.setText(matches.get(0));
//        }
//
//        super.onActivityResult(requestCode, resultCode, data);


    private void checkVoiceCommandPermission(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(!(ContextCompat.checkSelfPermission(SingleAlphabet.this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED))
            {
                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:"+getPackageName()));
                startActivity(intent);
                finish();
            }
        }
    }





}
