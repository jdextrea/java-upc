package org.example;

public class Ejercio01 {
    public static void main(String args[]) {
        //Crear una variable de notas
        int[] notasArreglo = {14,12,16,20,18};
        double proPra = (notasArreglo[0] + notasArreglo[1] + notasArreglo[2])/3*0.2;
        double proPar = notasArreglo[3]*0.3;
        double proFinal = notasArreglo[4] * 0.5;
        double promedioFinal = proPar + proPra + proFinal;



    }
}
