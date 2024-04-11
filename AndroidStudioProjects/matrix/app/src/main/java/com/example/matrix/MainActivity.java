package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber2;
    private Button button;
    private TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber2=findViewById(R.id.editTextNumber2);
        button=findViewById(R.id.button);
        textview2=findViewById(R.id.textView2);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a=editTextNumber2.getText().toString();
                int b= Integer.parseInt(a);
                 for(int i=1;i<10;i++) {
                     int j = i * b;
                     textview2.setText(i + " * " + b + " is " + j + "\n");


                 }

            }
        });

    }
}