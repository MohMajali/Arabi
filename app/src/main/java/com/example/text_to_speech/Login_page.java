package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Login_page extends AppCompatActivity {

    EditText user , pass;
    Button login;
    Button signup ;
    Button skip;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        user = (EditText) findViewById(R.id.username);// Defining the edittexts by their IDS
        pass = (EditText) findViewById(R.id.password);

        login = (Button) findViewById(R.id.login); // Defining the button by ID
        signup = (Button) findViewById(R.id.signup);

        dialog = new ProgressDialog(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_page.this, Signup.class);
                startActivity(intent);
            }
        });

        skip = (Button) findViewById(R.id.skiplogin); //delete this
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_page.this, Levels.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(v -> Login()); //setonclicklistiner --> when button clicked do the function " login() function"
    }

    private void Login(){

        dialog.setTitle("Log In");
        dialog.setMessage("Please wait....");
        dialog.show();

        RequestQueue rq = Volley.newRequestQueue(this);
        final StringRequest stringRequest =new StringRequest(Request.Method.POST, "http://10.0.2.2/login.php", response -> {
            try {
                JSONObject jsonObject = new JSONObject(response);
                if (!jsonObject.getBoolean("error")) {

                    dialog.dismiss();
                    //By getting the boolean jsonobject which equals false from php file do the following:

                    Toast.makeText(Login_page.this, jsonObject.getString("message"), Toast.LENGTH_LONG).show();
                    // show a message from php if the user has logged in successfully "Login successfully"

                    //When User logged in successfully get the data from array called response in php
                    user user = new user(jsonObject.getInt("userid"), jsonObject.getString("username"),
                            jsonObject.getString("email"));

                    //store user data inside sharedprefrences
                    sharedprefmanager.getInstance(getApplicationContext()).storeUserData(user);

                    //let user in
                    finish();
                    //move to alphabet activity
                    startActivity(new Intent(Login_page.this, Levels.class));


                } else {
                    //By getting the boolean jsonobject which equals true from php file do the following:
                    Toast.makeText(Login_page.this, jsonObject.getString("message"), Toast.LENGTH_LONG).show();
                    // show a message from php if the user hasn't logged in successfully "Invalid username or password"
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //When can't access to network, show a message
                if(error instanceof NetworkError){
                    dialog.setTitle("Network Error");
                    dialog.setMessage("Cannot connect to Internet\nPlease check your connection!");

                  //  Toast.makeText(Login_page.this,"Cannot connect to Internet\nPlease check your connection!",Toast.LENGTH_LONG).show();
                } else if(error instanceof ServerError){
                    dialog.setTitle("Server Error");
                    dialog.setMessage("The server could not be found\n Please try again after some time!");

                    //Toast.makeText(Login_page.this,"The server could not be found\n Please try again after some time!",Toast.LENGTH_LONG).show();
                }else if(error instanceof TimeoutError){
                    dialog.setTitle("Timeout Error");
                    dialog.setMessage("Connection TimeOut! Please check your internet connection!");

                    //Toast.makeText(Login_page.this,"Connection TimeOut! Please check your internet connection",Toast.LENGTH_LONG).show();
                }
            }
        }

        ){
            @Override
            protected Map<String,String> getParams() throws AuthFailureError{
                Map<String,String> params = new HashMap<String, String>();
                params.put("username",user.getText().toString());
                params.put("password", pass.getText().toString());
                return params;
            }
        };
        rq.add(stringRequest);
    }
}