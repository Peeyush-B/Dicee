package com.peeyush.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        Button roll_Button;
        roll_Button = (Button) findViewById(R.id.roll_Button);

        final ImageView left_image = (ImageView) findViewById(R.id.left_image);
        final ImageView right_image = (ImageView) findViewById(R.id.right_image);

        final int[] dice_array = {
                R.drawable.dice1 ,
                R.drawable.dice2 ,
                R.drawable.dice3 ,
                R.drawable.dice4 ,
                R.drawable.dice5 ,
                R.drawable.dice6
        };

        roll_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee" ,"Roll_Button is pressed");
                Random RN_Generator = new Random();

                int random_number = RN_Generator.nextInt(6);

                Log.d("Dicee" ,"random number for left dice is " + random_number);
                left_image.setImageResource(dice_array[random_number]);

                random_number = RN_Generator.nextInt(6);

                Log.d("Dicee" ,"random number for right dice is " + random_number);
                right_image.setImageResource(dice_array[random_number]);

            }
        });

    }
}
