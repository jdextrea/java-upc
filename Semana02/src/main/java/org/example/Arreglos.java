package org.example;

public class Arreglos {
    public static void main(String args[]) {
        int notas;
        int[] notasArreglo = {22,14,16};
        //System.out.println(notasArreglo[1]);

        for (int x=0;x<notasArreglo.length;x++) {
            //System.out.println(notasArreglo[x]);
        }

        for (Integer obj: notasArreglo) {
            System.out.println(obj);
        }

    }
}
