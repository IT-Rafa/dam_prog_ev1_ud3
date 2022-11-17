package es.itrafa.b1.prog_ev1_u3_b1_e2;
/*
    Ejercicio U3_B1_E2
    Modifica el ejercicio anterior
    de forma que también ocurra que cuando x no valga 10 se
    imprime el mensaje “x NO vale 10” y el resultado de la operación x-y. Ejemplo:
    Teclea número X:
    4
    Teclea número Y:
    5
    x NO vale 10
    x - y vale:-1
    y si es vale 10 igual que en ejercicio anterior
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Teclea número entero x: ");
        x = entrada.nextInt();
        System.out.print("Teclea número entero y: ");
        y = entrada.nextInt();

        if (x == 10) {
            System.out.println("x vale " + x);
            System.out.println("x + y vale: " + (x + y));
        } else {
            System.out.println("x NO vale 10");
            System.out.println("x - y vale: " + (x - y));
        }
    }
}