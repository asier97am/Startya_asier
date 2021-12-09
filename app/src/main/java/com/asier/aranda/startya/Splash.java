package com.asier.aranda.startya;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;



public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        ImageView mback =findViewById(R.id.fondoSplash);
        Glide.with(this)
                .load(R.drawable.bosque1splash)
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.naranjaExam)))
                .centerCrop()
                .into(mback);
    }
}