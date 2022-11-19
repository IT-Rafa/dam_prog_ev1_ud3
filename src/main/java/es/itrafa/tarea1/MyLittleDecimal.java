package es.itrafa.tarea1;

public class MyLittleDecimal {
    /**
     * Internamente, el objeto MyLittleDecimal almacena un int que representa un número con dos
     * decimales. Por ejemplo:
     * <p>
     * Para  representar 5,00, almacena el int 500
     * Para  representar 99,99 almacena  9999
     * etc.
     * <p>
     * Por lo tanto, MyLittleDecimal tiene un atributo int que representa como indicamos la cantidad
     * decimal y ese atributo debe ser private. Es su único atributo y cumplir esto es obligatorio.
     */

    // PROBLEMAS CON 0; "0,00" EN INT, SERÁ 0
    private int cantidad;
    private int comaIndex;

    private String convert(int number) {
        String valor = Integer.toString(number);
        System.out.println(valor);
        System.out.println(comaIndex);
        if(this.comaIndex == 1){
            valor = 0 + valor;
        }
        String entero = valor.substring(0, this.comaIndex);
        String decimales = valor.substring(this.comaIndex, +valor.length());
        return  entero + "," + decimales;
    }

    /**
     * Creación de objetos MyLittleDecimal
     * Los objetos se crean a través de  un constructor con  parámetro tipo String que contenga el
     * número tal cual lo teclea el usuario por ejemplo: “333,22” “45,00”   “1,01” etc
     * Recuerda que el usuario siempre tiene que teclear dos decimales, ni más ni menos y se asume
     * que siempre lo hará bien. Por tanto, el trabajo  del constructor será pasar este string a un int.
     * El int  es lo que se  almacenará en el  atributo de la clase.
     * Por ejemplo  para “333,22”  el constructor lo guarda en el atributo  como 33322, “45,00” cómo 4500,
     * “1,01” como 101 etc.
     *
     * @param number String con número incluyendo comas
     */
    public MyLittleDecimal(String number) {
        this.comaIndex = number.indexOf(',');
        this.cantidad = (Integer.parseInt(number.substring(0, this.comaIndex)) * 100) +
                Integer.parseInt(number.substring(this.comaIndex + 1, number.length()));
    }

    /**
     * getValor()
     * Devuelve el valor entero almacenado por el objeto. Como el atributo es privado, lo usamos para hacer
     * comprobaciones en los casos de prueba, no es como tal un servicio para  los usuarios de esta clase.
     *
     * @return valor almacenado en objeto MyLittleDecimal
     */
    public int getValor() {
        return cantidad;
    }

    /**
     * toString()
     * El objeto almacena el decimal como un int, pero  al usuario se lo presenta como un número con coma
     * decimal , por ejemplo, si internamente almacena 10499 lo devuelve como 104,99.
     * Es decir, hace lo contrario que el constructor.
     *
     * @return valor en String como se espera
     */
    public String toString() {
        return convert(this.cantidad);
    }

    // METHODS
    // Ten en cuenta que, EL RESULTADO DE LAS OPERACIONES sumar(), restar(), multiplicar() y dividir()
    // deben devolver UN NUEVO objeto MyLittleDecimal que contiene en su interior el resultado de la operación

    /**
     * sumar()
     * Sumar, es tan fácil como sumar los int de cada número. Por ejemplo,  si queremos sumar 5,00 y 99,99
     * creamos los MyLittleDecimal correspondientes y luego realmente el método sumar simplemente sumará dos
     * enteros:
     * <p>
     * 500+9999=10499
     *
     * @return
     */
    public MyLittleDecimal sumar(MyLittleDecimal newNumber) {
        int result = this.cantidad + newNumber.getValor();
        return new MyLittleDecimal(convert(result));
    }

    /**
     * restar()
     * idem sumar() pero restando.
     *
     * @return
     */
    public MyLittleDecimal restar(MyLittleDecimal newNumber) {
        int result = this.cantidad - newNumber.getValor();
        return new MyLittleDecimal(convert(result));
    }

    /**
     * multiplicar()
     * Recuerda el proceso “a mano” que nos enseñan en el cole,
     * Eje: si quiero multiplicar 3,55 x 2,00
     * <p>
     * 3,55 me olvido de la coma y pienso en  355
     * <p>
     * 2,00 me olvido de la coma y pienso en 200
     * <p>
     * Hago la multiplicación de toda la vida
     * 355
     * 200
     * ----
     * 000
     * 000
     * 710
     * --------------
     * 71000
     * <p>
     * y ahora corro la coma 4 posiciones(2 posiciones por el multiplicador y otras dos por el
     * multiplicando)
     * <p>
     * resultado 7,1000
     * <p>
     * Nos fijamos en el proceso anterior, pero sabiendo que trabajamos con dos decimales de
     * precisión necesitamos un redondeo. Haremos la multplicación de enteros tal cual y el
     * redondeo consistirá simplemente en despreciar los dos dígitos menos significativos para
     * quedarnos sólo con dos decimales.  Este redondeo se consigue simplemente dividieno el
     * resultado de la multiplicación entre 100.
     * Otro ejemplo:
     * <p>
     * en casos como 1,11 * 1,11 los objetos MyLittleDecimal almacenan internamente para cada
     * número los  int 111 y 111
     * <p>
     * si los multiplico 111*111=12321
     * <p>
     * al dividir por 100 se desprecian los dos últimos números y  queda el valor 123 que
     * como sabemos representa a 1,23. Perdimos invetiblemente un poco de precisión al utilizar
     * sólo dos decimales.
     *
     * @return
     */
    public MyLittleDecimal multiplicar(MyLittleDecimal newNumber) {
        return new MyLittleDecimal("0,00");
    }

    /**
     * dividir()
     * Cuando divido en papel con decimales siempre nos explicaron que como no sabemos dividir
     * con un divisor con decimales buscamos la potencia de 10 que lo convierte en un entero,
     * multiplicamos el dividendo y divisor y luego se hace la división entera:
     * <p>
     * por ejemplo,
     * <p>
     * 8/1,25 => 8*100/1,25*100 => 800/125
     * <p>
     * fíjate que nosotros no necesitamos hacer esto porque siempre tenemos int almacenados y siempre
     * podemos hacer la división entera directamente
     * <p>
     * Para el caso anterior el 8 lo tendríamos almacenado como 800
     * y el 1,25 cómo 125
     * <p>
     * luego simplemente el método dividir haría  800/125 que sabemos que es  6,4 pero al realizar la
     * división entera java el resultado es 6, perdiendo por tanto precisión.
     * <p>
     * Nos conformamos con el resultado es 6 pero lo que sí tenemos que hacer es convertir el resultado
     * 6 a nuestra representación MyLittleDecimal para lo que el resultado lo multiplicamos por 100 y
     * almacenamos internamente 600.
     * <p>
     * Podemos mejorar un poco el redondeo anterior si en lugar  de multiplicar por 100 el resultado,
     * Multiplicamos  directamente por 100 el dividendo y así obtenemos ya directamente un int
     * “MyLittleDecimal”
     * <p>
     * 80000/125=640, así nuestra división es más precisa (representamos el 6,40).
     * *      *      *      *
     * Otro ejemplo,
     * <p>
     * 1,46/2,00
     * <p>
     * si pienso en los int que almacena  MyLittleDecimal tengo dividendo 146
     * divisor 200
     * 146*100/200=73 (que representa a 0,73)
     *
     * @return
     */
    public MyLittleDecimal dividir() {
        return new MyLittleDecimal("0,00");
    }
}
