package es.itrafa.b5.prog_ev1_u3_b5_e9;
/*
    Ejercicio U3_B5_9:
    Imprime la cuenta de 50 a 0 de -2 en -2 de 3 formas: con while, do while
    y for. Ejemplo de salida.
    run:
    50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0
    50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0
    50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2 0
 */

class Unidad3 {
    public static void main(String[] args) {
        int i = 50;
        while (i >= 0) {
            System.out.print(i + " ");
            i -= 2;
        }

        System.out.println();
        i = 50;
        do {
            System.out.print(i + " ");
            i -= 2;
        } while (i >= 0);

        System.out.println();
        for (i = 50; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }

    }
}