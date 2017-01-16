package com.example.nlopezjimenez.intentejemplo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements MainActivityFragment.Comunicador{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.nlopezjimenez.intentejemplo.R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(com.example.nlopezjimenez.intentejemplo.R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void msg(String texto){
        Main2ActivityFragment fragment=(Main2ActivityFragment) getSupportFragmentManager().findFragmentById(com.example.nlopezjimenez.intentejemplo.R.id.fragment);
        if(fragment != null){
            fragment.setText(texto);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.example.nlopezjimenez.intentejemplo.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == com.example.nlopezjimenez.intentejemplo.R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
