package matrices;

public class Main {

    public static void main(String[] args) {

        // Matrices bidimensionales

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) { // Filas
            for (int j = 0; j < matriz[i].length; j++) { // Columnas
                System.out.println("Elemento en [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

    }
}
