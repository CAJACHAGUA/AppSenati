package com.example.appsenati;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mi_cuenta extends AppCompatActivity implements View.OnClickListener {
   Button cerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mi_cuenta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnPerfil), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cerrar=(Button) findViewById(R.id.btnCerrarSesion);
        cerrar.setOnClickListener(this);
    }
    public void Close(){
        // Mostrar los datos en un Dialog modal
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Esta seguro de salir?");

        alertDialogBuilder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Acción al hacer clic en el botón Aceptar
                finishAffinity();//Cerrar toda actividad
            }
        });

        // Crear y mostrar el Dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }
    @Override
    public void onClick(View v) {
        Close();

    }
}