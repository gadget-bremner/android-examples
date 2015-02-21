package com.example.richard.signupform;

import java.io.Serializable;

/**
 * Created by Richard on 21/02/2015.
 */
public class User implements Serializable{

    public User(String username, String password) {
        mUsername = username;
        mPassword = password;
    }

    private String mUsername;
    private String mPassword;

    public String getUserName()
    {
        return mUsername;
    }
}
