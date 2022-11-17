package es.itrafa.b1.prog_ev1_u3_b1_e8;
/*
    Ejercicio U3_B1_E8. Vuelve a escribir el siguiente programa de forma que en el if sólo
    utilice condiciones simples (suprime las condiciones compuestas con && )

    import java.util.Scanner;
    class Unidad3{
        public static void main(String[] args) {
            Scanner teclado= new Scanner(System.in);
            int a,b,s=5;
            System.out.println("a: ");
            a=teclado.nextInt();
            System.out.println("b: ");
            b=teclado.nextInt();
            if(a==0 && b!=0)
                s=s/b;
            else if (a==0 && b==0)
                s++;
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

        if(a == 0){
            if (b != 0){
                s = s / b;
            }else{
                s++;
            }
        }
        System.out.println("s: " + s);
    }
}