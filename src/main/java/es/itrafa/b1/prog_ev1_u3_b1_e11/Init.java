package es.itrafa.b1.prog_ev1_u3_b1_e11;
/*
    Ejercicio U3_B1_E11.
    Escribe el siguiente código con if secuenciales

    import java.util.Scanner;
    class Unidad3 {
        public static void main(String[] args) {
            //suponemos 3 enteros distintos
            Scanner sc= new Scanner(System.in);
            System.out.println("Mete 3 números separados: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int menor;
            if(a<b && a<c){
                menor=a;
            }else if (b<c && b<a){
                menor=b;
            }else{
                menor=c;
            }
            System.out.println("El menor: "+ menor);
        }
    }
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        //suponemos 3 enteros distintos
        Scanner sc = new Scanner(System.in);
        System.out.println("Mete 3 números separados: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int menor = a;

        if (menor > b){
            menor = b;
        }
        if (menor > c){
            menor = c;
        }

        System.out.println("El menor: " + menor);
    }
}