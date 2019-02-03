package com.example.dkr1tfi.loginpanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void zaloguj(View view){

        EditText loginInput = (EditText) findViewById(R.id.loginInput);
        EditText passwordInput = (EditText) findViewById(R.id.passwordInput);
        Log.i("Info", loginInput.getText().toString());
        Log.i("Info", passwordInput.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
