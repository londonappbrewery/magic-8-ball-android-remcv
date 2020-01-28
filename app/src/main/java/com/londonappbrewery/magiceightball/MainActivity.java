package com.londonappbrewery.magiceightball;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
        final Button myButton = findViewById(R.id.askButton);
        Button resetButton = findViewById(R.id.resetButton);
        final TextView mySlogan = findViewById(R.id.slogan_textView);

        // button action
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random myRandomNumberGenerator = new Random();
                int index;

                index = myRandomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[index]);
                ballDisplay.setVisibility(View.VISIBLE);
                mySlogan.setBackgroundColor(Color.parseColor("#FF5A00"));
                myButton.setVisibility(View.INVISIBLE);
                myButton.setEnabled(false);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ballDisplay.setVisibility(View.INVISIBLE);
                mySlogan.setBackgroundColor(Color.parseColor("#F9D500"));
                myButton.setEnabled(true);
                myButton.setVisibility(View.VISIBLE);
            }
        });

        ballDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random myRandomNumberGenerator = new Random();
                int index;
                index = myRandomNumberGenerator.nextInt(5);

                // two possible colours: yellow #F9D500, red #FF5A00
                ballDisplay.setImageResource(ballArray[index]);

//                if(mySlogan.getBackgroundColor().equals(Color.parseColor("#F9D500")))
//                {
//                    // set color to red
//                    mySlogan.setBackgroundColor(Color.parseColor("#FF5A00"));
//                }
//                else if(mySlogan.getBackground().equals(Color.parseColor("#FF5A00")))
//                {
//                    // set color to yellow
//                    mySlogan.setBackgroundColor(Color.parseColor("#F9D500"));
//                }
            }
        });
    }
}
