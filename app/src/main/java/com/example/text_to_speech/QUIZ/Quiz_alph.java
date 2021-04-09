package com.example.text_to_speech.QUIZ;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.text_to_speech.ALPHABETS.SingleAlphabet;
import com.example.text_to_speech.LEVELS.Levels;
import com.example.text_to_speech.PROCESS.Login_page;
import com.example.text_to_speech.R;
import com.example.text_to_speech.STORAGE.User;
import com.example.text_to_speech.STORAGE.sharedprefmanager;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Quiz_alph extends AppCompatActivity {

    Button answer;
    Button nextqestion;
    TextView question;
    TextView score;
    TextView youranswer;


    int max = 0;
    int counter = 28;

    User user;

    private static final int RECOGNIZER_RESULT = 1;

    private SpeechRecognizer speechRecognizer;
    private Intent speechRecognizerIntent;
    String keeper = "";

    Quiz_alph_questions mQuestions;
    String mAnswer;
    int mScore = 0;
    int mQuestionLength;


    ArrayList<Item> QuestionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_alph);


        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(Quiz_alph.this);
        speechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar-JO");
        //Locale.getDefault()

        answer = (Button) findViewById(R.id.answer);
        nextqestion = (Button) findViewById(R.id.nextquestion);

        question = (TextView) findViewById(R.id.question);
        score = (TextView) findViewById(R.id.score);

        youranswer = (TextView) findViewById(R.id.youranswer);

        mQuestions = new Quiz_alph_questions();
        mQuestionLength = mQuestions.mQuestions.length;

        score.setText("Score = " + mScore);

        QuestionList = new ArrayList<>();


        for (int i = 0; i < mQuestionLength; i++) {
            QuestionList.add(new Item(mQuestions.getQuestion(i), mQuestions.getCorrectAnswer(i)));
        }

        Collections.shuffle(QuestionList);

        SetQuestion(max);

        user = sharedprefmanager.getInstance(this).getUserData();


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
//                    Toast.makeText(Quiz_alph.this, "Result = " + keeper, Toast.LENGTH_SHORT).show();
                    youranswer.setText(keeper);
                }
            }

            @Override
            public void onPartialResults(Bundle bundle) {

            }

            @Override
            public void onEvent(int i, Bundle bundle) {

            }
        });

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(Quiz_alph.this);
                ImageView imageView = new ImageView(Quiz_alph.this);
                imageView.setImageResource(R.drawable.mic);
                toast.setView(imageView);
                toast.show();

                speechRecognizer.startListening(speechRecognizerIntent);
                keeper = "";
            }
        });
        nextqestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (youranswer.getText().toString().equals(mAnswer) && counter != 0 || youranswer.getText().toString().equals(question.getText().toString()) && counter != 0) {
                    max++;
                    mScore++;
                    counter--;
                    score.setText("Score = " + mScore);
                    if (max < QuestionList.size()) {
                        SetQuestion(max);
                    }
                } else {
                    max++;
                    counter--;
                    if (max < QuestionList.size()) {
                        SetQuestion(max);
                    }
                }
                if (counter == 0){

                    quiz();

                    if (mScore >= 14) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(Quiz_alph.this);
                        alert.setTitle("Mark").setMessage("Your result is: " + mScore + "\n" + "You are good").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                        alert.create().show();
                    } else {
                        AlertDialog.Builder alert = new AlertDialog.Builder(Quiz_alph.this);
                        alert.setTitle("Mark").setMessage("Your result is: " + mScore + "\n" + "Retry Again").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                        alert.create().show();
                    }
                }
            }
        });
    }

    private void SetQuestion(int num) {

        question.setText(QuestionList.get(num).getQuestion());
        mAnswer = QuestionList.get(num).getAnswer();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == RECOGNIZER_RESULT && resultCode == RESULT_OK) {
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            youranswer.setText(matches.get(0).toString());
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    private void quiz() {
        int userid = user.getUserid();
        String Userid = String.valueOf(userid);
        String username = user.getUsername();
        String email = user.getEmail();
        String score = String.valueOf(mScore);

        RequestQueue rq = Volley.newRequestQueue(this);
        final StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://10.0.2.2/quiz.php", response -> {
            try {
                JSONObject jsonObject = new JSONObject(response);

                if (!jsonObject.getBoolean("error")) {

                    Toast.makeText(Quiz_alph.this, jsonObject.getString("message"), Toast.LENGTH_LONG).show();
                    // show a message from php if the user has logged in successfully "Login successfully"

                    //let user in
                    finish();
                    //move to alphabet activity
                    startActivity(new Intent(Quiz_alph.this, Levels.class));

                } else {
                    Toast.makeText(Quiz_alph.this,jsonObject.getString("message"),Toast.LENGTH_LONG).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }, error -> {
            if (error instanceof NetworkError) {
                Toast.makeText(Quiz_alph.this, "Cannot connect to Internet\nPlease check your connection!", Toast.LENGTH_LONG).show();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String, String>();
                params.put("userid",Userid);
                params.put("username",username);
                params.put("email",email);
                params.put("score",score);
                return params;

            }
        };
        rq.add(stringRequest);

    }




}