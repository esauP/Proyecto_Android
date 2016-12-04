package net.sgoliver.android.fragments;

/**
 * Created by esaup on 03/12/2016.
 */

public class Alumno {
    private String nombre;
    private String dni;
    private String curso;
    private String telefono;
    private String emai;
    private byte imagen;

    public Alumno(String nombre, String dni, String curso, String telefono, String emai) {
        this.nombre = nombre;
        this.dni = dni;
        this.curso = curso;
        this.telefono = telefono;
        this.emai = emai;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
