package org.example;

public class Boleta {
    private double monto;
    public double calcularIgv (double monto) {
        this.monto = monto;
        return (monto*0.18);
    }
    public double calcularMontoTotal (double monto) {
        this.monto = monto;
        double total = Math.round(((monto-(monto*0.18))*100.0)/100.0);
        return total;
    }
}
