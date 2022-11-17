package es.itrafa.b1.prog_ev1_u3_b1_e9;
/*
    Ejercicio U3_B1_E9.
    Vuelve a escribir el siguiente programa utilizando condiciones simples en la instrucción if.

    import java.util.Scanner;
    class Unidad3{
        public static void main(String[] args) {
            Scanner teclado= new Scanner(System.in);
            int a,b,s=5; //mejor, es cada variable en su línea pero existe esta posibilidad
            System.out.println("a: ");
            a=teclado.nextInt();
            System.out.println("b: ");
            b=teclado.nextInt();
            if(a==0 && b!=0)
                s=s/b;
            else if(a==0 && b==0)
                ++s;
            else if(a!=0 && b==0)
                s=999+a;
            else if(a!=0&&b!=0)
                s=888+a+b;
            System.out.println("s: "+s);
        }
    }
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, s = 5; //mejor, es cada variable en su línea pero existe esta posibilidad
        System.out.println("a: ");
        a = teclado.nextInt();
        System.out.println("b: ");
        b = teclado.nextInt();

        if (a == 0) {
            if (b != 0) {
                s = s / b;
            } else {
                ++s;
            }
        } else {
            if (b != 0) {
                s = 888 + a + b;
            } else {
                s = 999 + a;
            }
        }

        System.out.println("s: " + s);
    }
}