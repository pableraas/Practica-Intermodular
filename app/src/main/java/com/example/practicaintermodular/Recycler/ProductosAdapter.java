package com.example.practicaintermodular.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practicaintermodular.R;

import java.util.List;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ProductoViewHolder>  {
    private List<Producto> productoList;
    public ProductosAdapter(List<Producto> productoList) {
        this.productoList = productoList;
    }
    ///////////////////////////////////////////////////
    @NonNull
    public ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_producto, parent, false);
        return new ProductoViewHolder(itemView);
    }
    ///////////////////////////////////////////////////
    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Producto producto = productoList.get(position);
        holder.bind(producto);
    }
    ///////////////////////////////////////////////////
    @Override
    public int getItemCount() {
        return productoList.size();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public static class ProductoViewHolder extends RecyclerView.ViewHolder {
        public TextView twIDProducto;
        public TextView descripcion;
        public TextView stockAnual;
        public TextView PVP;
        ///////////////////////////////////////////////////
        public ProductoViewHolder(View itemView) {
            super(itemView);
            twIDProducto = itemView.findViewById(R.id.twIDProducto);
            descripcion = itemView.findViewById(R.id.twDescripcion);
            stockAnual = itemView.findViewById(R.id.twStockAnual);
            PVP = itemView.findViewById(R.id.twPVP);
        }
        ///////////////////////////////////////////////////
        public void bind(Producto producto)   {
            twIDProducto.setText(String.valueOf(producto.getId()));
            descripcion.setText(producto.getDescripcion());
            stockAnual.setText(String.valueOf(producto.getStockAnual()));
            PVP.setText(String.valueOf(producto.getPVP()));
        }
        ///////////////////////////////////////////////////
    }
}

