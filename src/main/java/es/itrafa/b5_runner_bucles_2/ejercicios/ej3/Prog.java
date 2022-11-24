package es.itrafa.b5_runner_bucles_2.ejercicios.ej3;

/**
 * Ejercicio 3
 * Si te fijas en la codificación ASCII de las letras, se puede observar cómo
 * la diferencia entre una letra mayúscula y su correspondiente minúscula, está
 * en el bit 6
 * <p>
 * A   → 6510  → 0b1000001
 * a   → 9710  → 0b1100001
 * B   → 6610  → 0b1000010
 * b   → 9810  → 0b1100010
 * C   → 6710  → 0b1000011
 * c   → 9910  → 0b1100011
 * <p>
 * Escribe un método denominado estático flipChar() que reciba un texto y,
 * usando las operaciones de nivel de bit, devuelva el mismo texto pero con
 * cada carácter invertido al respecto de mayúsculas/minúsculas. El cambio
 * solo debería afectar a los caracteres alfabéticos (para simplificar, puedes
 * obviar caracteres no presentes en la lengua inglesa: vocales con tilde, ñ,
 * ¿,...)
 * OJO: En este tipo de pregunta la respuesta es solo el método flipChar().
 * No escribas clase ni main.
 * <p>
 * Para la lógica de inversión de bit lo más fácil es utilizar la operación
 * ex-or (en java ^), pero también lo puedes resolver con "apagar y encender un bit".
 * <p>
 * <p>
 * Por ejemplo:
 * Test 	                                                        Resultado
 * <p>
 * flipChar("En un lugar de la Mancha")                             eN UN LUGAR DE LA mANCHA
 * <p>
 * flipChar("El MOS6502 es un microprocesador de 8 bits de 1975")   eL mos6502 ES UN MICROPROCESADOR DE 8 BITS DE 1975
 * <p>
 * flipChar("\"Veni, vidi, vici\"; Julius Caesar 47 a.C.")          "vENI, VIDI, VICI"; jULIUS cAESAR 47 A.c.
 */
public class Prog {
    public static void main(String[] args) {
        System.out.println(flipChar("En un lugar de la Mancha"));
        System.out.println(flipChar("El MOS6502 es un microprocesador de 8 bits de 1975"));
        System.out.println(flipChar("\"Veni, vidi, vici\"; Julius Caesar 47 a.C."));
    }

    static String flipChar(String st) {
        String newSt = "";
        for (int i = 0; i < st.length(); i++) {
            if ((st.charAt(i) >= 'a' || st.charAt(i) >= 'A') &&
                    (st.charAt(i) <= 'z' || st.charAt(i) <= 'Z')) {
                newSt += (char) (st.charAt(i) ^ 0b100000);

            } else {
                newSt += st.charAt(i);
            }
        }
        return newSt;

    }
}
