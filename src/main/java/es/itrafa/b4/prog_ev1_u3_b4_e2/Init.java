package es.itrafa.b4.prog_ev1_u3_b4_e2;
/*
    U3_B4_2.
    Aunque se puede hacer de muchas formas, utilizar un do while en el código
    de un menú de opciones es muy habitual. Consigue un programa con una salida similar
    a la siguiente usando do while. El switch también se ve mucho en los menús de
    opciones, usa también un switch conjuntamente con el do while.
    ------lista de actividades -------
    comer
    beber
    acabar
    Teclea tu acción preferida: comer
    ñam ñam ñam ...
    ------lista de actividades -------
    comer
    beber
    2
    acabar
    Teclea tu acción preferida: beber
    glu glu glu ...
    ------lista de actividades -------
    comer
    beber
    acabar
    Teclea tu acción preferida: dormir
    ¡no existe esa opcion!
    ------lista de actividades -------
    comer
    beber
    acabar
    Teclea tu acción preferida: acabar
    ¡¡adios!!!
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        do{
            System.out.println("------lista de actividades -------");
            System.out.println("comer");
            System.out.println("beber");
            System.out.println("acabar");
            op = sc.nextLine();

            switch(op){
                case("comer"):
                    System.out.println("ñam ñam ñam ...");
                    break;
                case("beber"):
                    System.out.println("glu glu glu ...");
                    break;
                case("acabar"):
                    System.out.println("¡¡adios!!!");
                    break;
                default:
                    System.out.println("¡no existe esa opción!");
            }
        }while(!op.equals("acabar"));
    }
}