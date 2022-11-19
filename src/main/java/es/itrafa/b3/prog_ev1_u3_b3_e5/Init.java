package es.itrafa.b3.prog_ev1_u3_b3_e5;
/*
    Ejercicio U3_B3_5
    Vuelve a escribir el ejemplo anterior de forma que los contadores i y j se
    incrementen en la condición del while, pero se obtenga exactamente el mismo
    resultado que con el código anterior.

    Ejemplo anterior:
    class Unidad3 {
        public static void main(String[] args) {
            int i=0;
            while(i<3){
                System.out.println("iteración bucle exterior número " +(i+1));
                int j=0;
                while(j<2){
                    System.out.println("\titeración bucle interior número " +(j+1));
                    j++;
                }
                i++;
            }
        }
    }
 */

class Unidad3 {
    public static void main(String[] args) {
        int i = 0;
        while (++i < 4) {
            System.out.println("iteración bucle exterior número " + i );
            int j = 0;
            while (++j < 3) {
                System.out.println("\titeración bucle interior número " + j );
            }
        }
    }
}