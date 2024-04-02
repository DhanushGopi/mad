package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView iplteams;
        
        iplteams = findViewById(R.id.iplteams);

        String[] teams = {"CSK","MI","RCB","RR","KKR","GT","LSG","SRH","PK","DC"};

        ArrayAdapter iplteamlist = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,teams);
        iplteams.setAdapter(iplteamlist);


        iplteams.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "The selectd "+teams[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}