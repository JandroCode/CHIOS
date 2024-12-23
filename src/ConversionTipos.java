public class ConversionTipos {

    public static void main(String[] args) {

        // a) De variable por referencia a variable primitiva


        // De entero a String
        int numero = 10;
        String numeroString = String.valueOf(numero);
        System.out.println("El valor de número es:" + numeroString);

        // De String a entero
        String nombre = "Pepe";
        //int nombreEntero = Integer.parseInt(nombre); // Da error porque Java detecta caracteres


        // b) De primitivo a primitivo

        // De entero a double
        int num = 20;
        double numDecimal = num;
        System.out.println("El número decimal es:" + numDecimal);

        // De double a entero
        double numeroDecimal = 120.5;
        // int numeroEntero = numeroDecimal;  Da error

        // .. si fuerzo (conversión explícita)
        int numeroEntero = (int) numeroDecimal;
        System.out.println("El valor de numeroEntero es " + numeroEntero); // Le quita los decimales

        // De short a entero
        short edad = 34;
        int edadEntero = edad;   // No hay problema porque meto una caja pequeña(short) dentro de una más grande(int)

        System.out.println(edadEntero);

        int cantidad = 423234235;
        // short cantidadShort = cantidad; // Da error porque meto una caja grande (int) dentro de una más pequeña(short)

        // si fuerzo (conversión o casting explícito)
        Short cantidadShort = (short) cantidad;

        System.out.println("El dcantidad short vale:" + cantidadShort);


    }
}
