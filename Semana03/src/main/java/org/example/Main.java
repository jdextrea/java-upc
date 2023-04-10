package org.example;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        Auto objAuto = new Auto("Placa","Marca","Modelo","Maletera","Parabrisa","Plumilla");
        objAuto.correr();
        Auto objAuto2 = new Auto("P01","Hyundai","Hashback","si","doble","si");
        objAuto2.correr();
    }
}