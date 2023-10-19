package com.crenx.hola.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.crenx.hola.R;
import com.crenx.hola.models.Credito;

import java.text.SimpleDateFormat;
import java.util.List;

public class CreditoAdapter extends ArrayAdapter<Credito> {

    private List<Credito> creditoList;

    private Context contexto;

    private Integer recurseLayout;

    public CreditoAdapter(@NonNull Context context, int resource, @NonNull List<Credito> objects) {
        super(context, resource, objects);

        this.contexto = context;
        this.creditoList = objects;
        this.recurseLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(this.contexto).inflate(this.recurseLayout, null);
        }
        Credito credito = this.creditoList.get(position);

        TextView productoTextView = view.findViewById(R.id.productoTextView);
        productoTextView.setText(credito.getNombre());

        TextView fechaCompraTextView = view.findViewById(R.id.fechaCompratextView);
        fechaCompraTextView.setText(SimpleDateFormat.getDateInstance().format(credito.getFechaInicio()));

        TextView fechaVencimientoTextView = view.findViewById(R.id.fechaVencimientotextView);
        fechaVencimientoTextView.setText( SimpleDateFormat.getDateInstance().format(credito.getFechaVencimiento()));

        return view;
    }
}
