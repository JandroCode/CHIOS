package enums;

public enum Planeta {
    MERCURIO(3.3e23, 2.4e6),
    VENUS(4.87e24, 6.1e6),
    TIERRA(5.97e24, 6.4e6),
    MARTE(6.42e23, 3.4e6);

    private final double masa;   // en kilogramos
    private final double radio; // en metros

    // Constructor
    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    // Métodos
    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularGravedad() {
        double G = 6.67430e-11; // Constante gravitacional
        return G * masa / (radio * radio);
    }
}
