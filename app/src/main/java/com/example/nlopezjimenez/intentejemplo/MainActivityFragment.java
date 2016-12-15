package com.example.nlopezjimenez.intentejemplo;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class MainActivityFragment extends Fragment {
    public MainActivityFragment() {
    }
    Comunicador comunicar;
    public interface Comunicador{
        public void mensaje(String texto);
    }

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        comunicar = (Comunicador)contexto;
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View auxFragment = inflater.inflate(com.example.nlopezjimenez.intentejemplo.R.layout.fragment_main, container, false);

        Button boton = (Button) auxFragment.findViewById(com.example.nlopezjimenez.intentejemplo.R.id.button1);

        boton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View vista) {
                if(getResources().getBoolean(com.example.nlopezjimenez.intentejemplo.R.bool.landScape)){
                    //Toast.makeText(getActivity(),"Posición horizontal", Toast.LENGTH_LONG).show();
                    comunicar.mensaje("Sayonara baby");

                }else{
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                intent.putExtra("Hello!", "Its Me (La activity 1)");
                startActivity(intent);

                }
            }
        });
        return auxFragment;
    }
}
