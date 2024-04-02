package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton danzu;

        danzu = findViewById(R.id.danzu);

        danzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                danzu.setImageResource(R.drawable.ic_launcher_background);
            }
        });
    }
}