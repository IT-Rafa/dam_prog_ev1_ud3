package es.itrafa.b5_runner_bucles_2.ejercicios.ej4;

/**
 * Ejercicio 4
 * Se introducen por teclado una serie de palabras y al terminar de
 * teclear se indica al usuario la cantidad de palabras introducidas.
 * Observa que como no se indica cuando acaban los casos de prueba,
 * se asume que es cuando se encuentra la marca de fin de fichero
 *
 *
 * Por ejemplo:
 * Entrada              	        Resultado
 *
 * hola que tal estais todos        5
 * a mi plín que soy de Lalín       7
 * c   i
 *    n    c
 * o                                5
 *
 */
import java.util.Scanner;
public class Prog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while( sc.hasNext()){
            sc.next();
            count++;
        }
        System.out.println(count);
    }
}
