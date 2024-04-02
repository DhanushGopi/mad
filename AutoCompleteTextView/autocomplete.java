package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] iplteams = {"CSK","RCB","MI","SRH","GT","RR","LSG","PK","DC","KKR"};

        ArrayAdapter teamlist = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,iplteams);

        AutoCompleteTextView teamsearch = findViewById(R.id.searchipl);
        teamsearch.setAdapter(teamlist);

        Button showteam = findViewById(R.id.getteam);

        showteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The Team is : "+ teamsearch.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}