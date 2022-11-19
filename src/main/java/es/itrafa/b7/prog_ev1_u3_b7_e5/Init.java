package es.itrafa.b7.prog_ev1_u3_b7_e5;
/*
    EJERCICIO U3_B7_E5.
    Imprimir el siguiente triángulo de caracteres con recursividad

    E:\Programacion> java Unidad3
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    **********
 */

class Unidad3 {
    public static void main(String[] args) {
        imprimirTriangulo(10);
    }


    private static void imprimirTriangulo(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print('*');
        }
        System.out.println();
        if (n != 0) {
            imprimirTriangulo(n - 1);
        }
    }
}