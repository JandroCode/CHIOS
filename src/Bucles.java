public class Bucles {

    public static void main(String[] args) {

        // Estructuras de control de flujo - bucles

        // a) While

        System.out.print("Bucle while: ");

        int num = 1;
        while (num <= 10){
            System.out.print(num+" ");
            num++;
        }

        System.out.println("");

        // b) Do - While

        System.out.print("Bucle do - while: ");
        int numero = 101;

        do {
            System.out.print(numero+" ");
            numero++;
        }while (numero <= 10);

        System.out.println("");

        System.out.print("Bucle for: ");

        // c) for
        for(int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println("");

        // Puedo ir de arriba a abajo
        for(int i=10; i>=1; i--){
            System.out.print(i+" ");
        }








    }
}
