package es.itrafa.b5.prog_ev1_u3_b5_e12;
/*
    Ejercicio U3_B5_12:
    Simulamos tirar un dado usando la clase Random.
    Tiramos el dado 6000000 de veces(6_000_000). Vamos almacenando la
    cantidad de veces que sale cada cara.
    Si realmente se generan números aleatorios los valores obtenidos para
    cada cara serán aceptablemente próximos. Ejemplo:
 */

import java.util.Random;

class Unidad3 {
    public static void main(String[] args) {
        int max = 6_000_000;
        Random rand = new Random();
        int cara1, cara2, cara3, cara4, cara5, cara6;
        cara1 = cara2 = cara3 = cara4 = cara5 = cara6 = 0;
        for(int i = 1; i <= max; i++){
            int n = rand.nextInt(6) + 1;
            switch(n){
                case 1: cara1++; break;
                case 2: cara2++; break;
                case 3: cara3++; break;
                case 4: cara4++; break;
                case 5: cara5++; break;
                case 6: cara6++; break;
                default: break;
            }
        }
        System.out.println("Salieron " + cara1 + " con valor 1");
        System.out.println("Salieron " + cara2 + " con valor 2");
        System.out.println("Salieron " + cara3 + " con valor 3");
        System.out.println("Salieron " + cara4 + " con valor 4");
        System.out.println("Salieron " + cara5 + " con valor 5");
        System.out.println("Salieron " + cara6 + " con valor 6");
        System.out.println("Tiradas =  " + (cara1 + cara2 + cara3+ cara4 + cara5 + cara6));


    }
}