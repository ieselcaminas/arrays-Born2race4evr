package Ej_arrays;

public class Ejemplo8_array {
    public static double positivos(int[] positivos){
        int suma_p = 0;
        for (int i = 0; i < positivos.length; i++) {
            if (positivos[i] >= 0) {
                suma_p += positivos[i];
            }
        }
        return suma_p;
    }
    public static double negativos(int[] negativos){
        int suma_n = 0;
        for (int i = 0; i < negativos.length; i++) {
            if (negativos[i] < 0) {
                suma_n += negativos[i];

            }
        }
        return suma_n;
    }
    public static void main(String[] args) {
        int[] numeros = {2, 2, 2, 2, -4, 2, 2, 2, 2, -1};
        double suma_p;
        double suma_n;

        suma_p = positivos(numeros);
        System.out.println(suma_p);

        suma_n = negativos(numeros);
        System.out.println(suma_n);
    }
}