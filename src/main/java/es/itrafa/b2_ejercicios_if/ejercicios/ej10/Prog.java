package es.itrafa.b2_ejercicios_if.ejercicios.ej10;

/**
 * Ejercicio 10
 * Radares de tramo
 * Tiempo máximo: 2,000 sMemoria máxima: 4096 KiB
 * <p>
 * La Dirección Particular de Tráfico (DPT) está empeñada en hacer que los conductores
 * respeten los límites de velocidad. Sin entrar en si es por razones de seguridad, por
 * ahorrar combustible, o con un mero afán recaudatorio, ahora sabemos que además de los
 * radares fijos tradicionales, están poniendo en funcionamiento los radares de tramo.
 * Desde un punto de vista formal, estos radares se basan en el teorema de Lagrange
 * (también llamado de valor medio o de Bonnet-Lagrange), que dice que si tienes una
 * función continua en un intervalo cerrado y derivable en el intervalo abierto, entonces
 * algún punto de ese intervalo abierto tendrá derivada instantánea igual a la pendiente
 * media de la curva en el intervalo cerrado.
 * <p>
 * Aunque asuste a primera vista, la repercusión es sencilla: si hacemos un viaje desde
 * Madrid a Zaragoza y nuestra velocidad media es de 111Km/h, forzosamente en algún punto
 * del camino, nuestra velocidad ha sido de 111Km/h.
 * <p>
 * Los radares de tramo consisten en colocar dos cámaras en dos puntos alejados de una
 * carretera para poder comprobar cuánto tiempo ha tardado el coche en recorrer ese tramo.
 * Si la velocidad media supera la velocidad máxima permitida, gracias al teorema anterior
 * podremos saber (aunque no le hayamos visto) que en algún punto del trayecto ha superado
 * esa velocidad. Por ejemplo, si colocamos las cámaras separadas 10Km en un tramo cuya
 * velocidad está limitada a 110Km/h, y un coche tarda 5 minutos en ser visto por la segunda
 * cámara, sabremos que su velocidad media ha sido de 120Km/h, y por tanto en algún sitio ha
 * superado el límite de velocidad aunque al pasar por debajo de las dos cámaras el coche
 * fuera a 80Km/h.
 * <p>
 * Entrada
 * <p>
 * La entrada estará formada por un número indeterminado de casos de prueba. Cada caso de
 * prueba consistirá en tres números: el primero será la distancia (en metros) que separan las
 * dos cámaras, el segundo indicará la velocidad máxima permitida en todo ese tramo (en Km/h)
 * y el tercer y último número indicará el número de segundos que ha tardado un coche en recorrer
 * el tramo. Todos esos números serán enteros.
 * <p>
 * La entrada terminará cuando todos los números sean cero.
 * <p>
 * Salida
 * <p>
 * Para cada caso de prueba, el programa generará una línea, indicando si el coche debe ser multado
 * o no. En concreto, indicará "OK" si el coche no superó la velocidad máxima, indicará "MULTA" si
 * se superó esa velocidad en menos de un 20% de la velocidad máxima permitida, y "PUNTOS" si la
 * velocidad fue superada en un 20% o más de esa velocidad; en ese caso además de la multa se le
 * quitarán puntos del carnet.
 * <p>
 * El sistema de radar puede fallar y registrar entradas incorrectas (por ejemplo, indicando que el
 * tiempo que ha tardado el coche es negativo). En esos casos, el sistema mostrará la cadena "ERROR".
 * <p>
 * Entrada de ejemplo
 * <p>
 * 9165 110 300
 * 9165 110 299
 * 12000 100 433
 * 12000 100 431
 * 12000 100 359
 * -1000 -50 -100
 * 0 0 0
 * <p>
 * Salida de ejemplo
 * <p>
 * OK
 * MULTA
 * OK
 * MULTA
 * PUNTOS
 * ERROR
 */

/*
    Entrada (Metros velMax segTardados
    Entrada : 9165 110 300
        Velocidad media = 109.98

    Entrada : 9165 110 299
        Velocidad media = 110.35
 */

import java.util.Scanner;

public class Prog {
    // 9165 110 300 -> 109.98 km/h media
    // 9165 110 299 -> 110.35 km/h media
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distMetros;
        int velMax;
        int segs;
        boolean cont = true;
        do {
            distMetros = sc.nextInt();
            velMax = sc.nextInt();
            segs = sc.nextInt();

            if (distMetros == 0 && velMax == 0 && segs == 0) {
                cont = false;

            } else if (distMetros <= 0 || velMax <= 0 || segs <= 0) {
                System.out.println("ERROR");

            } else {
                double kmHora = ((double) distMetros / 1000) /
                        ((double) segs / 60 / 60);

                if (kmHora > (velMax * 1.2)) {
                    System.out.println("PUNTOS");
                } else if (kmHora > velMax) {
                    System.out.println("MULTA");
                } else {
                    System.out.println("OK");
                }
            }
        } while (cont);
    }
}