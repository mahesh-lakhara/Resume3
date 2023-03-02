package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView txtStart4;

    EditText edtsch,edtgrade,edtcourse,edtbord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txtStart4 = findViewById(R.id.txtStart4);
        edtsch = findViewById(R.id.edtsch);
        edtgrade = findViewById(R.id.edtgrade);
        edtcourse = findViewById(R.id.edtcourse);
        edtbord = findViewById(R.id.edtbord);

        txtStart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String school = edtsch.getText().toString();
                String gr = edtgrade.getText().toString();
                String cou = edtcourse.getText().toString();
                String bd = edtbord.getText().toString();

                if (school.isEmpty()) {
                    edtsch.setError("enter Name !");
                }else if (gr.isEmpty()){
                    edtgrade.setError("enter Grade !");
                }else if (cou.isEmpty()){
                    edtcourse.setError("enter Course/Degree !");
                }else if (bd.isEmpty()){
                    edtbord.setError("enter Borad ! ");
                }else {
                    Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                    startActivity(intent);
                }
            }
        });
    }
}