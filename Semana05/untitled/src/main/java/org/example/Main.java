package org.example;

public class Main {
    public static void main(String[] args) {
        Banco objBanco  = new Banco("BCP");
        Banco objBanco2  = new Banco("BBVA");
        Empleado objEmp = new Empleado("Melissa");

        System.out.println(objEmp.getNombreEmpleado() + "trabaja en " + objBanco.getNombreBanco());



    }
}