package com.crenx.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ListaMovimientosActivity extends AppCompatActivity {

    TextView nombreProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_movimientos);

        nombreProducto = findViewById(R.id.nombreProducto);
        String nombreString = getIntent().getStringExtra("nombre");
        nombreProducto.setText(nombreString);
        Toast.makeText(this, "Este es el parametro recibido " + nombreString, Toast.LENGTH_SHORT).show();

    }
}