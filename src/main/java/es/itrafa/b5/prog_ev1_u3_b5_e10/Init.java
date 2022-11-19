package es.itrafa.b5.prog_ev1_u3_b5_e10;
/*
    Ejercicio U3_B5_10:
    Con for
    imprime la progresión 1 2 4 8 16 32 ....1024. Es decir,
    empezando en 1, cada elemento de la progresión dobla en su valor al anterior.
 */

class Unidad3 {
    public static void main(String[] args) {
        for(int i = 1; i<= 1024; i *=2){
            System.out.print(i + " ");
        }
    }
}