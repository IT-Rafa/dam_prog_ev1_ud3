package es.itrafa.b5_runner_bucles_2.ejercicios.ej1;

/**
 * Ejercicio 1
 * Escribe un programa que pida al usuario un número entre 0 y 9 y
 * muestre su tabla de multiplicar según el formato mostrado en los
 * ejemplos.
 * <p>
 * Por ejemplo:
 * Entrada 	Resultado
 * <p>
 * 3        3 x 0 = 0
 * 3 x 1 = 3
 * 3 x 2 = 6
 * 3 x 3 = 9
 * 3 x 4 = 12
 * 3 x 5 = 15
 * 3 x 6 = 18
 * 3 x 7 = 21
 * 3 x 8 = 24
 * 3 x 9 = 27
 * 3 x 10 = 30
 * <p>
 * 25       Número no válido
 */


public class Prog{
    public static void main(String[] args){
        System.out.println("************************");
        System.out.println("* TABLAS DE MULTIPLICAR *");
        System.out.println("************************");
        System.out.println();

        for(int i = 0; i <= 10;i++){
            System.out.println("-------------- ");
            System.out.println(" TABLA DEL "+ i + " ");
            System.out.println("-------------- ");
            for(int j=0; j <= 10; j++){
                System.out.println(" " + i + " x " + j + " = " + (i*j));
            }
        }
    }
}