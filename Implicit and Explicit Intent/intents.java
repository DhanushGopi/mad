package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.implicitintent);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movetologin = new Intent(MainActivity.this, loginform.class);
                startActivity(movetologin);
            }
        });

        Button danzu = findViewById(R.id.explictintent);
        danzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movetodanzu = new Intent(Intent.ACTION_VIEW);
                movetodanzu.setData(Uri.parse("https://dhanushgopi.github.io/"));
                startActivity(movetodanzu);
            }
        });
    }
}