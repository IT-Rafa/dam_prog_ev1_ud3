package es.itrafa.b5_runner_bucles_1.ejercicios.ej1;

/**
 * Ejercicio 1
 * Se pide simplemente sumar n números.
 *
 * ENTRADA:
 * Comienza con un valor para n, donde n es la cantidad de números a sumar. Se garantiza que n>0.
 * A continuación viene  una lista de los n números a sumar
 *
 * SALIDA:
 * La suma de los n números.
 *
 * COMENTARIOS:
 * Fíjate que en este estilo de problemas, a veces, como en este caso, los ejemplos de entrada salida realmente
 * completan el enunciado porque observo en ellos como me van a mandar los datos. En este caso me fijo que en una
 * línea me mandan n y a continuación en otra línea la lista de enteros separados por un espacio en blanco
 * Se puede leer la entrada basándose en líneas, pero con lo que sabemos por el momento de java, lo fácil es usar
 * nextInt() y pasar de la estructura de líneas. Simplemente, necesito hacer n+1 lecturas con nextInt().
 * Simplemente, nos basamos en un bucle que hace n lecturas y lógicamente previamente haré una lectura para saber
 * el valor de n.
 *
 * Por ejemplo:
 *  Entrada 	        Resultado
 *  3
 *  1 2 3               6
 *
 *  1
 *  15                  15
 *
 *  4
 *  1 1 1 0             3
 */

import java.util.Scanner;
public class Prog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int cant = sc.nextInt();
        for (int i = 0; i< cant; i++){
            result += sc.nextInt();
        }
        System.out.println(result);
    }
}

