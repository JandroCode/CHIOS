public class Metodos {

    // Métodos sin retorno

    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        metodos.suma();
        System.out.println("El resultado de la resta: "+metodos.resta());
        metodos.multiplicacion(5,6);
        System.out.println("El resultado de la división es " + metodos.division(10,5));

    }

    // Sin parámetros y sin retorno
    public void suma(){
        int resultado = 5+6;
        System.out.println("El resultado de la suma: " + resultado);
    }

    // Sin parámetros y con retorno
    public int resta(){
        int resta = 210 -10;
        return resta;
    }

    // Con parámetros y sin retorno
    public void multiplicacion(int num1, int num2){
        int resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    // Con parámetros y con retorno
    public int division(int num1, int num2){
        int resultado = num1 / num2;
        return resultado;
    }




}
