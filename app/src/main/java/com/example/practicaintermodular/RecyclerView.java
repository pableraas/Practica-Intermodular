package com.example.practicaintermodular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecyclerView extends AppCompatActivity {

    private RecyclerView recyclerView;
    //private PersonAdapter personAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
    }
}