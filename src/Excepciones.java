public class Excepciones {


    public static void main(String[] args) {

        // Si no manejo la excepción el  "Hola mundo!" no lo imprime

        /*

            System.out.println(4/0);
            System.out.println("Hola mundo!");

         */


        // Ahora vamos a hacerlo manejandola excepción

        try{
            System.out.println(4/0);
        }catch (Exception e){
            System.out.println("Error en la divisón por 0 " + e.getMessage());


        }

        System.out.println("Hola mundo!");





    }
}
