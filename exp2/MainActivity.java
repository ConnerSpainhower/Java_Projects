package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConnect1 = findViewById(R.id.button_1);
        buttonConnect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), addition.class));
            }
        });

        Button buttonConnect2 = findViewById(R.id.button_2);
        buttonConnect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), addition.class));
            }
        });

        Button buttonConnect3 = findViewById(R.id.button_add);
        buttonConnect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), addition.class));
            }
        });

        Button buttonConnect4 = findViewById(R.id.button_equals);
        buttonConnect4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), addition.class));
            }
        });

        Button buttonConnect5 = findViewById(R.id.button_multiply);
        buttonConnect5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), addition.class));
            }
        });
    }


}