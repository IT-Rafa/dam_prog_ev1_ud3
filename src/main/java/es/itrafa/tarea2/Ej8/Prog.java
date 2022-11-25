package es.itrafa.tarea2.Ej8;

/**
 * Ejercicio 8
 * Escribe una clase Potencia  que me permita la ejecución descrita en el ejemplo.
 * Para calcular el número real asociado a una potencia deberás basarte en
 * multiplicaciones sucesivas, no utilices en este caso el método pow().
 * <p>
 * El exponente siempre lo vamos a utilizar entero, o el algoritmo para calcular la
 * potencia se complica muchísimo. La base puede ser real (double en java).
 * La suma de potencias solo caso fácil, ambas de igual base.
 * <p>
 * Para imprimir  baseexponente utilizamos la notación base^exponente
 * <p>
 * Por ejemplo:
 * <p>
 * Test
 * Potencia p= new Potencia(5,2);
 * System.out.println(p);
 * System.out.println(p.toReal());
 * p= new Potencia(2.5,2);
 * System.out.println(p);
 * System.out.println(p.toReal());
 *
 * Resultado
 * 5.0^2
 * 25.0
 * 2.5^2
 * 6.25
 *
 * Test
 * Potencia p= new Potencia(2,3);
 * System.out.println(p);
 * System.out.println(p+"="+p.toReal());
 * p= new Potencia(2,-3);
 * System.out.println(p+"="+p.toReal());
 * p= new Potencia(-2,-3);
 * System.out.println(p+"="+p.toReal());
 * p= new Potencia(2.5,2);
 * System.out.println(p+"="+p.toReal());
 * Potencia p1= new Potencia(2,3);
 * Potencia p2= new Potencia(2,2);
 * System.out.println("si multiplico con distinta base: "+p1.multiplicarConIgualBase(p));
 * System.out.println(p1.multiplicarConIgualBase(p2));
 *
 * Resultado
 * 2.0^3
 * 2.0^3=8.0
 * 2.0^-3=0.125
 * -2.0^-3=-0.125
 * 2.5^2=6.25
 * si multiplico con distinta base: null
 * 2.0^5
 */
public class Prog {
    public static void main(String[] args) {
        // test 1
        Potencia p = new Potencia(5, 2);
        System.out.println(p);
        System.out.println(p.toReal());
        p = new Potencia(2.5, 2);
        System.out.println(p);
        System.out.println(p.toReal());
        System.out.println();

        // TEST 2
        Potencia p_1 = new Potencia(2, 3);
        System.out.println(p_1);
        System.out.println(p_1 + "=" + p_1.toReal());
        p_1 = new Potencia(2, -3);
        System.out.println(p_1 + "=" + p_1.toReal());
        p_1 = new Potencia(-2, -3);
        System.out.println(p + "=" + p.toReal());
        p_1 = new Potencia(2.5, 2);
        System.out.println(p_1 + "=" + p_1.toReal());
        Potencia p1_1 = new Potencia(2, 3);
        Potencia p2_1 = new Potencia(2, 2);
        System.out.println("si multiplico con distinta base: " + p1_1.multiplicarConIgualBase(p_1));
        System.out.println(p1_1.multiplicarConIgualBase(p2_1));
    }
}
