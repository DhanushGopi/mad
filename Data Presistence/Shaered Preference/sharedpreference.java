package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= findViewById(R.id.username);

    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences setshare = getSharedPreferences("myshare", MODE_PRIVATE);

        String namevalue = setshare.getString("username","");

        username.setText(namevalue);

        Toast.makeText(this, "Text Fetched", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences shares = getSharedPreferences("myshare", MODE_PRIVATE);
        SharedPreferences.Editor myedit = shares.edit();

        myedit.putString("username",username.getText().toString());
        myedit.apply();

        Toast.makeText(this, "Text Stored", Toast.LENGTH_SHORT).show();
    }
}