package interfaces.impl;

import interfaces.Imprimir;

public class PdfImplementation implements Imprimir {

    @Override
    public void print(String formato) {
        System.out.println("Estoy imprimiento en formato " + formato);
    }
}
