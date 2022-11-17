package es.itrafa.b2.prog_ev1_u3_b2_e1;
/*
    Ejercicio U3_B2_E1:
    Crea un programa que pida por teclado un número de mes y
    responda con el nombre del mes. Ejemplo de ejecución
    teclea un número de mes(1-12):
    6
    mes en String: Junio
    Desde Java 7 la expresión del switch también puede devolver un String, con lo cual
    podemos hacer el siguiente ejercicio.
 */

import java.util.Scanner;

class Unidad3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("teclea un número de mes(1-12): ");
        int n = sc.nextInt();

        String mes;
        switch (n){
            case 1:
                mes = "enero";
                break;
            case 2:
                mes = "febrero";
                break;
            case 3:
                mes = "marzo";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "mayo";
                break;
            case 6:
                mes = "junio";
                break;
            case 7:
                mes = "julio";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "septiembre";
                break;
            case 10:
                mes = "octubre";
                break;
            case 11:
                mes = "noviembre";
                break;
            case 12:
                mes = "diciembre";
                break;
            default:
                mes = "error";
                break;

        }
        System.out.print("mes en String: " + mes);

    }
}