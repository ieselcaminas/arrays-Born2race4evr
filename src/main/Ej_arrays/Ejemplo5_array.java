package Ej_arrays;

public class Ejemplo5_array {
    public static int mayor(int[] numeros){

        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 6};

        int mayor = mayor(numeros);
        System.out.println(mayor);
    }
}
