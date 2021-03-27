package com.example.text_to_speech.STORAGE;

public class User {
    int userid;
    String username,email;

    /*
    Using getter and setter, to get the user data from jsonobject, then set it.
     */
    public User(int userid,String username , String email){
        this.userid = userid;
        this.username = username;
        this.email = email;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
