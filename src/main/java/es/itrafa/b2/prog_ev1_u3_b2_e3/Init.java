package es.itrafa.b2.prog_ev1_u3_b2_e3;
/*
    Ejercicio U3_B2_E3:
    El siguiente programa, dado un número x entre 1 y 5, cuenta
    desde el número x hasta 5. Escríbelo con if.

    class Unidad3{
        public static void main(String[] args){
            int x = 3;
            switch (x){
            case 1:
                System.out.println(1);
                //break;
            case 2:
                System.out.println(2);
                //break;
            case 3:
                System.out.println(3);
                //break;
            case 4:
                System.out.println(4);
                //break;
            case 5:
                System.out.println(5);
                break;
            default:
                System.out.println("el número inicial no está entre uno y cinco" );
            }
        }
    }
 */

class Unidad3{
    public static void main(String[] args){
        int x = 1;
        if(x <= 0 || x >= 6){
            System.out.println("el número inicial no está entre uno y cinco" );
            return;
        }
        if (x <= 1){
            System.out.print(1 + " ");
        }
        if (x <= 2){
            System.out.print(2 + " ");
        }
        if (x <= 3){
            System.out.print(3 + " ");
        }
        if (x <= 4){
            System.out.print(4 + " ");
        }
        if (x <= 5){
            System.out.print(5);
        }
    }
}