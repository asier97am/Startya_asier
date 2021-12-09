package com.asier.aranda.startya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SYARegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.syaregistro);
    }

    public void closeApp(View view){
        this.finishAffinity();
    }

    //ONCLICK PARA IR AL REGISTRO "SIGNUP"
    public void openRegistro(View v){
        Intent intent=new Intent(SYARegistro.this, SYAIngreso.class);
        startActivity(intent);
    }
}