package es.itrafa.b5_runner_bucles_1.ejercicios.ej2;

/**
 * Similar a la anterior, pero ahora mi programa tiene que ser capaz de
 * responder a múltiples envíos.
 * De nuevo, si el enunciado no nos explica con detalle como es la entrada
 * y la salida me tengo que basar en los ejemplos de entrada/salida.
 * En este caso observo que me pueden enviar muchas tandas de números para sumar.
 *
 * Cada tanda está compuesta por dos líneas: la primera línea indica el número de
 * números a sumar n y en la segunda vienen los números que hay que sumar.
 * De esta manera, con lo que sabemos hasta ahora una buena solución es de nuevo
 * con nexInt() pero además ahora debo utilizar un  bucle anidado para permitir así
 * multiples tandas. También observo que cuando n vale 0, entonces se acaba la serie
 * de tandas.
 * Si el enunciado hiciera muchas descripciones, entonces hay que leerlas con atención
 * pues puede describir detalles que no se aprecian en los ejemplos de entrada salida
 * y que hay que tener en cuenta en la solución pues nos pueden enviar datos de prueba
 * diferentes a los de los ejemplos.
 *
 */
import java.util.Scanner;

public class Prog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            op = sc.nextInt();
            int suma = 0;
            for(int i = 0; i < op; i++){
                suma += sc.nextInt();
                if(i == op-1){
                    System.out.println(suma);
                }
            }
        }while (op != 0);
    }
}