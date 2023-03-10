package com.mmm.resume3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {

    TextView txtName,txtAddress,txtEmail,txtMoblie;

    TextView txtsch,txtgrade,txtCource,txtBoard;

    TextView txtCompany,txtAdd,txtExp,txtpos;

    TextView txtpro;

    TextView txtskill;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        preferences = getSharedPreferences("Mdata",0);

        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        txtEmail = findViewById(R.id.txtEmail);
        txtMoblie = findViewById(R.id.txtMoblie);

        txtsch = findViewById(R.id.txtsch);
        txtgrade = findViewById(R.id.txtgrade);
        txtCource = findViewById(R.id.txtCource);
        txtBoard = findViewById(R.id.txtBoard);

        txtCompany = findViewById(R.id.txtCompany);
        txtAdd = findViewById(R.id.txtAdd);
        txtExp = findViewById(R.id.txtExp);
        txtpos = findViewById(R.id.txtpos);

        txtpro = findViewById(R.id.txtpro);

        txtskill = findViewById(R.id.txtskill);

        String name = preferences.getString("name","");
        String address = preferences.getString("address","");
        String emai = preferences.getString("emai","");
        String mobli = preferences.getString("mobli","");

        String school = preferences.getString("school","");
        String gr = preferences.getString("gr","");
        String cou = preferences.getString("cou","");
        String bd = preferences.getString("bd","");

        String company = preferences.getString("company","");
        String add = preferences.getString("add","");
        String exp = preferences.getString("exp","");
        String poss = preferences.getString("poss","");

        String skill = preferences.getString("skill","");

        String poject = preferences.getString("poject","");


        txtName.setText(name);
        txtAddress.setText(address);
        txtEmail.setText(emai);
        txtMoblie.setText(mobli);

        txtsch.setText(school);
        txtgrade.setText(gr);
        txtCource.setText(cou);
        txtBoard.setText(bd);

        txtCompany.setText(company);
        txtAdd.setText(add);
        txtExp.setText(exp);
        txtpos.setText(poss);

        txtpro.setText(poject);

        txtskill.setText(skill);


    }
}