package com.kidslearning.basic.currencyConverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.kidslearning.currencyConverter.R;

public class CurrencyConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
    }

    public void convertCurrency(View view) {
        EditText amountInEuroEditText = (EditText) findViewById(R.id.editTextAmountInEuro);
        String amountInDollarsString = Double.toString(Double.parseDouble(amountInEuroEditText.getText().toString()) * 1.3);
        TextView textView = (TextView) findViewById(R.id.amountInDollars);
        textView.setText(amountInDollarsString);
    }
}
