package com.carhern.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        Intent intent = getIntent();
        String userPassed = intent.getStringExtra(MainActivity.PASS_NAME);

        TextView userNamePass = findViewById(R.id.welcome);
        userNamePass.setText("Welcome '" + userPassed + "' to the landing page"); // Shows the welcome message with the username

    }
}