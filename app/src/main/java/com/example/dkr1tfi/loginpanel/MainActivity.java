package com.example.dkr1tfi.loginpanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void zaloguj(View view){

        EditText loginInput = (EditText) findViewById(R.id.loginInput);
        EditText passwordInput = (EditText) findViewById(R.id.passwordInput);
        Log.i("Info", loginInput.getText().toString());
        Log.i("Info", passwordInput.getText().toString());
        Toast.makeText(MainActivity.this, "Hi newjoiner: "+loginInput.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
