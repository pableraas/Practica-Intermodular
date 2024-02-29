package com.example.practicaintermodular.Recycler;

import android.view.View;
import android.widget.TextView;

import com.example.practicaintermodular.R;
import com.example.practicaintermodular.Recycler.RecyclerView;

public class VentaViewHolder extends RecyclerView {
    public TextView twIDVenta;
    public TextView twFechaVenta;
    public TextView twIDCliente;
    public TextView twIDProducto;
    public TextView twCantidad;
    ///////////////////////////////////////////////////
    public VentaViewHolder(View itemView) {
        super();
        twIDVenta = itemView.findViewById(R.id.twIDVenta);
        twFechaVenta = itemView.findViewById(R.id.twFechaVenta);
        twIDCliente = itemView.findViewById(R.id.twIDCliente);
        twIDProducto = itemView.findViewById(R.id.twIDProducto);
        twCantidad = itemView.findViewById(R.id.twCantidad);
    }
    ///////////////////////////////////////////////////
}