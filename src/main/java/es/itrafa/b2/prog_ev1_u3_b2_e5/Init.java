package es.itrafa.b2.prog_ev1_u3_b2_e5;
/*
    Ejercicio U3_B2_E4:
    Escribe el siguiente código con el operador ->

    class Unidad3{
        public static void main(String[] args){
            int x = 3;
            switch (x){
            case 1:
                System.out.println("x es uno");
                break;
            case 2:
                System.out.println("x es dos");
                break;
            case 3:
                System.out.println("x es tres");
                break;
            case 4:
                System.out.println("x es cuatro");
                break;
            case 5:
                System.out.println("x es cinco");
                break;
            default:
                System.out.println("x no está entre uno y cinco" );
            }
        }
    }
 */

class Unidad3{
    public static void main(String[] args){
        int x = 3;
        switch (x){
            case 1 -> System.out.println("x es uno");
            case 2 -> System.out.println("x es dos");
            case 3 -> System.out.println("x es tres");
            case 4 -> System.out.println("x es cuatro");
            case 5 -> System.out.println("x es cinco");
            default -> System.out.println("x no está entre uno y cinco" );
        }
    }
}