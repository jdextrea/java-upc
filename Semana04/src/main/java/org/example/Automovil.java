package org.example;

public class Automovil {

    //Atributos
    private String placa;
    private int nroPuertas;
    private String color;
    private boolean esAlquilado;
    private int anhoFrabricacion;
    //Constructor
    public Automovil(String placa, int nroPuertas, String color, boolean esAlquilado, int anhoFrabricacion) {
        this.placa = placa;
        this.nroPuertas = nroPuertas;
        this.color = color;
        this.esAlquilado = esAlquilado;
        this.anhoFrabricacion = anhoFrabricacion;
    }

//Metodos
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsAlquilado() {
        return esAlquilado;
    }

    public void setEsAlquilado(boolean esAlquilado) {
        this.esAlquilado = esAlquilado;
    }

    public int getAnhoFrabricacion() {
        return anhoFrabricacion;
    }

    public void setAnhoFrabricacion(int anhoFrabricacion) {
        this.anhoFrabricacion = anhoFrabricacion;
    }

    //Metodo para calcular la antiguedad
    public int calcularAntiguedad() {
        return 2023 - this.anhoFrabricacion;
    }
    @Override
    public String toString() {
        return "Automovil{" +
                "placa='" + placa + '\'' +
                ", nroPuertas=" + nroPuertas +
                ", color='" + color + '\'' +
                ", esAlquilado=" + esAlquilado +
                ", anhoFrabricacion=" + anhoFrabricacion +
                '}';
    }


}
