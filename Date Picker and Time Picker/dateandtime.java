package com.example.dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the date picker
        Button showdate = findViewById(R.id.date);
        showdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog getdate = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String date = dayOfMonth + "/" + (month + 1) + "/" + year;
                        Toast.makeText(MainActivity.this, "The Selected Date" + date, Toast.LENGTH_SHORT).show();
                    }
                },Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);
                getdate.show();
            }
        });
        // the time picker
        Button showtime = findViewById(R.id.time);
        showtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog gettime = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Toast.makeText(MainActivity.this, hourOfDay + ":" + minute , Toast.LENGTH_SHORT).show();
                    }
                }, Calendar.HOUR, Calendar.MINUTE,true);

                gettime.show();
            }
        });

    }
}