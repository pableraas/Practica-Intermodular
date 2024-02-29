package com.example.practicaintermodular.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practicaintermodular.R;
import com.example.practicaintermodular.Recycler.Venta;
import com.example.practicaintermodular.Recycler.VentasAdapter;

import java.util.ArrayList;
import java.util.List;

public class GetVentasCampoClaveFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private VentasAdapter ventasAdapter;
    private List<Venta> listaDeVentas = new ArrayList<Venta>();
    ///////////////////////////////////////////////////
    public GetVentasCampoClaveFragment() {
    }
    ///////////////////////////////////////////////////
    public static GetVentasCampoClaveFragment newInstance(String param1, String param2) {
        GetVentasCampoClaveFragment fragment = new GetVentasCampoClaveFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    ///////////////////////////////////////////////////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    ///////////////////////////////////////////////////
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_get_ventas_campo_clave, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ventasAdapter = new VentasAdapter(listaDeVentas);
        recyclerView.setAdapter(ventasAdapter);
        return rootView;
    }
    ///////////////////////////////////////////////////
}