package com.example.caloriecounter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);


        Button buttonConnect1 = findViewById(R.id.button_positive_5);
        buttonConnect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CalorieCounter_activity.class));
            }
        });

        Button buttonConnect2 = findViewById(R.id.button_negative_5);
        buttonConnect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CalorieCounter_activity.class));
            }
        });

        Button buttonConnect3 = findViewById(R.id.button_positive_100);
        buttonConnect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CalorieCounter_activity.class));
            }
        });

        Button buttonConnect4 = findViewById(R.id.button_negative_100);
        buttonConnect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CalorieCounter_activity.class));
            }
        });

        Button buttonConnect5 = findViewById(R.id.button_positive_1000);
        buttonConnect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CalorieCounter_activity.class));
            }
        });

        Button buttonConnect6 = findViewById(R.id.button_negative_1000);
        buttonConnect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CalorieCounter_activity.class));
            }
        });

        Button buttonConnect7 = findViewById(R.id.button_reset);
        buttonConnect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), CalorieCounter_activity.class));
            }
        });
    }
}
