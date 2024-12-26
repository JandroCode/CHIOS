package poo.clases.constructores;

public class Main {

    public static void main(String[] args) {

        // Ejemplo para la explicación del constructor  (explicación de sobrecarga)

        // Constructor por defecto (sin parámetros)
        Vivienda vivienda1 = new Vivienda();


        // Invocando al constructor que tiene un parámetro
        Vivienda vivienda2 = new Vivienda("Avenida de Lugo nº2");

        // Invocando al constructor que tiene dos parámetros
        Vivienda vivienda3 = new Vivienda("Avenida de Lugo nº2", 4);


    }
}
