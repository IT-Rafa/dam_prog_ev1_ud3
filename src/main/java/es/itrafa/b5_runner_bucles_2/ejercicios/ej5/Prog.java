package es.itrafa.b5_runner_bucles_2.ejercicios.ej5;

/**
 * Ejercicio 5
 * Diseña un programa que, en primer lugar, le pida al usuario que
 * escriba un carácter cualquiera (letra, dígito,...). A continuación,
 * aceptará entradas del usuario hasta que esté escriba la secuencia “<>”.
 * El programa mostrará cuántas ocurrencias del carácter se produjeron
 * en el texto introducido hasta la aparición de dicha secuencia.
 * <p>
 * Por ejemplo:
 * Entrada          	Resultado
 * <p>
 * a
 * Hola, qué tal?
 * Así, así
 * <>                   3
 * <p>
 * L
 * Hola, qué tal?
 * Así, así
 * <>                   0
 * <p>
 * s
 * Hola, qué tal?
 * Así, a<>sí           1
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String input = sc.next();
        boolean end = false;
        if (input.length() == 1) {
            while (end == false && sc.hasNext()  ) {
                String text = sc.next();
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == input.charAt(0)) {
                        count++;
                    } if(text.charAt(i) == '>' && text.charAt(i-1) == '<' ){
                        end = true;
                        break;
                    }
                }
            }
            System.out.println(count);
        } else {
            System.out.println("Solo un carácter");
        }

    }
}
