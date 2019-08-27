package com.example.friday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.friday.R;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button button;
    private Intent intent = new Intent(this, MainActivity.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
