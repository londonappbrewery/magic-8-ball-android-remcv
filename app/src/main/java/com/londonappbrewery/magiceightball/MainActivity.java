package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // variables
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                            R.drawable.ball4, R.drawable.ball5};
        Button myButton = findViewById(R.id.askButton);
        Button resetButton = findViewById(R.id.resetButton);

        // button action
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random myRandomNumberGenerator = new Random();
                int index;

                index = myRandomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[index]);
                ballDisplay.setVisibility(View.VISIBLE);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ballDisplay.setVisibility(View.INVISIBLE);
            }
        });

        ballDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random myRandomNumberGenerator = new Random();
                int index;

                index = myRandomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[index]);
            }
        });
    }
}
