package com.iesseveroochoa;

public class Personaje {
    private String nombre;
    private String localizacion;
    private String rol;

    public Personaje(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void viajaA(String lugar) {
        this.localizacion = lugar;
    }
}
