package com.example.caloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalorieCounter_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);

        Button button_1 = findViewById(R.id.button_positive_5);
        Button button_2 = findViewById(R.id.button_negative_5);
        Button button_3 = findViewById(R.id.button_positive_100);
        Button button_4 = findViewById(R.id.button_negative_100);
        Button button_5 = findViewById(R.id.button_positive_1000);
        Button button_6 = findViewById(R.id.button_negative_1000);
        Button button_7 = findViewById(R.id.button_reset);
        TextView output = findViewById(R.id.CalorieCounter_output);

        Integer[] out = {0};

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] += 5;
                output.setText(out[0].toString());
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] -= 5;
                output.setText(out[0].toString());
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] += 100;
                output.setText(out[0].toString());
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] -= 100;
                output.setText(out[0].toString());
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] += 1000;
                output.setText(out[0].toString());
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] -= 1000;
                output.setText(out[0].toString());
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 0;
                output.setText(out[0].toString());
            }
        });
    }
}