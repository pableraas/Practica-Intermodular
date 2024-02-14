package com.example.practicaintermodular;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
/*
public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ProductoViewHolder> {
    private List<Producto> listaProductos;
    private OnItemClickListener listener;

    public ProductosAdapter(List<Producto> listaProductos, OnItemClickListener listener)   {
        this.listaProductos = listaProductos;
        this.listener = listener;
    }

    public ProductoViewHoler onCreateViewHolder(ViewGroup parent, int viewType)    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(view, listener);
    }

}

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        return new PersonViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.bind(person);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTextView;

        public PersonViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }

        public void bind(Person person) {
            nameTextView.setText(person.getName());
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
*/
