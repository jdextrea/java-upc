package org.example;

public class Suv extends Vehiculo{
    public Suv(String anio, String marca, String modelo, double punitario, boolean traccion) {
        super(anio, marca, modelo, punitario);
        this.traccion = traccion;
    }

    private boolean traccion;
    public double dscto(double precio) {

        return  (precio*0.25);
    }
}
