package es.itrafa.b5_runner_bucles_2.ejercicios.ej2;

/**
 * Ejercicio 2
 * Haz un programa que muestre las tablas de multiplicar de 0 a 10. Su salida será:
 * ************************
 * * TABLAS DE MULTIPLICAR *
 * ************************
 *
 * --------------
 *  TABLA DEL 0
 * --------------
 *  0 x 0 = 0
 *  0 x 1 = 0
 *  ...
 * --------------
 *  TABLA DEL 10
 * --------------
 *  10 x 0 = 0
 *  10 x 1 = 10
 *  ...
 *  10 x 10 = 100
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