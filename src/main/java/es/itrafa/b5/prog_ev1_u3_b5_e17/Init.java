package es.itrafa.b5.prog_ev1_u3_b5_e17;
/*
    Ejercicio U3_B5_17:
    Transcribir a java el clásico algoritmo de divisiones sucesivas por 2 para
    pasar decimal a binario. Se para de dividir cuando el número a dividir es
    cero y el resultado es la concatenación de los restos de las sucesivas
    divisiones. Ejemplo:
 */

class Unidad3 {
    public static void main(String[] args) {
        int n = 1024;
        String bin = "";
        for (int i = n; i != 0; i /= 2) {
            System.out.println("* " + i + " / 2 = " + (i / 2) + "; Resto =  " + (i % 2));
            bin += (i % 2);
        }
        // para 0, que no hace nada
        if (n == 0) {
            System.out.print("0");
        } else {
            // invertimos resultado y mostramos
            for (int i = bin.length() - 1; i >= 0; i--)
                System.out.print(bin.charAt(i));
        }

    }
}