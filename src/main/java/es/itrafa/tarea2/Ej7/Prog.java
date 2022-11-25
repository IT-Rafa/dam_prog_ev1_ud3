package es.itrafa.tarea2.Ej7;

/**
 * Ejercicio 7
 * Miker Chiménez ve cosas escondidas en cualquier lado. Una mancha de humedad en la pared se le antoja la cara de la
 * anterior propietaria de una casa; el sonido del viento le parece un susurro venido del más allá; una nube con forma
 * peculiar le convence de la existencia de vida extraterrestre...
 * Ahora le ha dado por ver mensajes ocultos en cualquier sitio. Por poner un ejemplo, si lee el siguiente titular:
 * "El presidente del Gobierno se somete esta noche al escrutinio de varios periodistas en Televisión Española.",
 * se las ingenia para leer un "te odio" oculto que le mantiene en vela toda la noche:
 * <p>
 * El presidenTE del Gobierno se sOmete esta noche al escrutinio De varIos periOdistas en Televisión Española.
 * Crea un programa para ayudar a Miker Chiménez a automatizar la búsqueda de estos mensajes.
 * <p>
 * El programa leerá inicialmente un entero que le indicará cuántos casos de prueba vendrán a continuación.
 * Cada uno de estos casos de prueba estará formado por dos líneas;
 * la primera indica el titular donde buscar un mensaje oculto y
 * la segunda indica el mensaje a buscar.
 * <p>
 * Ten en cuenta que no hace falta distinguir entre mayúsculas
 * y minúsculas y que los espacios del mensaje oculto no son relevantes, es decir, no hace falta que existan en el
 * mensaje original, pero sí deben aparecer el resto de caracteres (signos de puntuación, comillas, etc.).
 * <p>
 * La entrada contendrá únicamente letras del alfabeto inglés, por lo que no aparecerán vocales con tilde.
 * Además, podrían aparecer múltiples espacios consecutivos.
 * <p>
 * Por ejemplo:
 * Entrada 	Resultado
 * <p>
 * 4
 * El presidenTE del Gobierno se sOmete esta noche al escrutinio De varIos periOdistas en Televisión Española.
 * te odio.
 * Teo dijo "si".
 * te odio.
 * Y adios, que ya viene el alba.
 * te odio.
 * Teo    subio  al    podio.
 * te          odio.
 */

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(sc.nextLine());

        // CASOS A PROBAR
        while (casos-- > 0) {
            // INPUT
            String frase = sc.nextLine().toLowerCase();

            String find = sc.nextLine().toLowerCase().replace(" ", "");

            String solution = "";
            int limit = 0;

            for(int i = 0; i < find.length(); i++){
                int f = frase.indexOf(find.charAt(i), limit);
                if (f != -1){
                    solution += frase.charAt(f) + "(" + f +")";
                    limit = f +1;
                }else{
                    solution = "";
                    break;
                }
            }
            System.out.println(solution);

        }

    }
}
