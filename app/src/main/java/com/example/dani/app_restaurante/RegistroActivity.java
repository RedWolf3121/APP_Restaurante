package com.example.dani.app_restaurante;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class RegistroActivity extends AppCompatActivity {

    public String email;
    public String passwd1;
    public String passwd2;
    public String tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        email = findViewById(R.id.email).toString();
        passwd1 = findViewById(R.id.pasword).toString();
        passwd2 = findViewById(R.id.pasword2).toString();
        tel = findViewById(R.id.tel).toString();



    }
}
