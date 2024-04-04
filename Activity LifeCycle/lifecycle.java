package com.example.activitylifecycle;

import static androidx.constraintlayout.widget.Constraints.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Successfully Loaded");
    }
    
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart: Successfully Loaded");
    }
    
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume: Successfully Loaded");
    }
    
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause: successfully Loaded");
    }
    
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop: Successfully Stopped");
    }
    
    @Override 
    protected void onRestart(){
       super.onRestart();
        Log.d(TAG, "onRestart: Successfully Restarted");
    }
    
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: Successfully Destroyed");
    }
}