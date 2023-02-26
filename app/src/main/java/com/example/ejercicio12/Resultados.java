package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    TextView tvNombre, tvApellido, tvEdad, tvCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        tvNombre = findViewById(R.id.tvNombre);
        tvApellido = findViewById(R.id.tvApellido);
        tvEdad = findViewById(R.id.tvEdad);
        tvCorreo = findViewById(R.id.tvCorreo);

        Intent intent = getIntent();
        persona persona = (persona) intent.getSerializableExtra("persona");

        tvNombre.setText(persona.getNombre());
        tvApellido.setText(persona.getApellido());
        tvEdad.setText(Integer.toString(persona.getEdad()));
        tvCorreo.setText(persona.getCorreo());
    }
}
