package org.example;

public class Vehiculo {
    private String anio;
    private String marca;
    private String modelo;

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPunitario() {
        return punitario;
    }

    public void setPunitario(double punitario) {
        this.punitario = punitario;
    }

    private double punitario;
    public Vehiculo(String anio, String marca, String modelo, double punitario) {
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.punitario = punitario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "anio='" + anio + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", punitario=" + punitario +
                '}';
    }
}
