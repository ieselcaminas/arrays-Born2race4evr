package Ej_arrays;

public class Ejemplo9_array {

    public static int pares(int[] num_par){
        int total_pares = 0;
        for (int i = 0; i < num_par.length; i++) {
            if (num_par[i] % 2 == 0){
                total_pares++;
            }
        }
        return total_pares;
    }
    public static int impares(int[] num_impar){
        int total_impares = 0;
        for (int i = 0; i < num_impar.length; i++){
            if (num_impar[i] % 2 != 0){
                total_impares++;
            }
        }
        return total_impares;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 2, 3, 2, 2, 3, 2, 2};
        double total_pares;
        double total_impares;
        total_pares = pares(numeros);
        total_impares = impares(numeros);

        System.out.println(total_pares);
        System.out.println(total_impares);


    }
}
