package es.itrafa.b5.prog_ev1_u3_b5_e16;
/*
    Ejercicio U3_B5_E16:
    Utilizando doble anidación (3 niveles de for) consigue todas las
    combinaciones posibles de las letras A, B, y C
 */

class Unidad3 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'C'; i++) {
            for (char j = 'A'; j <= 'C'; j++) {
                for (char k = 'A'; k <= 'C'; k++) {
                    System.out.print("" + i + j + k + "\n");
                }
            }
        }
    }
}