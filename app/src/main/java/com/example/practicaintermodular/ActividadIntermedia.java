package com.example.practicaintermodular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.practicaintermodular.databinding.ActivityActividadIntermediaBinding;
import com.example.practicaintermodular.databinding.ActivityMainBinding;

public class ActividadIntermedia extends AppCompatActivity implements View.OnClickListener {

    ActivityActividadIntermediaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityActividadIntermediaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btConsultarProductos.setOnClickListener(this);
        binding.btGestionVentas.setOnClickListener(this);
    }
    //////////////////////////////////////////
    @Override
    public void onClick(View view) {
        if(view.getId() == binding.btConsultarProductos.getId())    {
            //intentSegundaActividad();
        } else if(view.getId() == binding.btGestionVentas.getId())  {
            intentSegundaActividad();
        }
    }
    //////////////////////////////////////////
    public void intentSegundaActividad() {
        Intent intent = new Intent(this, SegundaActividad.class);
        startActivity(intent);
    }
}