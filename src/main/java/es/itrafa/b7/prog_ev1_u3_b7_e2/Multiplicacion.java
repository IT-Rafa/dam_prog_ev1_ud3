package es.itrafa.b7.prog_ev1_u3_b7_e2;

class Multiplicacion {
    int multiplicar(int a, int b) {
        if (b == 0)
            return 0;

        else if (b > 0)
            return a + multiplicar(a, --b );

        else //b < k0
            return -a + multiplicar(a, ++b);
    }
}