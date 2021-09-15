package com.example.exp2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class addition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button_1 = findViewById(R.id.button_1);
        Button button_2 = findViewById(R.id.button_2);
        Button button_add = findViewById(R.id.button_add);
        Button button_multiply = findViewById(R.id.button_multiply);
        Button button_equals = findViewById(R.id.button_equals);
        TextView output = findViewById(R.id.text_output);

        Integer[] out = {0}; //temp
        button_1.setOnClickListener(new View.OnClickListener() { //when button 1 is clicked on calculator, it will print out 1
            @Override
            public void onClick(View view) {
                if(!output.equals(button_add) || !out.equals(button_multiply)) {
                    out[0] = 1;
                    output.setText(out[0].toString());
                }
            }
        });

        Integer[] out2 = {0};
        button_2.setOnClickListener(new View.OnClickListener() { //when button 2 is clicked on calculator, it will print out 2
            @Override
            public void onClick(View view) {
                out2[0] = 2;
                output.setText(out2[0].toString());
            }
        });

        String[] out1 = {null};
        button_add.setOnClickListener(new View.OnClickListener() { //when the addition button is clicked on calculator, it will print out +
            @Override
            public void onClick(View view) {
                out1[0] = "+";
                output.setText(out1[0]);
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() { //when the multiply button is clicked on calculator, it will print out *
            @Override
            public void onClick(View view) {
                out1[0] = "*";
                output.setText(out1[0]);
            }
        });

        Integer[] out_equal = {0};
        button_equals.setOnClickListener(new View.OnClickListener() { //when the equals button is clicked on calculator, it will print out the answer
            @Override
            public void onClick(View view) {
                if(button_add.isActivated()) {
                    out_equal[0] = out[0] + out2[0];
                    output.setText(out_equal[0].toString());
                }
                if(button_multiply.isActivated()) {
                    out_equal[0] = out[0] * out2[0];
                    output.setText(out_equal[0].toString());
                }
            }
        });
    }
}