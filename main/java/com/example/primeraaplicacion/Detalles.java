package com.example.primeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        String nombre = getIntent().getExtras().getString("nombre");
        String fecha = getIntent().getExtras().getString("fecha");
        String telefono = getIntent().getExtras().getString("telefono");
        String email = getIntent().getExtras().getString("email");
        String descripcion = getIntent().getExtras().getString("descripcion");

        tvNombre = (TextView) findViewById(R.id.tvNombreDetalles);
        tvFecha = (TextView) findViewById(R.id.tvFechaDetalles);
        tvTelefono = (TextView) findViewById(R.id.tvTelefonoDetalles);
        tvEmail = (TextView) findViewById(R.id.tvEmailDetalles);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcionDetalles);


        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(telefono);
        tvDescripcion.setText(telefono);

        Button miButton = (Button) findViewById(R.id.buttonDetalles);
        miButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detalles.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }
}