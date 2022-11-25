package es.itrafa.tarea2.Ej1;

/**
 * Ejercicio 1
 * El 6 de mayo de 1949, Maurice Wilkes creó el primer programa almacenado en una máquina lo suficientemente potente
 * para realizar cálculos matemáticos de forma práctica. Esta máquina, llamada EDSAC, calculó e imprimió la tabla de
 * cuadrados de los primeros 100 números (0-99) mostrada a continuación:
 *
 * 0000 0001 0004 0009 0016 0025 0036 0049 0064 0081
 * 0100 0121 0144 0169 0196 0225 0256 0289 0324 0361
 * 0400 0441 0484 0529 0576 0625 0676 0729 0784 0841
 * ...
 * Haz un programa que genere la misma salida que el programa de Wilkes.
 *
 * Fíjate que cada resultado está formateado a cuatro dígitos y la separación entre columnas es de dos espacios.
 * Respuesta:(sistema de penalización: 0 %)
 */
public class Prog {
    public static void main(String[] args){
        for(int i = 0; i <= 99; i++){
            System.out.print(String.format("%04d  ", (i*i)));
            if((i+1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
