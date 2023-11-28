package com.example.prctica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Enviar(View view) {
        /* EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        Toast.makeText(getApplicationContext(), "Hola!!!"+ txtNombre.getText().toString() + "!!",
                Toast.LENGTH_SHORT).show();*/

        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
//Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("NOMBRE", txtNombre.getText().toString());
//Añadimos la información al intent
        intent.putExtras(b);
// Iniciamos la nueva actividad
        startActivity(intent);
    }
    }
