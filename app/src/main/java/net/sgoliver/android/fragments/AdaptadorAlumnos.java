package net.sgoliver.android.fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by esaup on 03/12/2016.
 */

public class AdaptadorAlumnos extends RecyclerView.Adapter<AdaptadorAlumnos.ViewHolder> {

    protected VectorAlumnos contactos;
    protected LayoutInflater inflador;   //Crea Layouts a partir del XML
    protected Context contexto;          //Lo necesitamos para el inflador
    protected View.OnClickListener onClickListener;

    public AdaptadorAlumnos(Context contexto, VectorAlumnos contact) {
        this.contexto = contexto;
        this.contactos = contact;
        inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView dni;
        TextView curso;

        ViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.etiNombre);
            dni = (TextView) itemView.findViewById(R.id.etiDni);
            curso = (TextView) itemView.findViewById(R.id.etiCurso);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.listitem_alumno, parent, false);
        v.setOnClickListener(onClickListener);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int posicion) {
        holder.nombre.setText(contactos.getAlumno(posicion).getNombre());
        holder.dni.setText(contactos.getAlumno(posicion).getDni());
        holder.curso.setText(contactos.getAlumno(posicion).getCurso());
    }

    @Override
    public int getItemCount() {
        return contactos.getTamanio();
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
