package es.itrafa.b5.prog_ev1_u3_b5_e7;
/*
    Ejercicio U3_B5_7:
    imprimir todos los números naturales que hay desde la unidad
    hasta un número introducido por teclado.
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indicar número final: ");
        int numEnd = sc.nextInt();
        for(int i = 1; i <= numEnd; i++){
            System.out.print(i + " ");
        }
    }
}