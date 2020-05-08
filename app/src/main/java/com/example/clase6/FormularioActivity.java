package com.example.clase6;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);
        ActionBar toolbar = getSupportActionBar();
        //habilitas el boton back a la izquierda
        toolbar.setDisplayHomeAsUpEnabled(true);
        //
       // String edad = (String) super.getIntent().getExtras().get("nombre");

        TextView tv = super.findViewById(R.id.nombre);
        tv.setText(MainActivity.p.nombre + " " +MainActivity.p.edad);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu m){
        super.getMenuInflater().inflate(R.menu.menu, m);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            Intent i = new Intent(this,MainActivity.class);
            super.finish();
            //tengo q cerrar el activity y vuelve al home pq nunca se cerro
        }

    return true;

    }

}
