package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText uname, email, phoneno;
    AutoCompleteTextView ustate;
    Button subbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] states = {"Tamil Nadu","Kerala","Andhrapradesh","Telugana"};

        ArrayAdapter searchstates = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,states);

        uname = findViewById(R.id.uname);
        email = findViewById(R.id.uemail);
        phoneno = findViewById(R.id.uphoneno);
        ustate = findViewById(R.id.ustate);

        ustate.setAdapter(searchstates);

        subbtn = findViewById(R.id.submitbtn);

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movetwo = new Intent(MainActivity.this, MainActivity2.class);

                movetwo.putExtra("NAME", uname.getText().toString());
                movetwo.putExtra("EMAIL", email.getText().toString());
                movetwo.putExtra("PHONE", phoneno.getText().toString());
                movetwo.putExtra("STATE", ustate.getText().toString());

                startActivity(movetwo);
            }
        });


    }
}