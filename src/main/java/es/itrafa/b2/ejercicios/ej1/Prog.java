package es.itrafa.b2.ejercicios.ej1;
/**
 * Ejercicio 1
 * Diseña un programa que pida dos números enteros por teclado, determine si el primero es múltiplo del segundo y
 * muestre el resultado de la siguiente forma:
 * • <num1> es múltiplo de <num2>, en caso de que sea múltiplo
 * • <num1> no es múltiplo de <num2>, en caso de que no lo sea
 *
 * Por ejemplo:
 * Entrada
 * Resultado
 * 8 2
 * 8 es múltiplo de 2
 * 5 3
 * 5 no es múltiplo de 3
 */

import java.util.Scanner;

public class Prog{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 % num2 == 0){
            System.out.println(num1 + " es múltiplo de " + num2);
        }else{
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}