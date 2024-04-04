package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email, subject, content;
    Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.getemail);
        subject = findViewById(R.id.getsubject);
        content = findViewById(R.id.getpara);

        submitbtn = findViewById(R.id.movetoemail);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendemail = new Intent(Intent.ACTION_SEND);

                sendemail.putExtra(Intent.EXTRA_EMAIL,email.getText().toString());
                sendemail.putExtra(Intent.EXTRA_SUBJECT,subject.getText().toString());
                sendemail.putExtra(Intent.EXTRA_TEXT,content.getText().toString());

                sendemail.setType("message/rfc822");
                startActivity(sendemail);
            }
        });

    }
}S