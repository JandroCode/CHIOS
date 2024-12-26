package poo.clases.interfaces;

public class FormatoDecorado implements  FormatoImpresion{
    @Override
    public void imprimir(String mensaje) {
        System.out.println("*** " + mensaje + " ***");
    }
}
