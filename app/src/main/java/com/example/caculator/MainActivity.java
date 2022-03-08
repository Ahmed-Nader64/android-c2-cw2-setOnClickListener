package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.first_number);
        EditText num2 = findViewById(R.id.second_number);
        TextView total = findViewById(R.id.total);


        Button cal = findViewById(R.id.calculate);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double first = Double.parseDouble(num1.getText().toString()) ;
                double second = Double.parseDouble(num2.getText().toString());
                double result = first + second;
                total.setText(" res : " +   result);
            }
        });

        Button cal1 = findViewById(R.id.calculate1);
        cal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double first1 = Double.parseDouble(num1.getText().toString());
                double second1 = Double.parseDouble(num2.getText().toString());
                double result1 = first1 - second1;
                total.setText(" res : " + result1);
            }
        });

        Button cal2 = findViewById(R.id.calculate2);
        cal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double first2 = Double.parseDouble(num1.getText().toString());
                double second2 = Double.parseDouble(num2.getText().toString());
                double result2 = first2 * second2;
                total.setText(" res : " + result2);

            }
        });

        Button cal3 = findViewById(R.id.calculate3);
        cal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double first3 = Double.parseDouble(num1.getText().toString());
                double second3 = Double.parseDouble(num2.getText().toString());
                double result3 = first3 / second3;
                total.setText(" res : " + result3);
            }
        });

        Button rest = findViewById(R.id.rest);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total.setText(" result " );
                num1.setText("");
                num2.setText("");
            }
        });

    }
}