public class Arrays {

    public static void main(String[] args) {

        // Sirven para almacenar varios datos del mismo tipo
        int[] numeros = {1,23,2,78};

        // Posiciones         0        1            2
        String[] nombres = {"Ana" , "Miguel" , "Alberto"};

        System.out.println("El primer elemento del array es: " + nombres[0]);
        System.out.println("El segundo elemento del array es: " + nombres[1]);

        int[] valores = new int[3];

        valores[0] = 1;
        valores[1] = 13;
        valores[2] = 234;

        System.out.println("primer elemento: " + valores[0] );

        System.out.println("Elementos del array 'valores'");

        /*

        for(int i=0;i< valores.length; i++){
            System.out.print(valores[i] + " ");
        }
         */

        for(int i : valores){
            System.out.println(i);
        }

    }
}
