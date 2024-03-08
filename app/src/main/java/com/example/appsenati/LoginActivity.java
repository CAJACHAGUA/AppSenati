package com.example.appsenati;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
  EditText usuario, pasword;
  Button ingreso , restaurar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnPerfil), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        usuario = (EditText)findViewById(R.id.etUsuario);
        pasword =(EditText) findViewById(R.id.etPassword);
        ingreso =(Button) findViewById(R.id.btnIngreso);
        restaurar = (Button) findViewById(R.id.btnRestaurar);
        ingreso.setOnClickListener(this);
        restaurar.setOnClickListener(this);
    }
    public void Ingresar(){
        Intent intent = new Intent(this, MainPanel.class);
        startActivity(intent);
    }


    public void Restaurar(){

    }


    @Override
    public void onClick(View v) {
        if (v == ingreso) {
            Ingresar();

        } else {
            Restaurar();
        }
    }
}