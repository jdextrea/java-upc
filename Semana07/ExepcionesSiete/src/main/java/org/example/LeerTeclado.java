package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class LeerTeclado {
    //Atributo
    private Reader stream;

    //Constructor
    public LeerTeclado(InputStream fuente) {
        stream = new InputStreamReader(fuente);

    }
    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
}
