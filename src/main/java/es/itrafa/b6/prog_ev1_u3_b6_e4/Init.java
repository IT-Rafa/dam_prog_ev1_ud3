package es.itrafa.b6.prog_ev1_u3_b6_e4;
/*
    Ejercicio U3_B6_4:
    Escribe el ejemplo anterior sin utilizar etiquetas.

    class Unidad3 {
        public static void main(String[] args) {
            mibloque://etiqueta a la siguiente instrucción, es decir, el primer for

            for(int i=1; i<=3;i++){
                System.out.println("Bucle externo, COMIENZA iteración:"+i);

            for(int j=1;j<=5;j++){
                if(j==3)
                    break mibloque; //indica que hay que salir de la instrucción etiquetada
                    System.out.println("\tBucle interno en iteración:"+j);
                }
                System.out.println("Bucle externo, FINALIZA iteración:"+i +"\n");
            }
        }
    }
 */

class Unidad3 {
    public static void main(String[] args) {
        boolean endBucle = false;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Bucle externo, COMIENZA iteración:" + i);

            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    return;
                }
                System.out.println("\tBucle interno en iteración:" + j);
            }
            System.out.println("Bucle externo, FINALIZA iteración:" + i + "\n");
        }
    }
}