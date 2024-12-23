public class Constantes {
    public static void main(String[] args) {

        // Diferencia entre constante y variable

        System.out.println("");

        final  double PI = 3.1416;
        double radio = 5.6;
        double area = PI * radio * radio;

        // System.out.println("El área del círculo cn radio " + radio + " es= " + area);

        // Modificamos el valor del radio
        radio = 7.4;

        System.out.println("El área del círculo cn radio " + radio + " es= " + area);

        // Error si intentamos cambiar PI
        // PI = 3.14; // Esto genera un error








    }
}