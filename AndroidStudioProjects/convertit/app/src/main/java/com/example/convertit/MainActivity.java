package com.example.convertit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview2;
    private EditText editTextViewNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textview2= findViewById(R.id.textView2);
        editTextViewNumber= findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s= editTextViewNumber.getText().toString();
                int kg= Integer.parseInt(s);
                Double pound = 2.205*kg;
                textview2.setText("Corresponding Pound value is "+ pound);

            }
        });


    }
}