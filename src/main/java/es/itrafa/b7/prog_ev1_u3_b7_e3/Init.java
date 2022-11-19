package es.itrafa.b7.prog_ev1_u3_b7_e3;
/*
    Ejercicio U3_B7_E3. Calcular el factorial de un número con bucle.
    Recuerda la definición de factorial para un número n:

    Si n = 0 entonces
    0! = 1
    si n>0 entonces
    n! = n * (n–1) * (n–2) * ... * 3 * 2 * 1

    Tu programa tendrá el siguiente aspecto
    Teclea número entero para calcular factorial:
    4
    Su factorial es 24
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Teclea número entero positivo para calcular factorial");
        int n = teclado.nextInt();
        System.out.println("Su factorial es: " + factorial(n));
    }

    private static int factorial(int n) {
        int fact = 1;
        while(n > 1){
            fact *= n;
            n--;
        }
        return fact;
    }
}