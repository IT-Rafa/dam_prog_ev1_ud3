package es.itrafa.b5.prog_ev1_u3_b5_e8;
/*
    Ejercicio U3_B5_8:
    Imprime una tabla que muestra los números de 0 a 127 en decimal con su equivalente
    binario, octal y hexadecimal. Consulta en la API la clase Integer y localiza los
    métodos que te permiten convertir un entero en un String binario, octal y
    hexadecimal. Ejemplo de salida(parcial)
    L:\Programacion>java Unidad3
    decimal binario octal   hexadecimal
    0       0       0       0
    1       1       1       1
    2       10      2       2
    3       11      3       3


 */
class Unidad3 {
    public static void main(String[] args) {
        System.out.println("decimal\tbinario\t\toctal\t\thexadecimal");
        for(int i=0; i<= 127; i++){
            System.out.println(i + "\t\t" +
                    Integer.toBinaryString(i) + "\t\t" +
                    Integer.toOctalString(i) + "\t\t" +
                    Integer.toHexString(i));
        }
    }
}