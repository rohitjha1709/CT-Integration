package com.example.finaltest;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.clevertap.android.sdk.CleverTapAPI;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(this);
        CleverTapAPI.setDebugLevel(CleverTapAPI.LogLevel.VERBOSE);
        setContentView(R.layout.activity_main);

        // Find the button by its ID
        Button myButton = findViewById(R.id.myButton);



        // Set up the button click event
        myButton.setOnClickListener(view -> {

            HashMap<String, Object> prodViewedAction = new HashMap<String, Object>();
            prodViewedAction.put("Name", "Rohit Jha");


            clevertapDefaultInstance.pushEvent("Android Event", prodViewedAction);
            // Display a Toast message on button click
            Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
        });

        //CleverTapAPI.getDefaultInstance(getApplicationContext());
// event without properties
    }
    // event without properties

}