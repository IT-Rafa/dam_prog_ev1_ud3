package es.itrafa.b1.prog_ev1_u3_b1_e1;
/*
    Ejercicio U3_B1_E1
    Modifica el ejemplo anterior de forma que exista una nueva variable
    int y;
    su valor también se pide por teclado y ocurre:
    Cuando x vale 10, se imprime (en instrucciones println() diferentes ):
    ● “x vale 10”
    ● el resultado de la suma x+y

    Ejemplo:
    Teclea número X:
    10
    Teclea número Y:
    5
    x vale 10
    x +y vale:15

    cuando x no valga 10 se imprime el mensaje “x NO vale 10”

    Ejemplo:
    Teclea número X:
    4
    Teclea número Y:
    6
    x NO vale 10
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
        }
    }
}