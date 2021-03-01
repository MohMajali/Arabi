package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class activity_alphabet extends AppCompatActivity {
    Button backmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        SharedPreferences sp ;
        backmain = (Button)findViewById(R.id.backalphabet);
        //update 1.1111
        sp = getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);

        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);
        Button ten = (Button)findViewById(R.id.ten);
        Button eleven = (Button)findViewById(R.id.eleven);
        Button twelve = (Button)findViewById(R.id.twelve);
        Button thirteen = (Button)findViewById(R.id.thirteen);
        Button fourteen = (Button)findViewById(R.id.fourteen);
        Button fifteen = (Button)findViewById(R.id.fifteen);
        Button sixteen = (Button)findViewById(R.id.sixteen);
        Button seventeen = (Button)findViewById(R.id.seventeen);
        Button eighteen = (Button)findViewById(R.id.eighteen);
        Button nineteen = (Button)findViewById(R.id.nineteen);
        Button twenty = (Button)findViewById(R.id.twenty);
        Button twenty_one = (Button)findViewById(R.id.twenty_one);
        Button twenty_two = (Button)findViewById(R.id.twenty_two);
        Button twenty_three = (Button)findViewById(R.id.twenty_three);
        Button twenty_four = (Button)findViewById(R.id.twenty_four);
        Button twenty_five = (Button)findViewById(R.id.twenty_five);
        Button twenty_six = (Button)findViewById(R.id.twenty_six);
        Button twenty_seven = (Button)findViewById(R.id.twenty_seven);
        Button twenty_eight = (Button)findViewById(R.id.twenty_eight);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String alphabet = "ا" ;
                String pronunciation = "الف" ;
                String pronucVibrio = "اه";
                String pronucslot = "او" ;
                String pronucbraek = "اي";
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("thealphabet",alphabet);
                editor.putString("thepronunciation",pronunciation);
                editor.putString("thepronucVibrio",pronucVibrio);
                editor.putString("thepronucslot",pronucslot);
                editor.putString("thepronucbraek",pronucbraek);
                editor.commit();

                Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
                startActivity(intent);



            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String alphabet = "ب" ;
                String pronunciation = "باء" ;
                String pronucVibrio = "با";
                String pronucslot = "بو" ;
                String pronucbraek = "بي";
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("thealphabet",alphabet);
                editor.putString("thepronunciation",pronunciation);
                editor.putString("thepronucVibrio",pronucVibrio);
                editor.putString("thepronucslot",pronucslot);
                editor.putString("thepronucbraek",pronucbraek);
                editor.commit();

                Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
                startActivity(intent);


            }
        });





        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_alphabet.this,MainActivity.class);
                startActivity(intent);
            }
        });






    }
}