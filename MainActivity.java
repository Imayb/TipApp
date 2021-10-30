package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TipCalculator tipCalculator;
    public NumberFormat money = NumberFormat.getCurrencyInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipCalculator = new TipCalculator(0, 1.5, 0);
    }

    public void calculate(View v) {
        EditText billEditText = findViewById(R.id.amount_bill);
        String billString = billEditText.getText().toString();
        double billAmount = Double.parseDouble(billString);

        EditText tipEditText = findViewById(R.id.amount_tip_percent);
        String tipString = tipEditText.getText().toString();
        double tipEach = Double.parseDouble(tipString);

        EditText peopleEditText = findViewById(R.id.amount_people);
        String peopleString = peopleEditText.getText().toString();
        double peopleAmount = Double.parseDouble(peopleString);


        TextView tipTextView = findViewById(R.id.amount_tip);
        TextView totalTextView = findViewById(R.id.amount_total);
        TextView taxTextView = findViewById(R.id.amount_tax);




        tipCalculator.setBill(billAmount);
        tipCalculator.setTip(tipEach * 0.01);
        tipCalculator.setPeople(peopleAmount);

        double tip = tipCalculator.tipEach();
        double total = tipCalculator.totalAmount();
        double tax = tipCalculator.taxAmount();

        tipTextView.setText(money.format(tip));
        totalTextView.setText(money.format(total));
        taxTextView.setText(money.format(tax));


    }

}