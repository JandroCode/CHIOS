package enums;

public class Main {

    public static void main(String[] args) {

        // Estado ==========================================================

        System.out.println("");

        System.out.println("El estado está en " + Estado.INICIADO);
        System.out.println("El estado está en " + Estado.EN_PROGRESO);
        System.out.println("El estado está en " + Estado.COMPLETADO);


        System.out.println("------------------------------------------");
        // Planeta ===========================================================

        System.out.println("");

        for (Planeta planeta : Planeta.values()) {
            System.out.println("Planeta: " + planeta);
            System.out.println("Masa: " + planeta.getMasa() + " kg");
            System.out.println("Radio: " + planeta.getRadio() + " m");
            System.out.println("Gravedad: " + planeta.calcularGravedad() + " m/s²");
            System.out.println();
        }

    }
}
