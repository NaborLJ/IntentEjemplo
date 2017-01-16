package com.example.nlopezjimenez.intentejemplo;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;




import static android.app.Activity.RESULT_OK;


public class MainActivityFragment extends Fragment {
    public final static int CODIGO=1;
    TextView texto;
    public MainActivityFragment() {
    }
    Comunicador comunicar;
    public interface Comunicador{
         void msg(String texto);
    }

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        comunicar = (Comunicador)contexto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View auxView = inflater.inflate(com.example.nlopezjimenez.intentejemplo.R.layout.fragment_main, container, false);
        Button boton = (Button) auxView.findViewById(com.example.nlopezjimenez.intentejemplo.R.id.button1);
        texto = (TextView) auxView.findViewById(R.id.textResult);
        boton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View vista) {
                if(getResources().getBoolean(com.example.nlopezjimenez.intentejemplo.R.bool.landScape)){
                    comunicar.msg("Sayonara baby");

                }else{
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                intent.putExtra("checkback", "Its Me (La activity 1)");
                startActivityForResult(intent,CODIGO);

                }

            }
        });
        return auxView;
    }
    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CODIGO) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("checkback");
                texto.setText("Cerrada Activity 2");
            }

        }
    }
}


