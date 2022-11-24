package es.itrafa.tarea2.Ej4;

/**
 * Ejercicio 4
 * La sucesión de Fibonacci es la sucesión de números:
 * <p>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * <p>
 * Cada número se calcula sumando los dos anteriores a él.
 * <p>
 * el 2 se obtiene sumando los dos números anteriores (1+1),
 * el 5 es (2+3),
 * etc.
 * <p>
 * A la sucesión de Fibonacci se le atribuyen poderes casi “esotéricos”. Si tienes tiempo te puede resultar agradable
 * y curioso leer el siguiente artículo
 * <p>
 * http://www.neoteo.com/la-sucesion-de-fibonacci-en-la-naturaleza/
 * <p>
 * La serie de fibonacci tiene la siguiente definición matemática
 * que es una definición de naturaleza recursiva.
 * <p>
 * SE PIDE:  escribir un método estático en Java  llamado fibonacci()  si le pasa  un entero n>=0 que representa una
 * posición en la serie de fibonacci devuelve el valor correspondiente a dicha posición.
 * Aunque la solución de Fibonacci se puede obtener escribiendo un bucle, se pide en este caso que  resuelvas el
 * ejercicio utilizando recursividad.
 * <p>
 * <p>
 * Por ejemplo:
 * Test 	Resultado
 * <p>
 * System.out.println(fibonacci(1));
 * 1
 * <p>
 * System.out.println(fibonacci(2));
 * 1
 * <p>
 * System.out.println(fibonacci(13));
 * 233
 */
public class Prog {
    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(13));
    }

    private static int fibonacci(int pos) {
        if (pos <= 1) {
            return pos;
        } else {
            return fibonacci(pos - 1) + fibonacci(pos - 2);
        }
    }
}