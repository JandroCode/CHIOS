package poo.clases.constructores;

public class Vivienda {

    private String direccion;
    private int metrosCuadrados;
    private int numHabitaciones;
    private int precioAlquiler;

    // Este es el contrsutor por defecto, se crea automáticamente, no hace fatal ponerlo explícito
    public Vivienda(){}


    // Constructor con un campo ( para dar un estado inicial al piso con la dirección)
    public Vivienda(String direccion){
        this.direccion = direccion;
    }

    public Vivienda(String direccion, int numHabitaciones){
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;

    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
}
