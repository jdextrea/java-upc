package org.example;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Vehiculo s1 = new Sedan()
Vehiculo v1 = new Sedan("2022","","R8",16.400,false);
Vehiculo v2 = new Sedan("2022","vmw","AlpinaR8",13.900,false);
Vehiculo v3 = new Suv("2022","Oudi","Q8",12.280,true);
Vehiculo v4 = new Suv("2022","Oudi","X5M",10.590,true);

        List<Vehiculo> listaVehSedan  = new ArrayList<Vehiculo>();
        listaVehSedan.add(v1);
        listaVehSedan.add(v2);
        List<Vehiculo> listaVehSuv  = new ArrayList<Vehiculo>();
        listaVehSuv.add(v3);
        listaVehSuv.add(v3);
        for (Vehiculo lvs : listaVehSedan ) {
            System.out.println(lvs.toString());
        }

    }
}