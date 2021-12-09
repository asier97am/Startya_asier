package com.asier.aranda.startya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class SYAIngreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.syaingreso);
    }

    public void openMainActivity(View v){
       //no hace nada
    }

    //ONCLICK PARA IR AL REGISTRO "SIGNUP"
    public void openRegistro(View v){
        Intent intent=new Intent(SYAIngreso.this, SYARegistro.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}