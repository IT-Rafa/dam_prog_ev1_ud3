package es.itrafa.b5.prog_ev1_u3_b5_e20;
/*
    Ejercicio U3_B5_20:
    Consigue:
    **********
    *********
    ********
    *******
    ******
    *****
    ****
    ***
    **
    *

 */

class Unidad3 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}