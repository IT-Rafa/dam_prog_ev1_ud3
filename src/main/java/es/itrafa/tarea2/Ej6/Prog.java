package es.itrafa.tarea2.Ej6;

/**
 * Ejercicio 6
 * Crea un método estático denominado diamante(n, c) que dibuje un diamante
 * de la altura n y relleno c, siempre y cuando la altura sea impar y comprendida
 * entre 1 y 33. Un diamante de tamaño 1 es simplemente un carácter c.
 * Para diamantes con altura <=0 o bien altura par simplemente no se imprime nada.
 * <p>
 * Por ejemplo:
 * diamante(5, '#')
 * <p>
 * Resultado
 * <p>
 * __#
 * _###
 * #####
 * _###
 * __#
 */
public class Prog {
    public static void main(String[] args) {
        diamante(1, 'B');
        System.out.println();

        diamante(5, '#');
        System.out.println();

        diamante(7, '\u2661');
        System.out.println();
        diamante(33, '#');

        diamante(30, '#');
        diamante(8, '#');
        diamante(4, '#');

    }

    private static void diamante(int n, char c) {
        // impar y comprendida entre 1 y 33.
        if (n >= 1 && n <= 33 && n % 2 != 0) {

            int i, limit;
            for (i = 0; i <= n / 2; i++) {
                limit = (n / 2) - i;
                for (int j = 0; j < limit; j++) {
                    System.out.print(" ");
                }
                limit = (i * 2) + 1;
                for (int j = 0; j < limit; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }

            for (i = i; i < n; i++) {
                limit = i - (n / 2);
                for (int j = 0; j < limit; j++) {
                    System.out.print(' ');
                }
                limit = (n - i) * 2 - 1;
                for (int j = 0; j < limit; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }

        }

    }
/*
    private static void diamante(int i, char c) {

        // impar y comprendida entre 1 y 33.
        if (i >= 1 && i <= 33 && i % 2 != 0) {
            // Ej i == 11
            int half = i / 2; // half == 5
            int j = 0;

            // Primeras líneas, antes del medio. Ej del 0 a (5-1)
            for (j = 0; j < half; j++) {

                // espacios previos ( del 0 hasta (5 - nºlínea)-1
                for (int k = 0; k < half - j; k++) {
                    System.out.print(" ");
                }

                // mitad inicial del corchete
                for (int k = 0; k < (j * 2) + 1; k++) {
                    System.out.print(c);
                }
                System.out.println();
            }

            // medio
            for (j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();

            // Últimas líneas, tras medio
            for (j = 0; j < half; j++) {

                // espacios previos
                for (int k = 0; k < j + 1; k++) {
                    System.out.print(" ");
                }
                // mitad final del corchete
                for (int k = j + 2; k < i - j; k++) {
                    System.out.print(c);
                }
                System.out.println();
            }

        }


    }

 */
}
