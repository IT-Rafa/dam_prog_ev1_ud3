package es.itrafa.b5_runner_bucles_2.ejercicios.ej7;


/**
 * Ejercicio 7
 * Pirámide con * con punta hacia arriba.
 * No olvides que se trata de imprimir secuencialmente asterisco a asterisco.
 * Si  ayudarte de String, StringBuider o similares.
 * <p>
 * Por ejemplo:
 * Entrada   	Resultado
 * (guiones bajos no aparecen)
 * 5_______________*
 * _______________***
 * ______________*****
 * _____________*******
 * ____________*********
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        for (int i = 0; i < base; i++) {
            for(int j = 0; j < base - i-1; j++){
                System.out.print(' ');
            }
            for(int j = 0; j < i+1; j++){
                System.out.print('*');
            }
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
