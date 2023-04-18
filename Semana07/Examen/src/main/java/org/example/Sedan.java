package org.example;

public class Sedan extends Vehiculo{
    public Sedan(String anio, String marca, String modelo, double punitario, boolean traccion) {
        super(anio, marca, modelo, punitario);
        this.traccion = traccion;
    }



    private boolean traccion;
}
