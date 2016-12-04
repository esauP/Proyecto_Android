package net.sgoliver.android.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;


public class FragmentListado extends Fragment {

    private VectorAlumnos vectorAlumnos;

    Alumno alumno1 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");
    Alumno alumno2 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");
    Alumno alumno3 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");
    Alumno alumno4 = new Alumno("String nombre", "String dni", "String curso", "String telefono", "String emai");

    List<Alumno> lista = new ArrayList<>();

    RecyclerView lstListado;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_listado, container, false);
    }

   /* @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);


        lstListado.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
                if (listener != null) {
                    listener.onCorreoSeleccionado(
                            (Correo) lstListado.getAdapter().getItem(pos));
                }
            }
        });
    }
*/

}