package Ej_arrays;

import java.util.Scanner;

public class Ejemplo3_array {

    public static char letraDNI(int dni){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'L', 'C', 'K', 'E'};

        int res = dni % 23;
        char letra = letras[res];
        return letra;
    }

    public static void main(String[] args) {
        int dni;
        char letra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un DNI");
        dni = entrada.nextInt();
        letra = letraDNI(dni);
        System.out.println(letra);
    }
}
