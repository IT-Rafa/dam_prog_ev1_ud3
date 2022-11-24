package es.itrafa.tarea2.Ej2;

/**
 * Ejercicio 2
 * Se pide en este caso escribir un método que imita al indexOf de forma que se le pasa un string y un caracter y
 * devuelve el índice de la primera ocurrencia de  dicho caracter o bien -1 si el caracter no tiene está en el string.
 *
 * Evidentemente, se pretende que resuelvas el problema procesando el String en un bucle, ¡sin usar el método indexOf()!
 *
 * El método se llamará myIndexOf() y su funcionamiento se ejemplifica a continuación. El método debes definirlo
 * como static.
 *
 * Por ejemplo:
 * Test 	                                                Resultado
 *
 * System.out.println(myIndexOf("hola a todos",'s'));       11
 */
public class Prog {
    public static void main(String[] args){
        System.out.println(myIndexOf("hola a todos",'s'));
    }

    private static int myIndexOf(String st, char c) {
        for(int i =0; i < st.length(); i++){
                if(st.charAt(i) == c){
                    return i;
                }
        }
        return -1;
    }
}
