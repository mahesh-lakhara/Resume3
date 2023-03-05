package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    EditText edtskill;

    TextView txtstart6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        edtskill = findViewById(R.id.edtskill);
        txtstart6 = findViewById(R.id.txtStart6);

        txtstart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String skill = edtskill.getText().toString();
                if (skill.isEmpty()) {
                    edtskill.setError("Enter your skill !");

                }else {
                    Intent intent = new Intent(MainActivity6.this,MainActivity7.class);
                    startActivity(intent);
                }

            }
        });

    }
}