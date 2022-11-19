package es.itrafa.b6.prog_ev1_u3_b6_e3;
/*
    Ejercicio U3_B6_3:
    Escribe el código equivalente sin break. El programa comprueba si
    hay una letra ‘t’, o varias en cuyo caso imprime “Sí que hay t”

    class Unidad3 {
        public static void main(String[] args) {
            String frase = "que frase tan bonita";

            for( int i = 0 ; i < frase.length() ; i++ ){
                char caracter=frase.charAt(i);
                if( caracter == 't' ){
                    System.out.println("Si hay t");
                    break;
                }
            }
        }
    }
 */

class Unidad3 {
    public static void main(String[] args) {
        String frase = "que frase tan bonita";

        for( int i = 0 ; i < frase.length() ; i++ ){
            char caracter=frase.charAt(i);
            if( caracter == 't' ){
                System.out.println("Si hay t");
                return;
            }
        }
    }
}