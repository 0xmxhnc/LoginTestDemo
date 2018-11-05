package com.example.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.login);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username1 = username.getText().toString();
        String password1 = password.getText().toString();
        String ok = "登录成功";
        String fail = "登录失败";
        if (username1.equals("lhk") && password1.equals("123456")) {
            Toast.makeText(MainActivity.this,ok,Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this,fail,Toast.LENGTH_SHORT).show();
        }

    }
}
