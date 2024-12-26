package poo.clases.interfaces;

public class Main {

    public static void main(String[] args) {

        // Creación de diferentes formatos de impresión
        FormatoImpresion simple = new FormatoSimple();
        FormatoImpresion mayusculas = new FormatoMayusculas();
        FormatoImpresion decorado = new FormatoDecorado();

        // Crear impresoras con distintos formatos
        Impresora impresoraSimple = new Impresora(simple);
        Impresora impresoraMayusculas = new Impresora(mayusculas);
        Impresora impresoraDecorda = new Impresora(decorado);

        // Imprimir mensajes en diferentes formatos
        impresoraSimple.imprimirMensaje("Hola Mundo");
        impresoraMayusculas.imprimirMensaje("Hola Mundo");
        impresoraDecorda.imprimirMensaje("Homa Mundo");








    }
}
