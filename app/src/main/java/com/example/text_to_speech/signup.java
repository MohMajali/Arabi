package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class signup extends AppCompatActivity {
    EditText username,password,email;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = (EditText) findViewById(R.id.Name);
        password = (EditText) findViewById(R.id.pass);
        email = (EditText) findViewById(R.id.email);
        signup = (Button) findViewById(R.id.button3);

        signup.setOnClickListener(v -> {

            register();
        });
    }

    private void register(){
        String Username = username.getText().toString();
        String pass = password.getText().toString();
        String Email = email.getText().toString();

        if(Username.isEmpty() || pass.isEmpty() || Email.isEmpty()){
            if(Username.isEmpty()){
                username.setError("fill in");
            }
            if(pass.isEmpty()){
                password.setError("fill in");
            }
            if(Email.isEmpty()){
                email.setError("fill in");
            }
            /*
            if (Username.isEmpty() && pass.isEmpty() && Email.isEmpty()){
                username.setError("fill in");
                password.setError("fill in");
                email.setError("fill in");
            }

             */
        } else {
            RequestQueue rq = Volley.newRequestQueue(this);
            final StringRequest stringRequest =new StringRequest(Request.Method.POST, "http://10.0.2.2/sign_up.php",
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                if (!jsonObject.getBoolean("error")){
                                    Toast.makeText(signup.this,jsonObject.getString("message"),Toast.LENGTH_LONG).show();

                                    JSONObject jsonObjectUser =  jsonObject.getJSONObject("user");

                                    user user = new user(jsonObjectUser.getInt("userid"), jsonObjectUser.getString("username"),
                                            jsonObjectUser.getString("email"));

                                    //store in sharedprefernces
                                    sharedprefmanager.getInstance(getApplicationContext()).storeUserData(user);

                                    //let user in
                                    finish();
                                    //move to alphabet activity
                                    startActivity(new Intent(signup.this, activity_alphabet.class));
                                }else {
                                    Toast.makeText(signup.this,jsonObject.getString("message"),Toast.LENGTH_LONG).show();
                                }
                            } catch (JSONException e) {
                                Log.i("msg1",e.getMessage());
                            }
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(signup.this,"hii",Toast.LENGTH_LONG).show();
                    Log.i("msg",error.getMessage().toString());
                }
            })
            {
                @Override
                protected Map<String , String> getParams() throws AuthFailureError{
                    Map<String,String> param = new HashMap<String, String>();
                    param.put("username",Username);
                    param.put("password",pass);
                    param.put("email",Email);
                    return param;
                }
            };
            rq.add(stringRequest);
        }
    }
}