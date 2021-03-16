package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
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

public class Signup extends AppCompatActivity {
    EditText username,password,email;
    Button signup;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = (EditText) findViewById(R.id.Name);  // Defining the edittexts by their IDS
        password = (EditText) findViewById(R.id.pass);
        email = (EditText) findViewById(R.id.email);

        signup = (Button) findViewById(R.id.button3); // Defining the button by ID

        dialog = new ProgressDialog(this);

        signup.setOnClickListener(v -> register());  //setonclicklistiner --> when button clicked do the function " register() function"
    }

    private void register(){

        dialog.setTitle("Creating your account");
        dialog.setMessage("Please wait....");
        dialog.show();

        String Username = username.getText().toString(); // When the user filled the data in the edittexts, we are taking the text from edittext
        String pass = password.getText().toString();    // then converting it to strings
        String Email = email.getText().toString();

        if(Username.isEmpty() || pass.isEmpty() || Email.isEmpty()){
            if(Username.isEmpty()){
                username.setError("fill in");
                username.requestFocus();
                dialog.dismiss();          //checking if the edittext are not empty, if one of them or all all empty, we are setting an error
            }                                    //on edittexts to notify him filed must not be empty
            if(pass.isEmpty()){
                password.setError("fill in");
                password.requestFocus();
                dialog.dismiss();
            }
            if(Email.isEmpty()){
                email.setError("fill in");
                email.requestFocus();
                dialog.dismiss();
            }

        } else { // if no fileds are empty, then do the registeration process
            /*
            Volley is an HTTP library that makes networking for Android apps easier and most importantly, faster

            Volley offers the following benefits:

           Automatic scheduling of network requests.
           Multiple concurrent network connections.
           Transparent disk and memory response caching with standard HTTP cache coherence.
           Support for request prioritization.
           Cancellation request API. You can cancel a single request, or you can set blocks or scopes of requests to cancel.
           Ease of customization, for example, for retry and backoff.
           Strong ordering that makes it easy to correctly populate your UI with data fetched asynchronously from the network.
           Debugging and tracing tools
             */
            RequestQueue rq = Volley.newRequestQueue(this);
            //StringRequest. Specify a URL and receive a raw string in response
            final StringRequest stringRequest =new StringRequest(Request.Method.POST, "http://10.0.2.2/sign_up.php",
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                if (!jsonObject.getBoolean("error")){

                                    dialog.dismiss();

                                    //By getting the boolean jsonobject which equals true from php file do the following:
                                    // show a message from php if the user has registered with an existing username from other user "User already register"

                                    //By getting the boolean jsonobject which equals false from php file do the following:
                                    // show a message from php if the user has registered  successfully "User registered successfully"
                                    Toast.makeText(Signup.this,jsonObject.getString("message"),Toast.LENGTH_LONG).show();

                                    //When User registered successfully get the data from array called user in php
                                    JSONObject jsonObjectUser =  jsonObject.getJSONObject("user");

                                    //By calling the class called user by making new object then getting the data to put in the user data(refer to user class)
                                    user user = new user(jsonObjectUser.getInt("userid"), jsonObjectUser.getString("username"),
                                            jsonObjectUser.getString("email"));

                                    //store the data in sharedprefernces
                                    sharedprefmanager.getInstance(getApplicationContext()).storeUserData(user);

                                    //let user in
                                    finish();
                                    //move to alphabet activity
                                    startActivity(new Intent(Signup.this, Level1.class));
                                }else {
                                    Toast.makeText(Signup.this,jsonObject.getString("message"),Toast.LENGTH_LONG).show();
                                }
                            } catch (JSONException e) {
                                Log.i("msg1",e.getMessage());
                            }
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    //When can't access to network, show a message
                    if(error instanceof NetworkError){
                        dialog.setTitle("Network Error");
                        dialog.setMessage("Cannot connect to Internet\nPlease check your connection!");
                        //Toast.makeText(Signup.this,"Cannot connect to Internet\nPlease check your connection!",Toast.LENGTH_LONG).show();
                    } else if(error instanceof ServerError){
                        dialog.setTitle("Server Error");
                        dialog.setMessage("The server could not be found\n Please try again after some time!");
                       // Toast.makeText(Signup.this,"The server could not be found\n Please try again after some time!",Toast.LENGTH_LONG).show();
                    }else if(error instanceof TimeoutError){
                        dialog.setTitle("Timeout Error");
                        dialog.setMessage("Connection TimeOut! Please check your internet connection!");
                       //Toast.makeText(Signup.this,"Connection TimeOut! Please check your internet connection",Toast.LENGTH_LONG).show();
                    }

                }
            })
            {
                @Override
                protected Map<String , String> getParams() throws AuthFailureError{
                    Map<String,String> param = new HashMap<String, String>();
                    param.put("username",Username);
                    param.put("password",pass);
                    param.put("email",Email);
                    // getting the strings from the user input, then send it to php file to starting processing of the User registeration
                    return param;
                }
            };
            rq.add(stringRequest); // start the volley new request queue
        }
    }
}