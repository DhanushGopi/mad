package com.example.radiobtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioGroup ipltemas;
        Button getteam;


        getteam = findViewById(R.id.getteam);
        ipltemas = findViewById(R.id.iplteams);
        getteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int team = ipltemas.getCheckedRadioButtonId();
                RadioButton showteam = findViewById(team);
                Toast.makeText(MainActivity.this, "The Selected Team is : " + showteam.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}