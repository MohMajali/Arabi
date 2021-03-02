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

        one.setOnClickListener(view -> {

            String alphabet = "ا" ;
            String pronunciation = "حرف الالف" ;
           // String pronucVibrio = "اه";
           // String pronucslot = "او" ;
           // String pronucbraek = "اي";
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
           // editor.putString("thepronucVibrio",pronucVibrio);
           // editor.putString("thepronucslot",pronucslot);
           // editor.putString("thepronucbraek",pronucbraek);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);

        });
        two.setOnClickListener(view -> {

            String alphabet = "ب" ;
            String pronunciation = "حرف الباء" ;
           // String pronucVibrio = "با";
           // String pronucslot = "بو" ;
            //String pronucbraek = "بي";
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            //editor.putString("thepronucVibrio",pronucVibrio);
           // editor.putString("thepronucslot",pronucslot);
            //editor.putString("thepronucbraek",pronucbraek);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);


        });

        three.setOnClickListener(v -> {

            String alphabet = "ت" ;
            String pronunciation = "حرف التاء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        four.setOnClickListener(v -> {
            String alphabet = "ث" ;
            String pronunciation = "حرف الثاء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        five.setOnClickListener(v -> {
            String alphabet = "ج" ;
            String pronunciation = "حرف الجيم" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        six.setOnClickListener(v -> {
            String alphabet = "ح" ;
            String pronunciation = "حرف الحاء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        seven.setOnClickListener(v -> {
            String alphabet = "خ" ;
            String pronunciation = "حرف الخاء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        eight.setOnClickListener(v -> {
            String alphabet = "د" ;
            String pronunciation = "حرف الدال" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        nine.setOnClickListener(v -> {
            String alphabet = "ذ" ;
            String pronunciation = "حرف الذال" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        ten.setOnClickListener(v -> {
            String alphabet = "ر" ;
            String pronunciation = "حرف الراء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        eleven.setOnClickListener(v -> {
            String alphabet = "ز" ;
            String pronunciation = "حرف الزاي" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twelve.setOnClickListener(v -> {
            String alphabet = "س" ;
            String pronunciation = "حرف السين" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        thirteen.setOnClickListener(v -> {
            String alphabet = "ش" ;
            String pronunciation = "حرف الشين" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        fourteen.setOnClickListener(v -> {
            String alphabet = "ص" ;
            String pronunciation = "حرف الصاد" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        fifteen.setOnClickListener(v -> {
            String alphabet = "ض" ;
            String pronunciation = "حرف الضاد" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        sixteen.setOnClickListener(v -> {
            String alphabet = "ط" ;
            String pronunciation = "حرف الطاء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        seventeen.setOnClickListener(v -> {
            String alphabet = "ظ" ;
            String pronunciation = "حرف الظاد" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        eighteen.setOnClickListener(v -> {
            String alphabet = "ع" ;
            String pronunciation = "حرف العين" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        nineteen.setOnClickListener(v -> {
            String alphabet = "غ" ;
            String pronunciation = "حرف الغين" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty.setOnClickListener(v -> {
            String alphabet = "ف" ;
            String pronunciation = "حرف الفاء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_one.setOnClickListener(v -> {
            String alphabet = "ق" ;
            String pronunciation = "حرف القاف" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_two.setOnClickListener(v -> {
            String alphabet = "ك" ;
            String pronunciation = "حرف الكاف" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_three.setOnClickListener(v -> {
            String alphabet = "ل" ;
            String pronunciation = "حرف اللام" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_four.setOnClickListener(v -> {
            String alphabet = "م" ;
            String pronunciation = "حرف الميم" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_five.setOnClickListener(v -> {
            String alphabet = "ن" ;
            String pronunciation = "حرف النون" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_six.setOnClickListener(v -> {
            String alphabet = "ه" ;
            String pronunciation = "حرف الهاء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_seven.setOnClickListener(v -> {
            String alphabet = "و" ;
            String pronunciation = "حرف الواو" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        twenty_eight.setOnClickListener(v -> {
            String alphabet = "ي" ;
            String pronunciation = "حرف الياء" ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.apply();

            Toast.makeText(activity_alphabet.this,"done",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(activity_alphabet.this,activity_singleAlphabet.class);
            startActivity(intent);
        });

        backmain.setOnClickListener(view -> {
            Intent intent = new Intent(activity_alphabet.this,MainActivity.class);
            startActivity(intent);
        });
    }
}