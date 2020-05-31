package com.udemysection3.numbershapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityNumberShapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_shapes);
    }

    public void check(View view) {
        EditText numberEditText = (EditText) findViewById(R.id.numberToCheckEditText);
        String message;
        Double number = Double.parseDouble(numberEditText.getText().toString());
        CheckSquareOrTriangularNumber checkSquareOrTriangularNumber = new CheckSquareOrTriangularNumber(number);
        if (checkSquareOrTriangularNumber.isSquareNumber() && checkSquareOrTriangularNumber.isTriangularNumber()) {
            message = "it is both triangular number and square number";
        } else if (checkSquareOrTriangularNumber.isSquareNumber()) {
            message = "square number";
        } else if (checkSquareOrTriangularNumber.isTriangularNumber()) {
            message = "triangular number";
        } else {
            message = "neither triangular nor square";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }
}
