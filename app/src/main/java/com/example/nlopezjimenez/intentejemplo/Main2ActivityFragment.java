package com.example.nlopezjimenez.intentejemplo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Main2ActivityFragment extends Fragment {
    TextView texto;


    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View auxFragment=inflater.inflate(com.example.nlopezjimenez.intentejemplo.R.layout.fragment_main_emergente, container, false);
        texto = (TextView) auxFragment.findViewById(com.example.nlopezjimenez.intentejemplo.R.id.text1);
        return auxFragment;
    }

    public void setText(String text) {
        texto.setText(text);


    }
}