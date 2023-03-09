package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    CheckBox movie,music,game,dance,jou,act,cook,spo;

    TextView txtstart5,txthobby;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        preferences = getSharedPreferences("Mdata",0);
        editor = preferences.edit();


        movie = findViewById(R.id.movie);
        music = findViewById(R.id.music);
        game = findViewById(R.id.game);
        dance = findViewById(R.id.dance);
        jou = findViewById(R.id.jou);
        act = findViewById(R.id.act);
        cook = findViewById(R.id.cook);
        spo = findViewById(R.id.spo);
        txtstart5 = findViewById(R.id.txtStart5);
        txthobby = findViewById(R.id.txthobby);

        txtstart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h = "";

                if (movie.isChecked()){
                    h += "movie\n";
                }
                if (music.isChecked()){
                    h += "music\n";
                }
                if (game.isChecked()){
                    h += "game\n";
                }
                if (dance.isChecked()){
                    h += "dance\n";
                }
                if (jou.isChecked()){
                    h += "jou\n";
                }
                if (act.isChecked()){
                    h += "act\n";
                }
                if (cook.isChecked()){
                    h += "cook\n";
                }
                if (spo.isChecked()){
                    h += "spo\n";
                }

                txthobby.setText("hobby: = "+h);
                Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(intent);

            }
        });

    }
}