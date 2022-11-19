package es.itrafa.b7.prog_ev1_u3_b7_e4;
/*
    EJERCICIO U3_B7_E4. Calcular el factorial de un número con recursividad
    Podemos definir el factorial de un número n >=0 de forma recursiva
    0! = 1
    n! = n * (n – 1)! , si n > 0
    Observa que “la frasecita” sería: El factorial de n es n multiplicado por el factorial de
    n-1. observa que en la frasecita se incluye la palabra factorial
    Por tanto aprecia la diferencia entre
    n! = n * (n–1) * (n–2) * ... * 3 * 2 * 1 pensando en bucle ....
    n! = n · (n – 1)! ,
    si n > 0 pensando en modo recursivo ...
 */

import java.util.Scanner;
import es.itrafa.b7.prog_ev1_u3_b7_e6.Factorial;
public class Unidad3{
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Teclea número entero para calcular factorial:");
        int n=teclado.nextInt();
        Factorial f = new Factorial();
        System.out.println("Su factorial es: "+f.calcularFactorial(n));
    }
}
