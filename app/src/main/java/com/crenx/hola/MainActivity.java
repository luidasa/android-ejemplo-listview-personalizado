package com.crenx.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.crenx.hola.adapters.CreditoAdapter;
import com.crenx.hola.models.Credito;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView movimientosListView;

    private CreditoAdapter creditoAdapter;

    private List<Credito> creditosList = new ArrayList<>();

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movimientosListView = (ListView) findViewById(R.id.creditosListView);

        creditosList.add(new Credito("Clasico 25", new Date(), new Date(), new BigDecimal(0)));
        creditosList.add(new Credito("Clasico 40", new Date(), new Date(), new BigDecimal(0)));
        creditosList.add(new Credito("Clasico 68", new Date(), new Date(), new BigDecimal(0)));

        creditoAdapter = new CreditoAdapter(this, R.layout.credito_row, creditosList);
        movimientosListView.setAdapter(creditoAdapter);
        movimientosListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Toast.makeText(this, "Elemento seleccionados " + position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListaMovimientosActivity.class);
        intent.putExtra("nombre", creditoAdapter.getItem(position).getNombre());
        startActivity(intent);
    }
}