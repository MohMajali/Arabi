package com.example.text_to_speech.ALPHABETS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.text_to_speech.LEVELS.Levels;
import com.example.text_to_speech.R;

public class Level1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        SharedPreferences sp ;

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
        Button eleven = (Button)findViewById(R.id.eleven);     //Defining all the buttons by thier IDs from level1 layout
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

        one.setOnClickListener(view -> {    //when button named one clicked, do the following:

            String alphabet = "ا" ;
            String pronunciation = "حرف الالف" ;   // Defining Strings for A alphabet
            String pronunciation2 = "الف" ;

            int sound = R.raw.chr1 ;
            int pic = R.drawable.ch1pic ;   // Defining integers take the sound and the photo -- R.raw.ch1 --> From Resources a file called raw, that file has all sounds
                                                                                               // R.drawable.ch1pic --> From Resources a file called drawable, that file has all photos
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);    //By using the Sharedprefernces, save all Strings and Integers by giving each a word or symbole to differentiate from others.
            editor.putString("thepronunciation2",pronunciation2);  //E.X : "thepronunciation" is word given to the string pronunciation
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);

            editor.apply(); // save all the strings and integers in sharedpref..

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);  // After saving , jump from this page "Level1" to "SingleAlphabet" class

        });

        // What we did in button named one, we do the same processes to all other buttons here, giving them thier own sound and pics, defining the Strings and Integers then jumping
        two.setOnClickListener(view -> {

            String alphabet = "ب" ;
            String pronunciation = "حرف الباء" ;
            String pronunciation2 = "باء" ;
            int sound = R.raw.chr2 ;
            int pic = R.drawable.ch2pic ;

            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);

            editor.apply();


            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);


        });

        three.setOnClickListener(v -> {

            String alphabet = "ت" ;
            String pronunciation = "حرف التاء" ;
            String pronunciation2 = "تاء" ;
            int sound = R.raw.chr3 ;
            int pic = R.drawable.ch3pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        four.setOnClickListener(v -> {
            String alphabet = "ث" ;
            String pronunciation = "حرف الثاء" ;
            String pronunciation2 = "ثاء" ;
            int sound = R.raw.chr4 ;
            int pic = R.drawable.ch4pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        five.setOnClickListener(v -> {
            String alphabet = "ج" ;
            String pronunciation = "حرف الجيم" ;
            String pronunciation2 = "جيم" ;
            int sound = R.raw.chr5 ;
            int pic = R.drawable.ch5pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        six.setOnClickListener(v -> {
            String alphabet = "ح" ;
            String pronunciation = "حرف الحاء" ;
            String pronunciation2 = "حاء" ;
            int sound = R.raw.chr6 ;
            int pic = R.drawable.ch6pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        seven.setOnClickListener(v -> {
            String alphabet = "خ" ;
            String pronunciation = "حرف الخاء" ;
            String pronunciation2 = "خاء" ;
            int sound = R.raw.chr7 ;
            int pic = R.drawable.ch7pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        eight.setOnClickListener(v -> {
            String alphabet = "د" ;
            String pronunciation = "حرف الدال" ;
            String pronunciation2 = "دال" ;
            int sound = R.raw.chr8 ;
            int pic = R.drawable.ch8pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        nine.setOnClickListener(v -> {
            String alphabet = "ذ" ;
            String pronunciation = "حرف الذال" ;
            String pronunciation2 = "ذال" ;
            int sound = R.raw.chr9 ;
            int pic = R.drawable.ch9pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        ten.setOnClickListener(v -> {
            String alphabet = "ر" ;
            String pronunciation = "حرف الراء" ;
            String pronunciation2 = "راء" ;
            int sound = R.raw.chr10 ;
            int pic = R.drawable.ch10pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        eleven.setOnClickListener(v -> {
            String alphabet = "ز" ;
            String pronunciation = "حرف الزاي" ;
            String pronunciation2 = "زاي" ;
            int sound = R.raw.chr11 ;
            int pic = R.drawable.ch11pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twelve.setOnClickListener(v -> {
            String alphabet = "س" ;
            String pronunciation = "حرف السين" ;
            String pronunciation2 = "سين" ;
            int sound = R.raw.chr12 ;
            int pic = R.drawable.ch12pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        thirteen.setOnClickListener(v -> {
            String alphabet = "ش" ;
            String pronunciation = "حرف الشين" ;
            String pronunciation2 = "شين" ;
            int sound = R.raw.chr13 ;
            int pic = R.drawable.ch13pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        fourteen.setOnClickListener(v -> {
            String alphabet = "ص" ;
            String pronunciation = "حرف الصاد" ;
            String pronunciation2 = "صاد" ;
            int sound = R.raw.chr14 ;
            int pic = R.drawable.ch14pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        fifteen.setOnClickListener(v -> {
            String alphabet = "ض" ;
            String pronunciation = "حرف الضاد" ;
            String pronunciation2 = "الضاد" ;
            int sound = R.raw.chr15 ;
            int pic = R.drawable.ch15pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        sixteen.setOnClickListener(v -> {
            String alphabet = "ط" ;
            String pronunciation = "حرف الطاء" ;
            String pronunciation2 = "طاء" ;
            int sound = R.raw.chr16 ;
            int pic = R.drawable.ch16pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        seventeen.setOnClickListener(v -> {
            String alphabet = "ظ" ;
            String pronunciation = "حرف الظاد" ;
            String pronunciation2 = "ظاد" ;
            int sound = R.raw.chr17 ;
            int pic = R.drawable.ch17pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        eighteen.setOnClickListener(v -> {
            String alphabet = "ع" ;
            String pronunciation = "حرف العين" ;
            String pronunciation2 = "عين" ;
            int sound = R.raw.chr18 ;
            int pic = R.drawable.ch18pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        nineteen.setOnClickListener(v -> {
            String alphabet = "غ" ;
            String pronunciation = "حرف الغين" ;
            String pronunciation2 = "غين" ;
            int sound = R.raw.chr19 ;
            int pic = R.drawable.ch19pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty.setOnClickListener(v -> {
            String alphabet = "ف" ;
            String pronunciation = "حرف الفاء" ;
            String pronunciation2 = "فاء" ;
            int sound = R.raw.chr20 ;
            int pic = R.drawable.ch20pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_one.setOnClickListener(v -> {
            String alphabet = "ق" ;
            String pronunciation = "حرف القاف" ;
            String pronunciation2 = "قاف" ;
            int sound = R.raw.chr21 ;
            int pic = R.drawable.ch21pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_two.setOnClickListener(v -> {
            String alphabet = "ك" ;
            String pronunciation = "حرف الكاف" ;
            String pronunciation2 = "كاف" ;
            int sound = R.raw.chr22 ;
            int pic = R.drawable.ch22pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_three.setOnClickListener(v -> {
            String alphabet = "ل" ;
            String pronunciation = "حرف اللام" ;
            String pronunciation2 = "لام" ;
            int sound = R.raw.chr23 ;
            int pic = R.drawable.ch23pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_four.setOnClickListener(v -> {
            String alphabet = "م" ;
            String pronunciation = "حرف الميم" ;
            String pronunciation2 = "ميم" ;
            int sound = R.raw.chr24 ;
            int pic = R.drawable.ch24pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_five.setOnClickListener(v -> {
            String alphabet = "ن" ;
            String pronunciation = "حرف النون" ;
            String pronunciation2 = "نون" ;
            int sound = R.raw.chr25 ;
            int pic = R.drawable.ch25pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_six.setOnClickListener(v -> {
            String alphabet = "ه" ;
            String pronunciation = "حرف الهاء" ;
            String pronunciation2 = "هاء" ;
            int sound = R.raw.chr26 ;
            int pic = R.drawable.ch26pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_seven.setOnClickListener(v -> {
            String alphabet = "و" ;
            String pronunciation = "حرف الواو" ;
            String pronunciation2 = "واو" ;
            int sound = R.raw.chr27 ;
            int pic = R.drawable.ch27pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

        twenty_eight.setOnClickListener(v -> {
            String alphabet = "ي" ;
            String pronunciation = "حرف الياء" ;
            String pronunciation2 = "ياء" ;
            int sound = R.raw.chr28 ;
            int pic = R.drawable.ch28pic ;
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("thealphabet",alphabet);
            editor.putString("thepronunciation",pronunciation);
            editor.putString("thepronunciation2",pronunciation2);
            editor.putInt("thesound",sound);
            editor.putInt("thepic",pic);
            editor.apply();

            Intent intent = new Intent(Level1.this, SingleAlphabet.class);
            startActivity(intent);
        });

    }
}