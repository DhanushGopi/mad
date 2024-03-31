package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox chennai, mumbai, banglore, hyderbad;
        Button poll;

        chennai = findViewById(R.id.csk);
        mumbai = findViewById(R.id.mi);
        banglore = findViewById(R.id.rcb);
        hyderbad = findViewById(R.id.srh);
        poll = findViewById(R.id.submitbt);

        poll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(chennai.isChecked()){
                    String msg = chennai.getText().toString()+" : Whistle Podu!";
                    Toast.makeText(MainActivity.this, msg  , Toast.LENGTH_SHORT).show();
                }

                if(mumbai.isChecked()){
                    String msg = mumbai.getText().toString()+" : One Family!";
                    Toast.makeText(MainActivity.this, msg  , Toast.LENGTH_SHORT).show();
                }

                if(banglore.isChecked()){
                    String msg = banglore.getText().toString()+" : Eee Saale Cup Namadhe!";
                    Toast.makeText(MainActivity.this, msg  , Toast.LENGTH_SHORT).show();
                }

                if(hyderbad.isChecked()){
                    String msg = hyderbad.getText().toString()+" : SRH ah illa HRS ah!";
                    Toast.makeText(MainActivity.this, msg  , Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}