package es.itrafa.b3.prog_ev1_u3_b3_e6;
/*
    Ejercicio U3_B3_6.
    Usando while, escribe un programa que va leyendo palabras
    hasta que introducimos la palabra “fin”. Al acabar de introducir palabras las imprime
    todas.
    E:\Programacion>java Unidad3
    Palabra:
    hola
    Palabra:
    adios
    Palabra:
    chao
    Palabra:
    fin
    lista de palabras introducidas: hola adios chao
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabras = "";

        while (!palabras.endsWith("fin")) {
            System.out.print("Palabra: ");
            palabras += " " + sc.nextLine();
        }

        System.out.println("lista de palabras introducidas:" + palabras);
    }
}