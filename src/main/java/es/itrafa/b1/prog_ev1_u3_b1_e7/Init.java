package es.itrafa.b1.prog_ev1_u3_b1_e7;
/*
    Ejercicio U3_B1_E7
    Intenta simplificar el siguiente código. ¿Sobra alguna instrucción?

    import java.util.Scanner;
    class Unidad3{
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
            // if (b != 0) // si b == 0, queda b y si b != b queda s + b; en ambos casos se suma b, aunque sea 0, y da lo mismo
                s = s + b;
            // else  // sin la instrucción de abajo no tiene sentido
                // s = s + a; si a == 0, s+a sera siempre s
        System.out.println("s: " + s);
    }
}
