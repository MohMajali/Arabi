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

public class login_page extends AppCompatActivity {

    EditText user , pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.button2);

        login.setOnClickListener(v -> {

            Login();
        });
    }

    private void Login(){
        RequestQueue rq = Volley.newRequestQueue(this);
        final StringRequest stringRequest =new StringRequest(Request.Method.POST, "http://10.0.2.2/login.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject =new JSONObject(response);
                    if(!jsonObject.getBoolean("error")) {
                        user user = new user(jsonObject.getInt("userid"), jsonObject.getString("username"),
                                jsonObject.getString("email"));

                        //store user data inside sharedprefrences
                        sharedprefmanager.getInstance(getApplicationContext()).storeUserData(user);

                        //let user in
                        finish();
                        //move to alphabet activity
                        startActivity(new Intent(login_page.this,activity_alphabet.class));

                        Toast.makeText(login_page.this, jsonObject.getString("message"), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(login_page.this, jsonObject.getString("message"), Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("msg",error.getMessage().toString());
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