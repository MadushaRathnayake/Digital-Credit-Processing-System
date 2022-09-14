package com.example.digitalloanprocessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class userRegistration extends AppCompatActivity {

    EditText fullName, NIC, userName, password, confirmPassword, mobileNumber, email;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        fullName = (EditText) findViewById(R.id.fullName);
        NIC = (EditText) findViewById(R.id.NIC);
        userName = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);
        mobileNumber = (EditText) findViewById(R.id.mobileNumber);
        email = (EditText) findViewById(R.id.email);

        submit = (Button) findViewById(R.id.submitbtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}