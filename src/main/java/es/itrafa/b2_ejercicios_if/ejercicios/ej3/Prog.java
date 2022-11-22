package es.itrafa.b2_ejercicios_if.ejercicios.ej3;

import java.util.Scanner;

/**
 * Haz un programa que acepte 3 números enteros introducidos por el usuario y:
 * • muestre el mensaje “3 iguales” si los tres números son iguales
 * • muestre el mayor de los 3 en caso de que no sean iguales
 * Por ejemplo:
 * Entrada
 * Resultado
 * 1 9 18
 * 18
 * -5 -5 -5
 * 3 iguales
 */
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if ((n1 == n2) && (n2 == n3)) {
            System.out.println("3 iguales");
        } else {
            int mayor
                    = n1;
            if (n2 > mayor) {
                mayor = n2;
            }
            if (n3 > mayor) {
                mayor = n3;
            }
            System.out.println(mayor);
        }
    }
}

