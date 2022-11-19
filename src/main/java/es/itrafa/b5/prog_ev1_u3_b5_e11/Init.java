package es.itrafa.b5.prog_ev1_u3_b5_e11;
/*
    Ejercicio U3_B5_11:
    Haz 20 tiradas de un dado(usar Random) e imprime su resultado
    en 4 filas de 5 resultados cada una como en el ejemplo.
    3 2 5 4 4
    2 4 1 4 1
    2 4 1 5 1
    5 5 6 4 6

    Cada ejecución, evidentemente, tendrá valores diferentes. En el ejemplo anterior, la
    primera tirada fue un 3, luego salió un 2, luego 5, 4, 4, 2, etc. Es decir cada 5 tiradas
    cambiamos de fila
 */

import java.util.Random;

class Unidad3 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(rand.nextInt(6) + 1 + " ");
            }
            System.out.println();
        }
    }
}