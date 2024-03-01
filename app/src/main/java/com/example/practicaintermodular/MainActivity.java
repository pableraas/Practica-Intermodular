package com.example.practicaintermodular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.practicaintermodular.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;//funciona
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btInicio.setOnClickListener(this);
    }
    //////////////////////////////////////////
    @Override
    public void onClick(View view) {
        if(view.getId() == binding.btInicio.getId())    {
            intentActividadIntermedia();
        }
    }
    //////////////////////////////////////////
    public void intentActividadIntermedia() {
        Intent intent = new Intent(this, ActividadIntermedia.class);
        startActivity(intent);
    }
}