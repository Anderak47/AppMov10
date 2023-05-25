package com.example.app1.Clases;

public class Anime {
    private String nombre;
    private String Descripcion;
    private String foto;
    private boolean estrella = false;

    public Anime(String nombre, String descripcion, String foto, boolean estrella) {
        this.nombre = nombre;
        Descripcion = descripcion;
        this.foto = foto;
        this.estrella = estrella;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }
}
