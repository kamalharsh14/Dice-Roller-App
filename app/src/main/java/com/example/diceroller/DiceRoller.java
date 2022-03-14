package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DiceRoller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roller);
        ImageView img=findViewById(R.id.imageView);
        Button roll=findViewById(R.id.roll);
        img.setImageResource(R.drawable.launch);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }

            private void rollDice() {
                int roll = 1 + (int)(Math.random() * 6);
                if(roll == 1){
                    img.setImageResource(R.drawable.dice1);
                }
                else if(roll == 2){
                    img.setImageResource(R.drawable.dice2);
                }
                else if(roll == 3){
                    img.setImageResource(R.drawable.dice3);
                }
                else if(roll == 4){
                    img.setImageResource(R.drawable.dice4);
                }
                else if(roll == 5){
                    img.setImageResource(R.drawable.dice5);
                }
                else{
                    img.setImageResource(R.drawable.dice6);
                }
            }
        });
    }
}