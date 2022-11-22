package es.itrafa.b2_ejercicios_if.ejercicios.ej2;

/**
 * Ejercicio 2
 * Haz un programa que solicite al usuario la entrada de un número entero y diga si es par o impar. El programa
 * mostrará alguno de los siguientes mensajes:
 * • 0 es un número par, si el valor introducido es 0
 * • <valor introducido> es un número par, si el valor introducido es par
 * • <valor introducido> es un número impar, si el valor introducido es impar
 * PISTAS:
 * • Un número es par si el resto de la división entera entre 2 es 0Anímat
 * Anímate a utilizar el operador condicional en tu solución
 */
import java.util.Scanner;
public class Prog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println((n % 2 == 0)? n + " es un número par":n + " es un número impar");

    }
}
