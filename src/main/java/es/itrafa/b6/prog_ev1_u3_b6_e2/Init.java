package es.itrafa.b6.prog_ev1_u3_b6_e2;
/*
    Ejercicio U3_B6_2:
    Escribe el código equivalente sin break
    class Unidad3 {
        public static void main(String[] args) {
            int num = 12345;
            int cifras = 0;

            while (num > 0) {
                num /= 10;
                cifras++;
                if (cifras == 5) {
                    break;
                }
            }
            if (cifras == 5) {
                System.out.println("El número tiene 5 o más dígitos");
            } else {
                System.out.println("El número tiene menos de 5 dígitos");
            }
        }
    }
 */

class Unidad3 {
    public static void main(String[] args) {
        int num = 1234567891;
        int cifras = 0;

        while (num > 0) {
            num /= 10;
            cifras++;
            //System.out.println(cifras);
            if (cifras == 5) {
                System.out.println("El número tiene 5 o más dígitos");
                return;
            }
        }
        System.out.println("El número tiene menos de 5 dígitos");

    }
}