package es.itrafa.b1.prog_ev1_u3_b1_e10;
/*
    Ejercicio U3_B1_E10.
    Vuelve a escribir el siguiente código utilizando el operador condicional
    y sin utilizar condiciones complejas.
    Pista: utiliza un operador condicional anidado en otro para obtener
    una solución compacta y fácil.

    class Unidad3 {
        public static void main(String args[]) {
            int x;//suponemos que x puede tomar valores 1,2 o 3
            x = 3;


            if (x == 1) {
                System.out.println("x es uno");
            } else if (x == 2) {
                System.out.println("x es dos");
            } else {
                System.out.println("x es tres");
            }
        }
    }
 */

class Unidad3 {
    public static void main(String args[]) {
        int x;//suponemos que x puede tomar valores 1,2 o 3
        x = 3;

        System.out.println((x == 1) ? "x es uno" : (x == 2) ? "x es dos" : "x es tres");

    }
}