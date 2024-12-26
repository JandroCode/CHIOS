package ColeccionesYMapas;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        // Colecciones ==============================================

        // ArrayList (Sirve para almacenar un conjunto de valores de manera dinámica - diferencia con los arrays,
        // permite elementos duplicados - diferencia con los Set)

        // Alias de los genéricos ( K -> Key , V -> Value , T -> Tipo , E -> Elemento)


        // Colección de datos dinámicos de tipo cadena de texto
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos al arrayList
        nombres.add("Ana");
        nombres.add("Luisa");


        /*

        for(String i: nombres){
            System.out.println(i);
        }

        */

        // El ArrayList es dinámico, puedo seguir añadiendo elementos:
        nombres.add("Juan");

        // Eliminar elementos del arrayList
        nombres.remove(2);

        /*
        nombres.forEach( i  -> {
            System.out.println(i);
        });

         */

        // Colección de datos dinámicos de tipo entero
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        // Elimno el primer elemento del arrayList
        numeros.remove(0);

        /*
        numeros.forEach(i -> {
            System.out.println(i);
        });

         */


        // Colecciones de datos de un tipo generaado por mi

        ArrayList<Persona> personas =  new ArrayList<>();
        personas.add(new Persona("Juan", "juan@es.es"));
        personas.add(new Persona("Lucía" , "lucia@es.es"));

        /*
        personas.forEach( persona -> {
            System.out.println(persona.getNombre() + " " + persona.getEmail());
        });

         */

        // Declaración del arrayList pero a través de la interfaz (Polimorfismo)

        List<String> direcciones = new ArrayList<>();

        // El Set es una colección dinámica de elementos que no se repiten

        //HashSet<String> roles = new HashSet<>();
        //Set<String> roles = new HashSet<>();             // Set de roles  (No permite elementos duplicados)

        ArrayList<String> roles = new ArrayList<>();         // ArrayList de roles  (Permite elementos duplicados)

        roles.add("ADMIN");
        roles.add("USER");
        roles.add("ADMIN");

        // Aunque tenga tres elementos agregados solo imprime 2

        /*
        roles.forEach(rol -> {
            System.out.println(rol);
        });

         */

        // Mapas ===============================================================

        // Son diccionarios de pares clave - valor

        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Juan", "5654KTR");
        mapa.put("Marta" , "6654LST");

        System.out.println(mapa.get("Juan"));
        System.out.println(mapa.get("Marta"));

    }
}
