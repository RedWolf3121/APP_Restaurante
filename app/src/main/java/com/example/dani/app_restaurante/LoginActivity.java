package com.example.dani.app_restaurante;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText et1,et2;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1= findViewById(R.id.usuario);
        et2= findViewById(R.id.pasword);

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        findViewById(R.id.provisional).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MenuPrincipalActivity.class);
                startActivity(intent);
            }
        });
    }

    public void login() {
        DatabaseHelper admin = new DatabaseHelper(this,
                "usuarios", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String usuario = et1.getText().toString();
        Cursor fila = bd.rawQuery(
                "select usuario,contraseña  from usuarios where usuario="+usuario+"",null);
        if (fila.moveToFirst()) {
            et1.setText(fila.getString(1));
            et2.setText(fila.getString(2));
        } else
            Toast.makeText(this, "No existe una persona con ese usuario", Toast.LENGTH_SHORT).show();
        bd.close();
        Intent intent = new Intent(LoginActivity.this,MenuPrincipalActivity.class);
        startActivity(intent);

    }
}
