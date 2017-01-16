package com.example.nlopezjimenez.intentejemplo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.app.Activity.RESULT_OK;



public class Main2ActivityFragment extends Fragment {
    TextView texto;


    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View auxFragment=inflater.inflate(com.example.nlopezjimenez.intentejemplo.R.layout.fragment_main_emergente, container, false);
        texto = (TextView) auxFragment.findViewById(com.example.nlopezjimenez.intentejemplo.R.id.text1);
        texto.setText("Hola");
        Button cancel = (Button) auxFragment.findViewById(R.id.cancel);
        cancel.setOnClickListener( new View.OnClickListener() {
            public void onClick(View vista) {

                Intent checkback=new Intent();
                checkback.putExtra("checkback","");
                getActivity().setResult(RESULT_OK, checkback);
                getActivity().finish();

            }


        });
        return auxFragment;
    }

    public void setText(String str){
        texto.setText(str);
    }


}