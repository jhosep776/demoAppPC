package com.example.demoapppc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void menup   (View view) {

        Intent siguiente =new Intent(this,menulateral.class);
        startActivity(siguiente);

    }
}

/* I had a haking ethics class at the end of the class then I started developing an application in Android Studio

 */