package es.itrafa.b1.prog_ev1_u3_b1_e6;
/*
    Ejercicio U3_B1_E6
    Mejora la legibilidad del siguiente programa mejorando los sangrados de las sentencias if.
    Escribe una versión sin brackets y otra con brackets

    import java.util.Scanner;
    class Unidad3 {
        public static void main(String[] args) {
            Scanner teclado= new Scanner(System.in);
            int a,b,s=5;
            System.out.println("a: ");
            a=teclado.nextInt();
            System.out.println("b: ");
            b=teclado.nextInt();
            if(a==0)
                if(b!=0)
                    s=s+b;
                else
                    s=s+a;
            System.out.println("s: "+s);
        }
    }
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, s = 5;
        System.out.println("a: ");
        a = teclado.nextInt();
        System.out.println("b: ");
        b = teclado.nextInt();
        if (a == 0)
            if (b != 0)
                s = s + b;
            else
                s = s + a;
        System.out.println("s: " + s);
    }
}

class Unidad3_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, s = 5;
        System.out.println("a: ");
        a = teclado.nextInt();
        System.out.println("b: ");
        b = teclado.nextInt();
        if (a == 0) {
            if (b != 0) {
                s = s + b;
            } else {
                s = s + a;
            }
        }
        System.out.println("s: " + s);
    }
}