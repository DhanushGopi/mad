package com.example.sqllite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    Button stodata, retdata;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.getname);
        stodata = findViewById(R.id.storedata);
        retdata = findViewById(R.id.retrivedata);


        db = openOrCreateDatabase("db1",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS employee(name VARCHAR(20))");

        stodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                db.execSQL("INSERT INTO employee(name)VALUES('"+uname+"')");
                Toast.makeText(MainActivity.this, "Row Inserted", Toast.LENGTH_SHORT).show();
            }
        });

        retdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb = new StringBuffer();
                Cursor c = db.rawQuery("SELECT * FROM employee", null);
                while (c.moveToNext()){
                    sb.append("\n Employee Name "+c.getString(c.getColumnIndex("name")));
                }
                Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}