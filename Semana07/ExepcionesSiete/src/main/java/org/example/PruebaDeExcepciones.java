package org.example;

import java.io.IOException;

public class PruebaDeExcepciones {
    LeerTeclado kbd = new LeerTeclado(System.in);
    public void procesarEntradaUsuario() throws ExcepcionDeVocal,
            ExcepcionDeBlanco,
            ExcepcionDeSalida,ExcepcionDeNumero {
        System.out.println("Introduzca un caracter");
        System.out.flush();
        char ch;
            try {
                ch = Character.toUpperCase(kbd.getChar());
            } catch (IOException x) {
                System.out.println("SE ha producido una excepcion");
                return;
            }
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    throw new ExcepcionDeVocal();
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    throw new ExcepcionDeNumero();
                case ' ':
                    throw new ExcepcionDeBlanco();
                case 'X':
                    throw new ExcepcionDeSalida();
            } //Fin del switch
    } //Fin del metodo procesarUsuario

    public static void main(String args[]) {
        PruebaDeExcepciones miPrueba = new PruebaDeExcepciones();
        boolean fin = false;
            do {
                try {
                    miPrueba.procesarEntradaUsuario();
                } catch (ExcepcionDeVocal x) {
                    System.out.println("Se ha producido una excepcion de vocal");
                } catch (ExcepcionDeNumero x) {
                    System.out.println("Se ha producido una excepcion de numero");
                } catch (ExcepcionDeBlanco x) {
                    System.out.println("Se ha producido una excepcion de blanco");
                } catch (ExcepcionDeSalida x) {
                    System.out.println("Se ha producido una excepcion de salida");
                    fin = true;
                } finally {
                    System.out.println("Estamos en un finally");
                }
            } while(!fin);
    }
}
