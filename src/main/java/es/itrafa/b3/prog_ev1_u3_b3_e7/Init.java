package es.itrafa.b3.prog_ev1_u3_b3_e7;
/*
    Ejercicio U3_B3_7.
    Se introducen por teclado una serie de palabras y al terminar de
    teclear se indica al usuario la cantidad de palabras introducidas. Se indica el fin del
    tecleo con enter+ ctrl-z (en windows, en linux es enter +
    ctrl-d). Por lo tanto, el usuario puede teclear un número indeterminado de palabras.
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Introduce palabras (ctrl + z en Windows) o (ctrl + d en linux e IDE)");

        while( sc.hasNext()){
            sc.next();
            count++;
        }
        System.out.println("Se escribieron "+ count + " palabras");
    }
}