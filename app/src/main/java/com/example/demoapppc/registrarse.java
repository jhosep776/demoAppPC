package com.example.demoapppc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }
    public void Menuprincipal  (View view) {

        Intent siguiente =new Intent(this,menulateral.class);
        startActivity(siguiente);

    }

}