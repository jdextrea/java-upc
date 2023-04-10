package org.example;

public class mensajeImpl implements Mensaje{
    @Override
    public void saludar(String msg) {
        System.out.println(msg);
    }

    @Override
    public int sumar(int n1, int n2) {
        return 0;
    }
}
