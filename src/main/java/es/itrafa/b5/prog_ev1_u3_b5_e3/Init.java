package es.itrafa.b5.prog_ev1_u3_b5_e3;
/*
    Ejercicio U3_B5_3:
    imprimir la suma de los 100 primeros números naturales(del 1 al
    100 ambos inclusive)
 */

class Unidad3 {
    public static void main(String[] args) {
        int result = 0;
        for(int i=1; i <= 100; i++){
            result += i;
        }
        System.out.println(result);
    }
}