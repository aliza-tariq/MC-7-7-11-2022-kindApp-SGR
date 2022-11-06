package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button btnInc, btnDec, btnReset;
    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInc = findViewById(R.id.button1);
        btnDec = findViewById(R.id.button2);
        btnReset = findViewById(R.id.button3);

        textView = findViewById(R.id.textCount);
        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value++;
                textView.setText(Integer.toString(value));
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value--;
                textView.setText(Integer.toString(value));
            }

        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=0;
                textView.setText("0");
            }
        });


    }
}