package es.itrafa.b5.prog_ev1_u3_b5_e18;
/*
    Ejercicio U3_B5_18:
    Consigue imprimir un triángulo con base de 10 asteriscos con el siguiente aspecto.
    Debes resolver el problema sin utilizar concatenación de Strings.
    E:\Programacion> java Unidad3
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    **********
    Con la concatenación de objetos strings es muy fácil.
    Este pequeño recurso simplifica mucho la lógica

    class Unidad3{
        public static void main(String[] args) {
            String asteriscos="";
            for(int i=0;i<10;i++){
                asteriscos+="*";
                System.out.println(asteriscos);
            }
        }
    }
    Pero antiguamente no había objetos Strings, la única solución era la impresión
    secuencial de carácter en carácter y además sería un lujo mantener en memoria objetos
    String. Hoy en día para resolver algo complicado, es posible que haya un objeto que me
    ayuda a simplificar la lógica, como ocurre en el ejemplo anterior. Por eso, en muchas
    áreas de programación ya no se exige tanto a los programadores en destrezas lógicas y
    ,en cambio, se exigen destrezas con el trabajo con objetos. Esto no quiere decir que las
    destrezas lógicas no sean importantes, sino que, en muchos contextos, son menos
    importantes que antaño.
    Imprimir secuencialmente de * en * me fuerza a utilizar un for anidado y a razonar
    mucho con los contadores de los bucles, que es una habilidad muy importante en
    programación y estos ejercicios nos ayudan a desarrollarla.
 */

class Unidad3 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}