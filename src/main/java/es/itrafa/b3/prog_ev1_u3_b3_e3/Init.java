package es.itrafa.b3.prog_ev1_u3_b3_e3;
/*
    Ejercicio U3_B3_3 Una solución incorrecta al ejercicio anterior es la siguiente,
    ejecuta el código y explica por qué es erróneo. Utiliza el tracer de BlueJ para
    investigar el problema

    class Unidad3{
        public static void main(String[] args) {
            int i=0;
            while(i<=10)
            if(i%2==0)
                System.out.println((i++)+" es par");
        }
    }
 */

class Unidad3 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10)
            if (i % 2 == 0)
                System.out.println((i++) + " es par"); // Solo aumenta i si es par. 0 no es par y no sube nunca
    }
}