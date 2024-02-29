package com.example.practicaintermodular.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practicaintermodular.R;

import java.util.List;

public class VentasAdapter extends RecyclerView.Adapter<VentasAdapter.VentaViewHolder>  {
    private List<Venta> ventasList;

    public VentasAdapter(List<Venta> ventasList) {
        this.ventasList = ventasList;
    }
    ///////////////////////////////////////////////////
    @NonNull
    public VentaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_venta, parent, false);
        return new VentaViewHolder(itemView);
    }
    ///////////////////////////////////////////////////
    @Override
    public void onBindViewHolder(@NonNull VentaViewHolder holder, int position) {
        Venta venta = ventasList.get(position);
        holder.bind(venta);
    }
    ///////////////////////////////////////////////////
    @Override
    public int getItemCount() {
        return ventasList.size();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public static class VentaViewHolder extends RecyclerView.ViewHolder {
        public TextView twIDVenta;
        public TextView twFechaVenta;
        public TextView twIDCliente;
        public TextView twIDProducto;
        public TextView twCantidad;
        ///////////////////////////////////////////////////
        public VentaViewHolder(View itemView) {
            super(itemView);
            twIDVenta = itemView.findViewById(R.id.twIDVenta);
            twFechaVenta = itemView.findViewById(R.id.twFechaVenta);
            twIDCliente = itemView.findViewById(R.id.twIDCliente);
            twIDProducto = itemView.findViewById(R.id.twIDProducto);
            twCantidad = itemView.findViewById(R.id.twCantidad);
        }
        ///////////////////////////////////////////////////
        public void bind(Venta venta)   {
            twIDVenta.setText(String.valueOf(venta.getIdVenta()));
            twFechaVenta.setText(venta.getFechaVenta());
            twIDCliente.setText(String.valueOf(venta.getIdCliente()));
            twIDProducto.setText(String.valueOf(venta.getIdProducto()));
            twCantidad.setText(String.valueOf(venta.getCantidad()));
        }
        ///////////////////////////////////////////////////
    }
}

