package com.example.dani.app_restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;
    EditText e1, e2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);
        e1 = (EditText)findViewById(R.id.usuario);
        e2 = (EditText)findViewById(R.id.pasword);
        btn = (Button) findViewById(R.id.btnLogin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = e1.getText().toString();
                String pasword = e2.getText().toString();
                if (usuario.equals("")||pasword.equals("")){
                    Toast.makeText(getApplicationContext(), "los campos están vacíos",Toast.LENGTH_SHORT).show();
                }else{
                    Boolean chkemail = db.chkemail(usuario);
                    if (chkemail==true){
                        Boolean insert = db.insert(usuario,pasword);
                        if (insert==true){
                            Toast.makeText(getApplicationContext(),""
                        }
                    }
                }
            }
        });
    }
}
