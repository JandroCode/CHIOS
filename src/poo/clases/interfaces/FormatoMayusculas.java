package poo.clases.interfaces;

public class FormatoMayusculas implements FormatoImpresion{
    @Override
    public void imprimir(String mensaje) {
        System.out.println("Formato Mayúsculas: " + mensaje.toUpperCase());
    }
}
