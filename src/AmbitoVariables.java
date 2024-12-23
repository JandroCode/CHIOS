public class AmbitoVariables {

    public static void main(String[] args) {

        // Cada vez que se crea una llave de apertura y de cierre se genera un contexto

        int numeroUno = 100;



        if (numeroUno >= 100) {
            int numeroDos = 90;
            System.out.println(numeroUno);  // Si puedo acceder a la variable porque esta variable está dentro del primer contexto de llaves
        }

        if(numeroUno >= 100){
            int numeroTres = 56;
            System.out.println(numeroUno);
            //System.out.println(numeroDos); // No puedo acceder, estoy fuera del contexto
        }

        System.out.println(numeroUno); // No hay problemas porque estoy dentro de las llaves del main

        //System.out.println(numeroDos); // No puedo acceder a esta variable  porque estoy fuera de ese contexto
        //System.out.println(numeroTres); // No puedo acceder a esta variable  porque estoy fuera de ese contexto


    }
}
