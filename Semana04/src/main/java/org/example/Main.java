package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Automovil auto1 = new Automovil("ABC123",2,"Negro",false,2020);
        Automovil auto2 = new Automovil("ABC246",2,"Negro",false,2020);
        Automovil auto3 = new Automovil("ABC135",2,"Negro",false,2020);

        List<Automovil> listaAutomoviles = new ArrayList<>();
//        List<Automovil> listaAutomoviles = Arrays.asList(auto1,auto2,auto3);

        listaAutomoviles.add(auto1);
        listaAutomoviles.add(auto2);
        listaAutomoviles.add(auto3);
        for  (Automovil a:listaAutomoviles) {
            System.out.println(a.getPlaca());
        }

        System.out.println(auto1.toString());


        Deportista dep = new Deportista("Pedro");
        Informatico inf = new Informatico("Maria");

        Persona objUno = new Deportista("Lucio");
        Persona objDos = new Informatico("Maria");
        Persona objTres = new Deportista("Carlos");
        Persona objCuatro = new Informatico("Pedro");
        Persona objCinco = new Deportista("Dora");
        Persona objSeis = new Informatico("Adela");
        List<Persona> listaPersonas = Arrays.asList(objUno,objDos,objTres,objCuatro,objCinco,objSeis);
        int contar = 0;
        int total = 0;
        int vcorrer=0;
        for (Persona p: listaPersonas) {
        //    System.out.println(p.correr());
            contar++;
            vcorrer = vcorrer + p.correr();
        }
        System.out.println(contar);
        System.out.println(vcorrer);


    }
}