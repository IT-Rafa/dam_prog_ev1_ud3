package es.itrafa.b6.prog_ev1_u3_b6_e1;
/*
    Ejercicio U3_B6_1:
    Escribe un bucle que utilizando break detecte el índice del primer carácter blanco. Si no
    hay espacio en blanco indica “no existe ningún espacio”.

    class Unidad3 {
        public static void main(String[] args) {
            String s = "1110 001";
            int i=0;
            while (.... ) {
                …
            }
            if (i == s.length()) {
                System.out.println("no existe ningún espacio");
            } else {
                System.out.println("Indice buscado : " + i);
            }
        }
    }
    Escribe también una versión sin break
 */


class Unidad3 {
    public static void main(String[] args) {
        String s = "1110 001";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                break;
            }
            i++;
        }
        if (i == s.length()) {
            System.out.println("no existe ningún espacio");
        } else {
            System.out.println("Indice buscado : " + i);
        }
    }
}

class Unidad3_1 {
    public static void main(String[] args) {
        System.out.println("SIN BREAK");
        String s = "1110 001";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                System.out.println("Indice buscado : " + i);
                return;
            }
            i++;
        }
        System.out.println("no existe ningún espacio");

    }
}