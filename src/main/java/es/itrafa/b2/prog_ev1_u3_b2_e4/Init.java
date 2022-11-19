package es.itrafa.b2.prog_ev1_u3_b2_e4;
/*
    Ejercicio U3_B2_E4:
    Escribe un programa que lea un mes y un año en formato
    numérico e indique el número de días de ese mes. Para realizar este ejercicio hay que
    tener en cuenta que:

    Un año es bisiesto si es divisible por cuatro, excepto cuando es
    divisible por 100, a no ser que sea divisible por 400.
    Explica bien lo de los bisiestos en
    http://www.disfrutalasmatematicas.com/medida/anos-bisiestos.html

    class Unidad3{
        public static void main(String[] args) {
            int month = 2;//cambiamos month para probar switch
            int year = 2000;
            int numDays = 0;
            switch (month) {
                Etc…
            }
            System.out.println("Number of Days = " + numDays);
        }
    }
 */

class Unidad3 {
    public static void main(String[] args) {
        int month = 2; //cambiamos month para probar switch
        int year = 2012;
        int numDays = 0;


        // Meses con 30 días: Abril, Junio, Septiembre y Noviembre.
        // Meses con 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.
        // Meses con 28 días: Febrero (Menos cuando es bisiesto que tiene 29 días).
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;

            case 2:
                if ((year % 4 == 0) && // Los años bisiestos son los divisibles entre 4 (como 2004, 2008, etc.)
                        ((year % 100 != 0) || // excepto si es divisible entre 100, entonces no es bisiesto (como 2100, 2200, etc.)
                                (year % 400 == 0))) { // excepto si es divisible entre 400, entonces sí (como 2000, 2400)
                    numDays = 29;
                }else {
                    numDays = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;

            default:
                numDays = -1;
                break;
        }
        System.out.println("Number of Days = " + numDays);
    }
}