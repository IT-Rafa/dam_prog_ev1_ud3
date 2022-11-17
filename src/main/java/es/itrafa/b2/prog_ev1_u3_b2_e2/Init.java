package es.itrafa.b2.prog_ev1_u3_b2_e2;
/*
    Ejercicio U3_B2_E2:
    Consigue el efecto contrario al ejercicio anterior, es decir

    teclea un mes:
    Octubre
    mes en número: 10

    Otro tipo que puede devolver el Switch es un tipo enumerado que no veremos por el
    momento.

    Una observación importante es que la expresión del switch no
    puede ser boolean, esto limita bastante el switch de Java, ya que código del tipo.

    if (x>0)
        System.out.println("x es mayor que 0);
    else if (y>0)
        System.out.println("y es mayor que 0);
    else if (z ==8)
        System.out.println("z es igual a 8);

    No se puede escribir con switch
 */

import java.util.Scanner;

class Unidad3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("teclea un mes: ");
        String nombreMes = sc.nextLine();

        int numMes;
        switch (nombreMes.toLowerCase()){
            case "enero":
                numMes = 1;
                break;
            case "febrero":
                numMes = 2;
                break;
            case "marzo":
                numMes = 3;
                break;
            case "abril":
                numMes = 4;
                break;
            case "mayo":
                numMes = 5;
                break;
            case "junio":
                numMes = 6;
                break;
            case "julio":
                numMes = 7;
                break;
            case "agosto":
                numMes = 8;
                break;
            case "septiembre":
                numMes = 9;
                break;
            case "octubre":
                numMes = 10;
                break;
            case "noviembre":
                numMes = 11;
                break;
            case "diciembre":
                numMes = 12;
                break;
            default:
                numMes = -1;
                break;

        }
        System.out.print("mes en número: " + numMes);

    }
}