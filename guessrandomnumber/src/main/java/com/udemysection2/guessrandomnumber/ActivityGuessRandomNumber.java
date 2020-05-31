package com.udemysection2.guessrandomnumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class ActivityGuessRandomNumber extends AppCompatActivity {
    int randomNumber;

    public void generateRandomNumber() {
        Random random = new Random();
        //random.nextInt(20)  It will search for 0 to 19 . Added 1 for 1 to 20 search
        randomNumber = random.nextInt(20) + 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_random_number);
        generateRandomNumber();
    }

    public void check(View view) {
        EditText guessedNumberEditText = (EditText) findViewById(R.id.numberEditText);
        int guessedNumber = Integer.parseInt(guessedNumberEditText.getText().toString());
        //so that we don't need to write Toast again and again
        String message;
        if (guessedNumber > randomNumber) {
            message = "Higher!";
        } else if (guessedNumber < randomNumber) {
            message = "Lower!";
        } else {
            message = "Hurrah!! You got the right number.\nPlay again!!";
            generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
