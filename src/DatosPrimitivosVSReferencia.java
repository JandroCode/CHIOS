public class DatosPrimitivosVSReferencia {


    public static void main(String[] args) {

        // Datos de tipo entero ======================================

        // Datos primitivo
        int numero = 9;
        short edad = 21;
        long cuenta = 3423423423423423423L;
        double decimal = 56.93;
        // Dato por referencia
        Integer numeroInteger = 23;
        Short edadShort = 45;
        Long cuentaLong = 342342342L;
        Double decimalDouble = 231.21;

        // Cuales la diferencia ? (primitivos solo almacenan valores y por referencia son objetos, tienen métodos)

        // Método para saber que número entero es el mayor
        int numeroMayor = Integer.max(15,7);
        int compracion = Integer.compare(5,5);

        if(compracion == 0){
            System.out.println("Los números son iguales");
        }else{
            System.out.println("Los números son diferentes");
        }
        System.out.println("El número mayor es: " + numeroMayor);



        // Excepción "String"











    }

}
