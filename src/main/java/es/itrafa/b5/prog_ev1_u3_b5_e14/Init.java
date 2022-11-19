package es.itrafa.b5.prog_ev1_u3_b5_e14;
/*
    Ejercicio U3_B5_14:
    Utilizando for anidados consigue la siguiente impresión

    11
    12
    13
    21
    22
    23
    31
    32
    33
 */

class Unidad3 {
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                System.out.println("" +i + j);
            }
        }
    }
}