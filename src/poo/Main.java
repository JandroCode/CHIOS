package poo;

import poo.clases.Coche;
import poo.clases.Empleado;
import poo.clases.constructores.Vivienda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Coche ferrari = new Coche();
        Coche porsche = new Coche();
        Coche seat = new Coche();

        Empleado juan = new Empleado();
        Empleado lucas = new Empleado();
        Empleado ana = new Empleado();

        // Creación de los valores para los atributos
        ferrari.marca = "ferrari";
        ferrari.modelo = "308";
        ferrari.velocidad = 330;

        porsche.marca = "porsche";
        porsche.modelo = "911";
        porsche.velocidad = 310;

        juan.nombre = "Juan";
        juan.edad = 23;
        juan.apellidos = "López Suárez";


        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione coche");
        System.out.println("1.Ferrari");
        System.out.println("2.Porsche");

        int opcion = sc.nextInt();

        if(opcion == 1){
            System.out.println("MARCA : " + ferrari.marca);
            System.out.println("MODELO : " + ferrari.modelo);
            System.out.println("VELOCIDAD : " + ferrari.velocidad);
        }else {
            System.out.println("MARCA : " +  porsche.marca);
            System.out.println("MODELO : " + porsche.modelo);
            System.out.println("VELOCIDAD : " + porsche.velocidad);
        }


        System.out.println("Precio del seguro " + ferrari.calculoPrecioDelSeguro("Rojo")); // Más caro
        System.out.println("Precio del seguro " + ferrari.calculoPrecioDelSeguro("Amarillo"));

        System.out.println("El precio del seguro es " + ferrari.calculoPrecioDelSeguroConDosParametros("Rojo" , 20));
        System.out.println("El precio del seguro es " + ferrari.calculoPrecioDelSeguroConDosParametros("Rojo" , 34));
        System.out.println("El precio del seguro es " + ferrari.calculoPrecioDelSeguroConDosParametros("Amarillo" , 34));




    }
}
