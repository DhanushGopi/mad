package com.example.createview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = new TextView(this);
        text.setText("I'm in Java");

        Button subbtn = new Button(this);
        subbtn.setText("Submit in Java");

        LinearLayout addtolayout = findViewById(R.id.mainlayout);
        addtolayout.addView(text);
        addtolayout.addView(subbtn);


    }
}