public class Mathematicas {


    public static void main(String[] args) {

        // Calcular raíces cuadradas
        double raiz =  Math.sqrt(9);
        System.out.println("La raíz de 9 es " + raiz);

        //  ... si quiero devolver un valor entero
        int raizEntero = (int) Math.sqrt(9);
        System.out.println("La raíz de 9 es " + raizEntero);

        // Calcular potencias
        double potencia = Math.pow(5,3);
        System.out.println("El resultado de la potencia es: " + potencia);

        // Redondear números (El redondeo lo hace en función de a que entero se aproximen)
        System.out.println(Math.round(5.1423423));
        System.out.println(Math.round(5.9423423));

        // Calcular número aleatorios
        System.out.println(Math.random());  // Número decimal del 0 al 1
        System.out.println(Math.random()*10); // Número decimal del 0 al 10
        System.out.println((int)(Math.random()*100)); // Números enteros del 0 al 100
        System.out.println((int)(Math.random()*100+1)); // Números enteros del 0 al 100



    }
}
