package es.itrafa.b4.prog_ev1_u3_b4_e1;
/*
    U3_B4_1:
    ¿Qué pasaría si hubiéramos utilizado la forma de post-incremento i++?

        class Unidad3 {
            public static void main(String[] args) {
                int i=1;
                do
                    System.out.print(i+" ");
                while(i++<11);
            }
        }
 */

class Unidad3 {
    public static void main(String[] args) {
        int i = 1;
        do
            System.out.print(i + " ");
        while (i++ < 11); // Comprueba condición con i==10 y, al salir, de la condición, sube a 11
    }
}