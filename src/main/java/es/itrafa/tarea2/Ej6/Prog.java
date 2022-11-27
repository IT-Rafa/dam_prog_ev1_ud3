package es.itrafa.tarea2.Ej6;

/**
 * Ejercicio 6
 * Crea un método estático denominado diamante(n, c) que dibuje un diamante de la altura n y relleno c, siempre
 * y cuando la altura sea impar y comprendida entre 1 y 33. Un diamante de tamaño 1 es simplemente un caracter c.
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
        diamante(5, '#');
    }

    private static void diamante(int i, char c) {
        int j;
        for (j = 0; j < (i / 2); j++) {
            System.out.print(j + 1 + ":");

            for (int k = 0; k < (i / 2) - j; k++) {
                System.out.print("_");
            }

            for (int k = 0; k < j+1; k++) {
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.print(j +1 + ":");
        for (int k = 0; k < i; k++) {
            System.out.print(c);
        }
        System.out.println();

        for (j = j+1; j < i; j++) {
            System.out.print(j + 1 + ":");

            for (int k = 0; k < j-2; k++) {
                System.out.print("_");
            }

            for (int k = 0; k < i - j; k++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
