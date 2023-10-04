package com.example.rngs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intentRandom, intentCount;
        intentRandom = new Intent (this, RandomNumberActivity.class);
        intentCount = new Intent (this, CountActivity.class);


        Button rngButton = (Button) findViewById(R.id.button3);
        Button toastButton = (Button) findViewById(R.id.button);
        Button countButton = (Button) findViewById(R.id.button2);

        TextView rngText = (TextView) findViewById(R.id.textView);
        Random rng = new Random();




        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "We are toast", Toast.LENGTH_SHORT).show();
            }
        });

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentCount);
            }
        });

        rngButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentRandom);
            }
        });

    }
}