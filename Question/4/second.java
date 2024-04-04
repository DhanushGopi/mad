package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView uname, uemail, uphone, ustate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent settwo = getIntent();

        String name = settwo.getStringExtra("NAME");
        String eamil = settwo.getStringExtra("EMAIL");
        String phone = settwo.getStringExtra("PHONE");
        String state = settwo.getStringExtra("STATE");

        uname = findViewById(R.id.setname);
        uemail = findViewById(R.id.setemail);
        uphone = findViewById(R.id.setphoneno);
        ustate = findViewById(R.id.setstate);

        uname.setText(name);
        uemail.setText(eamil);
        uphone.setText(phone);
        ustate.setText(state);
    }
}