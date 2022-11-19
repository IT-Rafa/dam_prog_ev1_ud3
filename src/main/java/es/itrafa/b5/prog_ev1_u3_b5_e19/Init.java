package es.itrafa.b5.prog_ev1_u3_b5_e19;
/*
    Ejercicio U3_B5_19:
    Con las mismas consideraciones que en el ejercicio anterior,
    usando impresión de * en *,  consigue:

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

    Observa que en todas las filas, excepto en la última tengo que imprimir
    espacios antes de *
 */

class Unidad3 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}