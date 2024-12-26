package poo.clases.interfaces;

public class Impresora {

    private FormatoImpresion formatoImpresion;

    public Impresora(FormatoImpresion formatoImpresion){
        this.formatoImpresion = formatoImpresion;
    }

    public void imprimirMensaje(String mensaje){
        formatoImpresion.imprimir(mensaje);
    }
}
