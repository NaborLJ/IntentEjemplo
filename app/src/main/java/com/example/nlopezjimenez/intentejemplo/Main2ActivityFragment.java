package com.example.nlopezjimenez.intentejemplo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {
    TextView texto;
    View auxFragment;
    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_emergente, container, false);
        texto = (TextView) auxFragment.findViewById(R.id.text1);
        return auxFragment;
    }
    public void setText(String text){
        texto.setText(text);
    }
}
