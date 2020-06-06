package com.udemysection4.animatedtictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    boolean player1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dropIn(View view) {
        ImageView imageView = (ImageView) view;
        if (player1) {
            ((ImageView) view).setImageResource(R.drawable.red);

        } else {
        }
    }

    public void playAgain(View view) {
    }
}
