package com.example.dani.app_restaurante;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        et1= findViewById(R.id.usuario);
        et2= findViewById(R.id.pasword);
        et3= findViewById(R.id.pasword2);
    }
    public void registrar(View view){

        DatabaseHelper admin=new DatabaseHelper(this,"Restaurante",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();
        String usuario=et1.getText().toString();
        String password=et2.getText().toString();
        String password2=et3.getText().toString();

        ContentValues values=new ContentValues();
        values.put("usuario",usuario);
        values.put("password",password);
        values.put("password2",password2);

        db.insert("usuarios",null,values);
        db.close();

        Intent intent=new Intent(this,MenuPrincipalActivity.class);
        startActivity(intent);

    }
}
