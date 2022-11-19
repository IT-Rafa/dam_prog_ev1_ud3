package es.itrafa.b5.prog_ev1_u3_b5_e15;
/*
    Ejercicio U3_B5_E15:
    Imprime las tablas de multiplicar del 1 al 9.
    Utilizar for anidado. Ejemplo de impresión
 */

class Unidad3 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            System.out.println("Tabla de multiplicar del " + i);
            System.out.println("--------------------------");
            for(int j=0; j<=10; j++){
                System.out.println(i +"x" + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}