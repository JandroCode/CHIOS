package poo.clases.herencia;

public class Alumno extends Persona{

    private double notaMates;
    private double notaLengua;
    private double notaDibujo;

    public Alumno(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
    }


    public double getNotaMates() {
        return notaMates;
    }

    public void setNotaMates(double notaMates) {
        this.notaMates = notaMates;
    }

    public double getNotaDibujo() {
        return notaDibujo;
    }

    public void setNotaDibujo(double notaDibujo) {
        this.notaDibujo = notaDibujo;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }
}
