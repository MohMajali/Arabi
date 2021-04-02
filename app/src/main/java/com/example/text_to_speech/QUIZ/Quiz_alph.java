package com.example.text_to_speech.QUIZ;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.text_to_speech.LEVELS.Levels;
import com.example.text_to_speech.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

public class Quiz_alph extends AppCompatActivity {

    Button answer ;
    Button nextqestion ;
    TextView question;
    TextView score;
    TextView youranswer;

    int max = 0;
    int counter = 28 ;

    private static final int RECOGNIZER_RESULT = 1;

    Quiz_alph_questions mQuestions;
     String mAnswer ;
     int mScore = 0 ;
     int mQuestionLength;

   // Random r ;

    ArrayList<Item> QuestionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_alph);

        //r = new Random();

        answer = (Button)findViewById(R.id.answer);
        nextqestion = (Button)findViewById(R.id.nextquestion);

        question = (TextView)findViewById(R.id.question);
        score = (TextView)findViewById(R.id.score);

        youranswer = (TextView)findViewById(R.id.youranswer);

        mQuestions = new Quiz_alph_questions();
        mQuestionLength = mQuestions.mQuestions.length;

        score.setText("Score = "+mScore);

        QuestionList = new ArrayList<>();


        for(int i = 0; i < mQuestionLength; i++){
            QuestionList.add(new Item(mQuestions.getQuestion(i) , mQuestions.getCorrectAnswer(i)));
        }

        Collections.shuffle(QuestionList);

        SetQuestion(max);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voicerecogize = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                voicerecogize.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);// spilling
                voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO");

                startActivityForResult(voicerecogize,RECOGNIZER_RESULT);
            }
        });
        nextqestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(youranswer.getText().toString().equals(mAnswer) && counter != 0){
                    max++;
                    mScore++;
                    counter--;
                    score.setText("Score = "+mScore);
                    if(max < mQuestionLength) {
                        SetQuestion(max);
                    } else {
//                        quizFinished();
                    }
                } else {
                    max++;
                    counter--;
                    if(max < mQuestionLength){
                        SetQuestion(max);
                    } else {
//                        quizFinished();
                    }
                }
                if(counter == 0){
//                    quizFinished();

                    AlertDialog.Builder alert = new AlertDialog.Builder(Quiz_alph.this);
                    alert.setTitle("Mark").setMessage("Your result is: "+mScore +"\n" + "Your Are good").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        finish();
                        }
                    });
                    alert.create().show();


                }
            }
        });
    }

    private void SetQuestion(int num){

        question.setText(QuestionList.get(num).getQuestion());
        mAnswer = QuestionList.get(num).getAnswer();

        }


    private void quizFinished(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Quiz_alph.this);
        alertDialogBuilder
                .setMessage("Quiz Finished Your Score is "+ mScore)
                .setCancelable(false)
                .setPositiveButton("Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(),Quiz_alph.class));
                    }
                })
                .setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Quiz_alph.this, Levels.class);
                        startActivity(intent);
                    }
                });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==RECOGNIZER_RESULT && resultCode == RESULT_OK){
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            youranswer.setText(matches.get(0).toString());
        }

        super.onActivityResult(requestCode, resultCode, data);
    }


}