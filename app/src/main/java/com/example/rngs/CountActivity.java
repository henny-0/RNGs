package com.example.rngs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class CountActivity extends AppCompatActivity {
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        TextView countText = (TextView) findViewById(R.id.textView);

        Button count = (Button) findViewById(R.id.count);



        count.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                sum++;
                countText.setText(""+sum);
            }
        });


        Button prev = (Button) findViewById(R.id.prev);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}