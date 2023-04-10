package org.example;

public class Informatico extends Persona{
    public Informatico(String nombre) {
        super(nombre);
    }

    @Override
    public int correr() {
        return 3;
    }
}
