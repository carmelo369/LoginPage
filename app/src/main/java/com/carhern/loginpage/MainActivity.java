/*
* Author: Carmelo Hernandez
* Date: 09/04/2020
* Abstract: Android login and landing page with JUnit tests
* References: https://codinginflow.com/tutorials/android/open-a-new-activity-and-pass-variables
 */
package com.carhern.loginpage;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String PASS_NAME = "com.carhern.loginpage.PASS_NAME";

    private EditText username;
    private EditText password;
    private String userStored = "din_djarin";
    private String passwordStored = "baby_yoda_ftw";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);

        Button loggingButton = findViewById(R.id.buttonLogin);

        loggingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((username.getText().toString().equals(userStored) && password.getText().toString().equals(passwordStored))){
                    Intent intent = new Intent(MainActivity.this, LandingPage.class);
                    String valid_name = username.getText().toString();
                    intent.putExtra(PASS_NAME, valid_name);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this, "Landing page is open now", Toast.LENGTH_SHORT).show();
                    username.setBackgroundColor(Color.TRANSPARENT); // Transparent background username correct
                    password.setBackgroundColor(Color.TRANSPARENT); // Transparent background correct password

                } else if(!username.getText().toString().equals(userStored) && password.getText().toString().equals(passwordStored)){
                    Toast.makeText(MainActivity.this, "Username incorrect. Try again!", Toast.LENGTH_SHORT).show();
                    username.setBackgroundColor(Color.YELLOW); // Highlight background if username is incorrect
                    password.setBackgroundColor((Color.TRANSPARENT)); // Transparent background if password is correct

                } else if(username.getText().toString().equals(userStored) && !password.getText().toString().equals(passwordStored)){
                    Toast.makeText(MainActivity.this, "Password incorrect. Try again!", Toast.LENGTH_SHORT).show();
                    username.setBackgroundColor(Color.TRANSPARENT); // Transparent background if username is correct
                    password.setBackgroundColor(Color.YELLOW); // Highlight background if password is incorrect

                } else {
                    Toast.makeText(MainActivity.this, "Username and Password are incorrect. Try again!", Toast.LENGTH_SHORT).show();
                    username.setBackgroundColor(Color.YELLOW); // Highlight incorrect username
                    password.setBackgroundColor(Color.YELLOW); // Highlight incorrect password

                }
            }
        });
    }
}