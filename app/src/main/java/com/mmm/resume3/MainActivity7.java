package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    EditText edtproject;

    TextView txtstart7;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        edtproject = findViewById(R.id.edtproject);
        txtstart7 = findViewById(R.id.txtStart7);

        txtstart7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String poject = edtproject.getText().toString();
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