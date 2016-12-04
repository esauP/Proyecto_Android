package net.sgoliver.android.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
       /* implements FragmentListado.CorreosListener */{



    private VectorAlumnos vectorAlumnos;
    private AdaptadorAlumnos adaptador;

    Alumno alumno1 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");
    Alumno alumno2 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");
    Alumno alumno3 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");
    Alumno alumno4 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");

    List<Alumno> lista = new ArrayList<>();

    RecyclerView lstListado;
    long id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentListado frgListado =
                (FragmentListado)getSupportFragmentManager()
                    .findFragmentById(R.id.FrgListado);



        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);

        vectorAlumnos = new VectorAlumnos(lista);


        lstListado = (RecyclerView) findViewById(R.id.LstListado);

        adaptador = new AdaptadorAlumnos(this, vectorAlumnos);

        lstListado.setAdapter(adaptador);


        adaptador.setOnItemClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                id = (long) lstListado.getChildAdapterPosition(view);
                DetalleActivity fragment = new DetalleActivity();

            }
        });

//        frgListado.setCorreosListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   /* @Override
    public void onCorreoSeleccionado(Correo c) {
        boolean hayDetalle =
                (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);

        if(hayDetalle) {
            ((FragmentDetalle)getSupportFragmentManager()
                    .findFragmentById(R.id.FrgDetalle)).mostrarDetalle(c.getTexto());
        }
        else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO, c.getTexto());
            startActivity(i);
        }
    }*/
}
