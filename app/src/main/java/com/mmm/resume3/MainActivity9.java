package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {

    ImageView tem1,tem2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        tem1 = findViewById(R.id.tem1);
        tem2 = findViewById(R.id.tem2);

        tem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity9.this,MainActivity10.class);
                startActivity(intent);

            }
        });
tem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity9.this,MainActivity11.class);
                startActivity(intent);

            }
        });

    }
}