package es.itrafa.b7.prog_ev1_u3_b7_e2;
/*
    Ejercicio U3_B7_E2:
    Escribir multiplicar() de forma que también se puedan
    multiplicar números negativos (, sin usar * en el método multiplicar):
    class Unidad3 {
        public static void main(String[] args) {
            Multiplicacion m = new Multiplicacion();
            System.out.println(m.multiplicar(-2,-5));
            System.out.println(m.multiplicar(2,-5));
            System.out.println(m.multiplicar(-2,5));
            System.out.println(m.multiplicar(-2,0));
            System.out.println(m.multiplicar(2,0));
            System.out.println(m.multiplicar(0,-2));
        }
    }
 */

class Unidad3 {
    public static void main(String[] args) {
        Multiplicacion m = new Multiplicacion();
        System.out.println(m.multiplicar(-2,-5));
        System.out.println(m.multiplicar(2,-5));
        System.out.println(m.multiplicar(-2,5));
        System.out.println(m.multiplicar(-2,0));
        System.out.println(m.multiplicar(2,0));
        System.out.println(m.multiplicar(0,-2));
    }
}