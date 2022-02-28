package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button trueBtn = findViewById(R.id.true_button);
        final Button falseBtn = findViewById(R.id.false_button);
        trueBtn.setOnClickListener(view -> {
            Toast.makeText(this,R.string.true_message,Toast.LENGTH_SHORT).show();
        });
        falseBtn.setOnClickListener(view -> {
            Toast.makeText(this,R.string.false_message,Toast.LENGTH_SHORT).show();
        });
    }
}