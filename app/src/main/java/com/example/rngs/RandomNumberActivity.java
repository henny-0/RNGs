package com.example.rngs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberActivity extends AppCompatActivity {

    private int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(15)+1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        TextView rngText = (TextView) findViewById(R.id.textView);
        Random rng = new Random();
        int randomNumber = generateRandomNumber();
        rngText.setText(""+randomNumber);

        Button prev = (Button) findViewById(R.id.prev);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}