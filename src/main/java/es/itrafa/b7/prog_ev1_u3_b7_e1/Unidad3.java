package es.itrafa.b7.prog_ev1_u3_b7_e1;
/*
    Ejercicio U3_B7_E1: Escribe recursivamente el método para imprimir una tabla de
    multiplicar.
    class Unidad3 {
        static void tablaMultiplicar(int tabla, int i){

        }

        public static void main(String[] args) {
            //por ejemplo la tabla del 3 imprimiendo multiplicaciones desde 10 a 1 inclusive
            tablaMultiplicar(3,10);
        }
    }
 */

public class Unidad3 {
    static void tablaMultiplicar(int tabla, int i) {
        System.out.println("" + tabla + "x" + i + " = " + (tabla * i));
        if (--i >= 1) {
            tablaMultiplicar(tabla, i);
        }
        if(i == 1){
            System.out.println("Fin tabla del " + tabla);
        }
    }

    public static void main(String[] args) {
        //por ejemplo la tabla del 3 imprimiendo multiplicaciones desde 10 a 1 inclusive
        tablaMultiplicar(3, 10);
    }
}