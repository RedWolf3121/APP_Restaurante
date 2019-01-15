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

    EditText et1,et2,et3;
    Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        et1= findViewById(R.id.usuario);
        et2= findViewById(R.id.pasword);
        et3= findViewById(R.id.pasword2);

        registro = findViewById(R.id.registrarse);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrar();
            }
        });
    }
    public void registrar () {
        DatabaseHelper admin = new DatabaseHelper(this,
                "usuarios", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String user = et1.getText().toString();
        String passwd = et2.getText().toString();
        String passwd1 = et3.getText().toString();

        ContentValues registro = new ContentValues();
        registro.put("usuario", user);
        registro.put("contraseña", passwd);
        registro.put("contraseña1", passwd1);
        bd.insert("usuarios", null, registro);
        bd.close();
        et1.setText("");
        et2.setText("");
        et3.setText("");
        Toast.makeText(this, "Registro Completado", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(RegistroActivity.this,LoginActivity.class);
        startActivity(intent);
    }

}
