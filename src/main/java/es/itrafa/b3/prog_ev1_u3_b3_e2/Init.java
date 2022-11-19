package es.itrafa.b3.prog_ev1_u3_b3_e2;
/*
    Ejercicio U3_B3_2:
    Imprime, usando while, los números pares que se encuentran entre 0 y 10.
 */

class Unidad3 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}