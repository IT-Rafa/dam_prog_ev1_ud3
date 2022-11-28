package es.itrafa.tarea2.Ej5;

/**
 * Ejercicio 5
 * <p>
 * En 1815 nacía Ada Byron, conocida después como Ada Lovelace, destinada a convertirse
 * en la primera programadora de la historia. Amiga de Charles Babbage, siguió con interés
 * los trabajos de este, relacionados con su máquina analítica, que hoy se considera un hito
 * en la historia de la computación.
 * Con la ayuda de Babbage, estudió y mejoró algunas de sus ideas, centrándose en lo que
 * hoy llamaríamos software, mientras que Babbage se preocupaba principalmente por el hardware.
 * Fue Ada quien describió el primer algoritmo pensado específicamente para ser ejecutado por
 * un "ordenador", por lo que se la reconoce como la primera programadora.
 * <p>
 * El objetivo del algoritmo era el cálculo de los números de Bernouilli.
 * <p>
 * Esta es una secuencia de números racionales que tienen conexiones muy interesantes con teoría
 * de números. Su cálculo es complejo, por lo que a pesar de que han pasado muchos años desde
 * que Ada "programó" cómo obtenerlos, nos conformaremos con uno de sus usos, el cálculo de
 * la fórmula de Faulhaber, o suma de los n primeros números elevados a un valor constante p:
 * <p>
 * 1p + 2p + 3p + …  + np
 * <p>
 * 4 3
 * <p>
 * 1^3 + 2^3 + 3^3 + 4^3 = 100
 * 10 10
 * 1
 * <p>
 * Crea un programa que lea de la entrada estándar múltiples casos de prueba, cada uno en una línea.
 * Un caso de prueba se compondrá de dos números, n y p, entre 1 y 10 ambos incluidos.
 * <p>
 * El programa finalizará cuando n = p = 0
 * <p>
 * Por ejemplo:
 * Entrada 	Resultado
 * <p>
 * 1 1      1 : 1^1
 * 2 2      5 : 1^2 + 2^2
 * 3 3      36 : 1^3 + 2^3 + 3^3
 * 4 3      100
 * 10 10    14914341925
 * <p>
 * 100 100  17171
 * 0 0
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        while (n != 0 && p != 0) {
            if (n >= 1 && p >= 1 && n <= 10 && p <= 10) {
                long result = 1;
                for (int i = 2; i <= n; i++) {
                    long pot = 1;
                    for (int j = 1; j <= p; j++) {
                        pot *= i;
                    }
                    result += pot;
                }
                System.out.println(result);
            }

            n = sc.nextInt();
            p = sc.nextInt();
        }
    }
}
