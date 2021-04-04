package com.example.demoapppc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente   (View view) {

        Intent siguiente =new Intent(this,login.class);
        startActivity(siguiente);

    }

    public void registro  (View view) {

        Intent siguiente =new Intent(this,registrarse.class);
        startActivity(siguiente);

    }





}