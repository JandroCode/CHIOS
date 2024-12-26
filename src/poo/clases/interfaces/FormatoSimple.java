package poo.clases.interfaces;

public class FormatoSimple implements FormatoImpresion{
    @Override
    public void imprimir(String mensaje) {
        System.out.println("Formato simple:" + mensaje);
    }
}
