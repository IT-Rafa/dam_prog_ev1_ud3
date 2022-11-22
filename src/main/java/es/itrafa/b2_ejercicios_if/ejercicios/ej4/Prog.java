package es.itrafa.b2_ejercicios_if.ejercicios.ej4;

/**
 * Haz un programa para calcular la letra del DNI. Solicitará al usuario la introducción del número de DNI. Se
 * comprobará que es de 8 dígitos, mostrando el mensaje "DNI no válido" en caso de que no lo sea (ten en cuenta que
 * pueden existir números deDNI que empiecen con 0)
 * PISTA:
 * El cálculo se hace de la forma siguiente: dividimos el número del DNI entre 23 y nos quedamos con el resto, que estará entre 0 y 22. Ese
 * valor lo usaremos para obtener la letra a partir de la siguiente tabla:
 * RESTO  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
 * LETRA  T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
 *
 * ENTRADA: Un número entero que representa un DNI sin letra.
 * SALIDA: La letra.
 * Por ejemplo:
 * Entrada
 * Resultado
 * 12345678
 * Z
 * 1234
 * DNI no válido
 */
import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni;

        Scanner cin = new Scanner(System.in);
        dni = cin.nextLine();

        if(dni.trim().length()!=8)
            System.out.println("DNI no válido");
        else {
            char letra = LETRAS.charAt(Integer.valueOf(dni)%23);
            System.out.println(letra);
        }
    }
}
