package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView txtStart3;

    EditText edtcompany,edtAddress,edtExp,edtpos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtStart3 = findViewById(R.id.txtStart3);
        edtcompany = findViewById(R.id.edtcompany);
        edtAddress = findViewById(R.id.edtAddress);
        edtExp= findViewById(R.id.edtExp);
        edtpos = findViewById(R.id.edtpos);

        txtStart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String company = edtcompany.getText().toString();
                String address = edtAddress.getText().toString();
                String exp = edtExp.getText().toString();
                String poss = edtpos.getText().toString();

                if (company.isEmpty()) {
                    edtcompany.setError("enter Name !");
                }else if (address.isEmpty()){
                    edtAddress.setError("enter address !");
                }else if (exp.isEmpty()){
                    edtExp.setError("enter Experience !");
                }else if (poss.isEmpty()){
                    edtpos.setError("enter position ! ");
                }else {
                    Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });

    }
}