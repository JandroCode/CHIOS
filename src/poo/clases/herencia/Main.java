package poo.clases.herencia;

public class Main {

    public static void main(String[] args) {


        Alumno alumno1 = new Alumno("Pepe" , "Sánchez" , 34);

        // Puedo acceder a los setters de la clase padre
        alumno1.setNombre("Juan");
        alumno1.setApellidos("López Gómez");
        alumno1.setEdad(15);

        // Y puedo acceder a los atrubutos propios de la clase
        alumno1.setNotaMates(6.7);
        alumno1.setNotaLengua(7.9);
        alumno1.setNotaDibujo(10.0);

        System.out.println("");

        System.out.println("Almuno 1");
        System.out.println("-------------------------");
        System.out.println("Nombre:" +  alumno1.getNombre());
        System.out.println("Apellidos:" +  alumno1.getApellidos());
        System.out.println("Edad:" +  alumno1.getEdad());

        System.out.println("Nota de matemáticas:" +  alumno1.getNotaMates());
        System.out.println("Nota de lengua:" +  alumno1.getNotaLengua());
        System.out.println("Nota dibujo:" +  alumno1.getNotaDibujo());


        // Creación de objtetos de tipo profesor

        System.out.println("");

        Profesor profesor1 = new Profesor("Eva" , "Gómez" , 34, "Matemáticas");

        profesor1.setNombre("Lucas");
        profesor1.setApellidos("Gómez Garrido");
        profesor1.setEdad(45);
        profesor1.setAsignatura("Dibujo");

        System.out.println("Profesor " + profesor1.getNombre() +" " + profesor1.getApellidos());
        System.out.println("Edad " + profesor1.getEdad());
        System.out.println("Asignatura " + profesor1.getAsignatura());









    }
}
