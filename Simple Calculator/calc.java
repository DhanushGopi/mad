package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText no1, no2;
        Button add,sub,mult,div, reset;
        TextView ans;

        no1 = findViewById(R.id.number1);
        no2 = findViewById(R.id.number2);

        add = findViewById(R.id.addition);
        sub = findViewById(R.id.subtraction);
        mult = findViewById(R.id.multiplication);
        div = findViewById(R.id.division);
        reset = findViewById(R.id.reset);

        ans = findViewById(R.id.answer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = no1.getText().toString();
                String number2 = no2.getText().toString();
                Integer opt = Integer.parseInt(number1) + Integer.parseInt(number2);
                ans.setText("The Addition is : " + opt);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = no1.getText().toString();
                String number2 = no2.getText().toString();
                Integer opt = Integer.parseInt(number1) - Integer.parseInt(number2);
                ans.setText("The Subtraction is : " + opt);
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = no1.getText().toString();
                String number2 = no2.getText().toString();
                Integer opt = Integer.parseInt(number1) * Integer.parseInt(number2);
                ans.setText("The Multiplication is : " + opt);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = no1.getText().toString();
                String number2 = no2.getText().toString();
                Integer opt = Integer.parseInt(number1) / Integer.parseInt(number2);
                ans.setText("The Division is : " + opt);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("Answer will show");
            }
        });

    }
}
