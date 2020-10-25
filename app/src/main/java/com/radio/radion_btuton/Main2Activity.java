package com.radio.radion_btuton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView gender_text_view, fruits_text_view, food_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__2);
        gender_text_view = findViewById(R.id.gender_text_view);
        fruits_text_view = findViewById(R.id.fruits_text_view);
        food_text_view = findViewById(R.id.food_text_view);
        if (getIntent() != null) {
            String gender = getIntent().getStringExtra("gender");
            String fruits = getIntent().getStringExtra("fruits");
            String food1 = getIntent().getStringExtra("food1");
            String food2 = getIntent().getStringExtra("food2");
            String food3 = getIntent().getStringExtra("food3");
            String food4 = getIntent().getStringExtra("food4");
            gender_text_view.setText("Selected Gender: " + gender);
            fruits_text_view.setText("Selected Fruits: " + fruits);
            food_text_view.setText("Selected Foods: " + food1 + " " + food2 + " " + food3 + " " + food4);
        }
    }
}
