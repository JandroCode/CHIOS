package poo.clases;

public class Coche {

    // Poner ejempplo de concesionario con los coches
    // los coches tienen una serie de característics en común (atributos) : ruedas, puertas, volante y una serie de comportamientos (métodos)


    // Modificador de acceso 'package' similar a 'protected' no puedo crear objetos desde el main
    /*
    *
    *     String marca;
          String modelo;
          int velocidad;
    * */


    // Con el modificador de acceso 'public' ya puedo acceder a estos atributos desde el main para crear objetos
    public String marca;
    public String modelo;
    public int velocidad;

    public double precioDelSeguro;
    public int edad;


    // Métodos ===================================================================================================

    public void acelerar(){
        System.out.println("Acelerando ...");
    }

    public void ferenar(){
        System.out.println("Frenando ...");
    }

    // Precio del seguro parametrizad por el color del coche
    public double calculoPrecioDelSeguro(String color){
        if(color.equals("Rojo")){
            this.precioDelSeguro = 600;
        }else{
            this.precioDelSeguro = 450;
        }

        return this.precioDelSeguro;

    }

    // Incluyendo un parámetro más (edad)
    public double calculoPrecioDelSeguroConDosParametros(String color , int edad){
        if(color.equals("Rojo")){
            this.precioDelSeguro = 600;
        }else{
            this.precioDelSeguro = 450;
        }

        if(edad >= 18 && edad <= 21){
            this.precioDelSeguro = this.precioDelSeguro + 300;
        }

        return this.precioDelSeguro;

    }


}
