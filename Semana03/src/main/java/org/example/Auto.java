package org.example;

public class Auto extends Vehiculo{
    public Auto(String placa, String marca, String modelo, String maletera, String parabrisa, String plumilla) {
        super(placa,marca,modelo);
        //super();
        this.maletera = maletera;
        this.parabrisa = parabrisa;
        this.plumilla = plumilla;
    }

    //atributos
    private String maletera;
    private String parabrisa;
    private String plumilla;

    public String getMaletera() {
        return maletera;
    }

    //Constructor

    //Metodos
    public void setMaletera(String maletera) {
        this.maletera = maletera;
    }

    public String getParabrisa() {
        return parabrisa;
    }

    public void setParabrisa(String parabrisa) {
        this.parabrisa = parabrisa;
    }

    public String getPlumilla() {
        return plumilla;
    }

    public void setPlumilla(String plumilla) {
        this.plumilla = plumilla;
    }

    //Metodo correr
    public void correr() {
        System.out.println("Corriendo el auto");
    }
}



