package com.example.exp1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.exp1.databinding.ActivityCalculatorBinding;

public class calculator extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);

        Button button_1 = findViewById(R.id.num_1); //sets button_1 as ID of button 1 on calculator
        Button button_2 = findViewById(R.id.num_2);
        Button button_3 = findViewById(R.id.num_3);
        Button button_4 = findViewById(R.id.num_4);
        Button button_5 = findViewById(R.id.num_5);
        Button button_6 = findViewById(R.id.num__6);
        Button button_7 = findViewById(R.id.num_7);
        Button button_8 = findViewById(R.id.num_8);
        Button button_9 = findViewById(R.id.num_9);
        TextView output = findViewById(R.id.output);

        Integer[] out = {0}; //temp
        button_1.setOnClickListener(new View.OnClickListener() { //when button 1 is clicked on calculator, it will print out 1
            @Override
            public void onClick(View view) {
                out[0] = 1;
                output.setText(out[0].toString());
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 2;
                output.setText(out[0].toString());
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 3;
                output.setText(out[0].toString());
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 4;
                output.setText(out[0].toString());
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 4;
                output.setText(out[0].toString());
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 5;
                output.setText(out[0].toString());
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 6;
                output.setText(out[0].toString());
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 7;
                output.setText(out[0].toString());
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 8;
                output.setText(out[0].toString());
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out[0] = 9;
                output.setText(out[0].toString());
            }
        });
    }

}