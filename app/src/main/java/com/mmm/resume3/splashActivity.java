package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashActivity extends AppCompatActivity {

    ImageView logo;
    TextView txtrrr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = findViewById(R.id.logo);
        txtrrr = findViewById(R.id.txtrrr);

        Animation move = AnimationUtils.loadAnimation(splashActivity.this,R.anim.move);
        logo.startAnimation(move);
        txtrrr.startAnimation(move);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashActivity.this,MainActivity.class));
                finish();

            }
        },3000);

    }
}