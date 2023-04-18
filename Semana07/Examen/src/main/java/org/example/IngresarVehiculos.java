package org.example;

import java.util.Scanner;

public class IngresarVehiculos {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {

        String anio;
        String marca;
        String modelo;
        Double punitario;
            System.out.println("Ingresar anio");
            anio = scanner.nextLine();
            System.out.println("Ingresar marca");
            marca = scanner.nextLine();
            System.out.println("Ingresar modelo");
            modelo = scanner.nextLine();
            System.out.println("Ingresar precio Unitario");
            punitario = scanner.nextDouble();
                if (punitario<=0) {
                    throw new validarPrecio("Ingresar precio mayor");
                }
            System.out.println("Ingresar la tracción");
            //punitario = scanner.nextDouble();
        Vehiculo v1 = new Sedan(anio,marca,modelo,punitario,false);
        System.out.println(v1.toString());
    }
}
