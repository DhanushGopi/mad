package com.example.jsonservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String jsonstr = "{\"employee\":{\"name\":\"dhanush\"}}";
        uname = findViewById(R.id.setusername);

        try {
            JSONObject obj = new JSONObject(jsonstr);
            JSONObject emp = obj.getJSONObject("employee");

            String name = emp.getString("name");

            uname.setText("Username : " + name);
        }
        catch (Exception e){
            Toast.makeText(this, "Error in JSON Reading", Toast.LENGTH_SHORT).show();
        }



    }
}