package es.itrafa.b5.prog_ev1_u3_b5_e4;
/*
    Ejercicio U3_B5_4: El siguiente código intenta resolver, sin éxito el ejercicio U3_B5_3.
    ¿Cuál es el problema?
    class Unidad3{
        public static void main(String[] args) {
            int suma=0;
            for(int i=1;i<101;i++)
                suma=+i;
            System.out.print(suma);
        }
    }
 */

class Unidad3{
    public static void main(String[] args) {
        int suma=0;
        for(int i=1;i<101;i++)
            suma=+i; // añade el último valor de i; Debería sumarlo: suma += i;
        System.out.print(suma);
    }
}