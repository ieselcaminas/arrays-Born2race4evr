package Ej_arrays;

public class Ejemplo6_array {
    public static int minimo(int[] numeros){

        int minimo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 6};

        int minimo = minimo(numeros);
        System.out.println(minimo);
    }
}
