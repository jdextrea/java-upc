package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class arreglosLista {
   public static  void main(String args[]) {
       List<String> objNombres = new ArrayList<>();
       objNombres.add("Juan");
       objNombres.add("Melissa");
       objNombres.add("Elena");

       //Iteracion el arraylist
       Iterator<String>objIterator = objNombres.iterator();

       for (String objN: objNombres) {

           System.out.println(objN);
       }

       while (objIterator.hasNext())  {
           System.out.println(objIterator.next());
       }

       List<String> objNombresLinked = new LinkedList<>();
       objNombresLinked.add("Juan");
       objNombresLinked.add("Melissa");
       objNombresLinked.add("Elena");

       System.out.println(objNombresLinked);

       //Usando SET
       Set<String> objNombresSet = new HashSet<String>();
       objNombresSet.add("Juan");
       objNombresSet.add("Melissa");
       objNombresSet.add("Elena");
       System.out.println(objNombresSet);


       //Crear un programa que permita una coleccion de objetos
       //Crear la clase persona
       Persona p1 = new Persona("Juan","Coronel",28);
       Persona p2 = new Persona("Melisa","Estrada",38);
       Persona p3 = new Persona("Maura","Gonzales",18);
       //Primera forma
       List<Persona> lista = Arrays.asList(p1,p2,p3);
       for (Persona objPer:lista) {
           System.out.println(objPer.getApellidos());
       }
       Persona[] arr = new Persona[2];
       arr[0] =  new Persona("Juan","Coronel",28);
       arr[1] = new Persona("Melisa","Estrada",38);
       arr[2] = new Persona("Maura","Gonzales",18);
      //  arr[0].getApellidos();
   }


}
