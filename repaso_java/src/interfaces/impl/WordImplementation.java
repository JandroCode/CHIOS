package interfaces.impl;

import interfaces.Imprimir;

public class WordImplementation implements Imprimir {

    @Override
    public void print(String formato) {
        System.out.println("Estoy imprimiendo en formato "+  formato);
    }
}
