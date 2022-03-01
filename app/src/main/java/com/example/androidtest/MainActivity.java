package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        final Button login = findViewById(R.id.login);
        login.setOnClickListener(view -> {
            if (username.getText().toString().equals("Jarviz") && password.getText().toString().equals("123456")){
                Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this,"用户名或密码错误",Toast.LENGTH_SHORT).show();
            }
        });
    }
}