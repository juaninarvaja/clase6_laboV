package com.example.clase6;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static Persona p = new Persona();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public boolean onCreateOptionsMenu(Menu m){
        //le decimos cual va a ser el menu de la main activity
        //el inflate transforma el xml en un view
        super.getMenuInflater().inflate(R.menu.menu, m);

        return true;
    }
    //para q ele evento click funciones sobre las opciones q creamos
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.opcion){
            Log.d("Llego a menu","Se hizo click en configuracion");
        }
        else if (item.getItemId() == R.id.alta){
            Log.d("Llego a menu","Se hizo click en el alta");
            //vamos a hacer un intetn EXPLICITO
            Intent intent = new Intent(this, FormularioActivity.class);
            //intent.putExtra("queEntra","cualquier dato primitvo o string");
           // intent.putExtra("nombre","Juan");
            //intent.putExtra("edad",23);
            p.edad = 23;
            p.nombre = "Juan";
            super.startActivity(intent); //arranca la activity
        }

        return true;
    }




}
