package es.itrafa.b1.prog_ev1_u3_b1_e12;
/*
    Ejercicio U3_B1_E12.
    Escribe un método que calcula el máximo de dos formas, una valiéndose
    del return múltiple y otra con un único return.
    El main:
    public static void main(String args[]) {
        System.out.println(max1(4, 6, 5));
        System.out.println(max1(9, 6, 5));
        System.out.println(max1(1, 6, 88));
        System.out.println(max2(4, 6, 5));
        System.out.println(max2(9, 6, 5));
        System.out.println(max2(1, 6, 88));
    }
 */

import java.util.Scanner;

class Unidad3 {
    public static void main(String[] args) {
        System.out.println(max1(4, 6, 5));
        System.out.println(max1(9, 6, 5));
        System.out.println(max1(1, 6, 88));
        System.out.println(max2(4, 6, 5));
        System.out.println(max2(9, 6, 5));
        System.out.println(max2(1, 6, 88));
    }

    public static int max1(int x, int y, int z) {
        // return múltiple
        if ((x > y) && (x > z)) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static int max2(int x, int y, int z) {
        // único return
        int result;
        if ((x > y) && (x > z)) {
            result = x;
        } else if (y > z) {
            result = y;
        } else {
            result = z;
        }
        return result;
    }
}

