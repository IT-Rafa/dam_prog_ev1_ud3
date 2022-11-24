package es.itrafa.b5_runner_bucles_2.ejercicios.ej8;

import java.util.Scanner;

/**
 * Ejercicio 8
 * Se indica al método el número de líneas de la pirámide y se dibuja con asteriscos
 *
 * Resuelve el problema con  impresión de carácter en carácter y bucle anidado.
 * Sin usar variables de la clase String, StringBuilder, StringBuffer o similar.
 *
 * Por ejemplo:
 * Test 	                Resultado
 *
 * piramidePuntaAbajo(3);    *****
 *                            ***
 *                             *
 */
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();

        piramidePuntaAbajo(lines);
    }
    public static void piramidePuntaAbajo(int lines){
        for (int i = 0; i < lines; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(' ');
            }
            for(int j = lines - i -1; j > 0; j--){
                System.out.print('*');
            }
            for(int j = lines - i; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
