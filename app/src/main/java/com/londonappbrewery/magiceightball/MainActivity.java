package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        ballDisplay = findViewById(R.id.imageView);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,};

        Button mybutton;
        mybutton = (Button) findViewById(R.id.askButton);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Magic 8", "This button is now working");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }

    }

