package es.itrafa.b5.prog_ev1_u3_b5_e6;
/*
    Ejercicio U3_B5_6:
    imprimir los números impares hasta el 100 e imprimir cuantos impares hay en total.
 */

class Unidad3 {
    public static void main(String[] args) {
        int count = 0;
        for(int i =1; i <= 100; i +=2){
            System.out.print(i + " ");
            count++;
        }
        System.out.print("\nCantidad impares: " + count);
    }
}