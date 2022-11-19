package es.itrafa.tarea1;

public class Tarea1 {
    public static void main(String[] args){
        MyLittleDecimal l1 = new MyLittleDecimal("0,30");
        MyLittleDecimal l2 = new MyLittleDecimal("3,00");

        System.out.println("l1.getValor: " + l1.getValor());
        System.out.println("l1.toString: " + l1);

        System.out.println("l2.toString: " + l2.toString());
        System.out.println();
        System.out.println("sumar       " + l1 + " + "+ l2 + " = " + l1.sumar(l2));
        System.out.println("restar      " + l1 + " - "+ l2 + " = " + l1.restar(l2));

    }
}
