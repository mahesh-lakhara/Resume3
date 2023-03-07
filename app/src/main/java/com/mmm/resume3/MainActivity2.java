package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtStart2;

    EditText edtName,edtAddress,edtEmail,edtmoblie;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        txtStart2 = findViewById(R.id.txtStart2);
        edtName = findViewById(R.id.edtName);
        edtAddress = findViewById(R.id.edtAddress);
        edtEmail= findViewById(R.id.edtEmail);
        edtmoblie = findViewById(R.id.edtmoblie);

        txtStart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                String address = edtAddress.getText().toString();
                String emai = edtEmail.getText().toString();
                String mobli = edtmoblie.getText().toString();

                editor.putString("name",name);
                editor.putString("address",address);
                editor.putString("email",emai);
                editor.putString("moblie",mobli);
                editor.commit();

                if (name.isEmpty()) {
                    edtName.setError("enter Name !");
                }else if (address.isEmpty()){
                    edtAddress.setError("enter address !");
                }else if (emai.isEmpty()){
                    edtEmail.setError("enter Experience !");
                }else if (mobli.isEmpty()){
                    edtmoblie.setError("enter position ! ");
                }else {
                    Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(intent);
                }

            }
        });

    }
}