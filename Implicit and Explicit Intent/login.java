package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);

        Button loginbtn;
        EditText username;

        loginbtn = findViewById(R.id.loginbtn);
        username = findViewById(R.id.username);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(loginform.this, username.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}