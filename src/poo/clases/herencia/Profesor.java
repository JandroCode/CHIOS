package poo.clases.herencia;

public class Profesor extends Persona{
    private String asignatura;


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellidos, int edad, String asignatura) {
        super(nombre, apellidos, edad);

        this.asignatura = asignatura;
    }

}
