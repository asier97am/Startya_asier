package com.asier.aranda.startya;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;



public class SYABienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.SYABienvenida);
        openApp(true);

        //implementar animacion  ------------------LOGO PRINCIPAL------------------
        ImageView mLogo = (ImageView) findViewById(R.id.logoprincipal);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mLogo.startAnimation(myanim);//inicio Animacion

        ImageView mback =findViewById(R.id.fondoSplash);
        Glide.with(this)
                .load(R.drawable.bosque1splash)
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.naranjaExam)))
                .centerCrop()
                .into(mback);
    }

    private void openApp(boolean locationPermission) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                //aqui indicamos que vaya del Splash al login
                Intent intent = new Intent(SYABienvenida.this, SYAIngreso.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);//tarda 3s en pasar al siguiente activity
    }
}