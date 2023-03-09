package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    EditText edtproject;

    TextView txtstart7;

    SharedPreferences preferences;

    SharedPreferences.Editor editor;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        preferences = getSharedPreferences("Mdata",0);
        editor = preferences.edit();

        edtproject = findViewById(R.id.edtproject);
        txtstart7 = findViewById(R.id.txtStart7);

        txtstart7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String poject = edtproject.getText().toString();

                editor.putString("poject",poject);
                editor.commit();

                if (poject.isEmpty()) {
                    edtproject.setError("Enter your project !");

                }else {
                    Intent intent = new Intent(MainActivity7.this,MainActivity9.class);
                    startActivity(intent);
                }

            }
        });
    }
}