package es.itrafa.b5_runner_bucles_2.ejercicios.ej6;

/**
 * Consigue triángulos con la punta hacia abajo.
 * Observa la estructura del triángulo en los ejemplos.
 * Fíjate que la base es la primera línea y cada línea tiene un
 * asterisco menos que la anterior.
 * Por teclado simplemente se teclea un número entero que indica el
 * número de asteriscos de la base y la salida es el triángulo
 * correspondiente
 * <p>
 * Por ejemplo:
 * Entrada 	Resultado
 * 1________*
 *
 * 2________**
 *  _________*
 *
 * 3________**
 *  _________*
 *  _________*
 */
import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        for (int i = 0; i < base; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(' ');
            }
            for (int j = 0; j < base -i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
