package com.example.text_to_speech;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Quiz_alph extends AppCompatActivity {

    Button answer ;
    Button nextqestion ;
    TextView question;
    TextView score;
    TextView youranswer;
    private static final int RECOGNIZER_RESULT = 1;

    private Quiz_alph_questions mQuestions = new Quiz_alph_questions();

    private String mAnswer ;
    private int mScore = 0 ;
    private int mQuestionLength = mQuestions.mQuestions.length;

    Random r ;

    int counter = 28 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_alph);

        r = new Random();


        answer = (Button)findViewById(R.id.answer);
        nextqestion = (Button)findViewById(R.id.nextquestion);

        question = (TextView)findViewById(R.id.question);
        score = (TextView)findViewById(R.id.score);
        youranswer = (TextView)findViewById(R.id.youranswer);

        score.setText("Score = "+mScore);

        updateQuestion(r.nextInt(mQuestionLength));

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
                if(youranswer.getText().toString().equals(mAnswer)&& counter!=0){
                    mScore++;
                    score.setText("Score = "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                    Toast.makeText(Quiz_alph.this,"Correct",Toast.LENGTH_SHORT).show();
                    counter--;
                }else if(!youranswer.getText().toString().equals(mAnswer)&& counter!=0){
                    updateQuestion(r.nextInt(mQuestionLength));
                    Toast.makeText(Quiz_alph.this,"False",Toast.LENGTH_SHORT).show();
                    counter--;
                }else{
                   // quizFinished();
                    Intent intent = new Intent(Quiz_alph.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(Quiz_alph.this,"Finish",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));

        // int random []= new int[mQuestionLength];
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < mQuestionLength) {

            int random = randomGenerator .nextInt(mQuestionLength);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }

        mAnswer = mQuestions.getCorrectAnswer(num);
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
                        Intent intent = new Intent(Quiz_alph.this,MainActivity.class);
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