package es.itrafa.b5.prog_ev1_u3_b5_e13;
/*
    Ejercicio U3_B5_13:
    Mejorar el ejercicio: Ejercicio U2_B11_E2 de “cara o cruz” de
    forma que pueda repetir tiradas hasta que se canse el usuario

    run:
    ¿Cara o Cruz?
    Cara
    ACIERTO
    ¿otra tirada (sí/no)?
    sí
    ¿Cara o Cruz?
    Cara
    FALSO
    ¿otra tirada (sí/no)?
    no
 */

import java.util.Random;
import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String op = "";

        for (; !op.equals("no"); ) {
            System.out.println("¿Cara o Cruz?");
            String select = sc.nextLine();

            int tirada = rnd.nextInt(2);

            if ((select.toLowerCase().equals("cruz") && tirada == 0) ||
                    (select.toLowerCase().equals("cara") && tirada == 1)) {
                System.out.println("ACIERTO");
            } else {
                System.out.println("FALLO");
            }
            System.out.println("¿otra tirada (sí/no)?");
            op = sc.nextLine();
            if (op.toLowerCase().equals("no") || op.toLowerCase().equals("n")) {
                op = "no";
            }
        }
    }
}