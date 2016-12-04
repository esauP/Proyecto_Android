package net.sgoliver.android.fragments;

import java.util.List;

/**
 * Created by esaup on 03/12/2016.
 */

public class VectorAlumnos {
    protected List<Alumno> vecAlumno ;

    public VectorAlumnos(List<Alumno> vecAlumno) {
        this.vecAlumno = vecAlumno;
    }

    public Alumno getAlumno(int posicion){
        return vecAlumno.get(posicion);
    }

    public int getTamanio(){
        return vecAlumno.size();
    }

    public void AniadeAlumno(Alumno alumno){
        this.vecAlumno.add(alumno);
    }
}
