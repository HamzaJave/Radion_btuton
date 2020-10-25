package com.radio.radion_btuton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup myRadioGroup_geneder, myRadioGroup_fruits;
    private RadioButton male, female, other;
    private RadioButton apple, orange, banana;
    CheckBox pizza, coffe, burger,sandwith;
    private Button button;
    String for_gender = "";
    String for_fruits = "";
    String for_pizza = "";
    String for_coffee = "";
    String for_Burger = "";
    String for_Sandwitch = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRadioGroup_geneder = (RadioGroup) findViewById(R.id.myRadioGroup_geneder);
        myRadioGroup_fruits = (RadioGroup) findViewById(R.id.myRadioGroup_fruits);
        pizza = (CheckBox) findViewById(R.id.checkBox);
        coffe = (CheckBox) findViewById(R.id.checkBox2);
        burger = (CheckBox) findViewById(R.id.checkBox3);
        sandwith = (CheckBox) findViewById(R.id.checkBox4);
        myRadioGroup_geneder.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.male) {
                    Toast.makeText(getApplicationContext(), "choice: Male",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.female) {
                    Toast.makeText(getApplicationContext(), "choice: Female",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.other) {
                    Toast.makeText(getApplicationContext(), "choice: Other",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });

        myRadioGroup_fruits.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.apple) {
                    Toast.makeText(getApplicationContext(), "choice: Apple",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.orange) {
                    Toast.makeText(getApplicationContext(), "choice: Orange",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.banana) {
                    Toast.makeText(getApplicationContext(), "choice: Banana",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });


        banana = (RadioButton) findViewById(R.id.banana);
        orange = (RadioButton) findViewById(R.id.orange);
        apple = (RadioButton) findViewById(R.id.apple);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        other = (RadioButton) findViewById(R.id.other);

        button = (Button) findViewById(R.id.chooseBtn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId = myRadioGroup_geneder.getCheckedRadioButtonId();
                int selectedId_fruits = myRadioGroup_fruits.getCheckedRadioButtonId();

                // find which radioButton is checked by id
                if (selectedId == male.getId()) {
                    for_gender = "Male";
                } else if (selectedId == female.getId()) {
                    for_gender = "Female";
                } else if (selectedId == other.getId()) {
                    for_gender = "Other";
                }
                if (selectedId_fruits == apple.getId()) {
                    for_fruits = "Apple";
                } else if (selectedId_fruits == orange.getId()) {
                    for_fruits = "Orange";
                } else if (selectedId_fruits == banana.getId()) {
                    for_fruits = "Banana";
                }

                if (pizza.isChecked()) {
                    for_pizza = "Pizza";
                } else {
                    for_pizza = "";

                }
                if (coffe.isChecked()) {
                    for_coffee = "Coffee";

                } else {
                    for_coffee = "";

                }
                if (burger.isChecked()) {
                    for_Burger = "Burger";
                } else {
                    for_Burger = "";

                }
                if (sandwith.isChecked()) {
                    for_Sandwitch = "Sandwitch";
                } else {
                    for_Sandwitch = "";

                }

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("fruits", for_fruits);
                intent.putExtra("gender", for_gender);
                intent.putExtra("food1", for_pizza);
                intent.putExtra("food2", for_coffee);
                intent.putExtra("food3", for_Burger);
                intent.putExtra("food4", for_Sandwitch);
                startActivity(intent);

            }
        });
    }
}
