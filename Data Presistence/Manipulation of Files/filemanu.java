package com.example.filemanupulation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    Button writetext, readtext;

    EditText textfile;

    FileInputStream fin;

    FileOutputStream fout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textfile = findViewById(R.id.filetext);
        writetext = findViewById(R.id.writetext);
        readtext = findViewById(R.id.readtext);

        writetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    fout = openFileOutput("file1.txt",MODE_PRIVATE);
                    fout.write(textfile.getText().toString().getBytes());
                    fout.close();
                    Toast.makeText(MainActivity.this, "Writed Successfully", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Not written", Toast.LENGTH_SHORT).show();
                }
            }
        });

        readtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    fin = openFileInput("file1.txt");
                    byte[] buffer = new byte[fin.available()];
                    fin.read(buffer);
                    fin.close();
                    String fileContent = new String(buffer);
                    Toast.makeText(MainActivity.this, "The Text "+fileContent, Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Read Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}