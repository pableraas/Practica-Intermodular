package com.example.practicaintermodular;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.practicaintermodular.Fragments.DeleteFragment;
import com.example.practicaintermodular.Fragments.GetProductosFragment;
import com.example.practicaintermodular.Fragments.GetVentasCampoClaveFragment;
import com.example.practicaintermodular.Fragments.GetVentasFechaFragment;
import com.example.practicaintermodular.Fragments.GetVentasNifFragment;
import com.example.practicaintermodular.Fragments.PutFragment;
import com.google.android.material.tabs.TabLayout;

public class PrimeraActividad extends AppCompatActivity {
    FrameLayout frameLayout;
    TabLayout tabLayout;
    ///////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_actividad);
        frameLayout = (FrameLayout) findViewById(R.id.framelayout);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, new GetProductosFragment()).addToBackStack(null).commit();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                if (tab.getPosition() == 0) {
                    fragment = new GetProductosFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, fragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
    ///////////////////////////////////////////////////
}