package org.example;

public abstract class Persona {
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract int correr();





}
