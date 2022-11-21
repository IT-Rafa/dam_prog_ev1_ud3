package es.itrafa.tarea1;

public class Tarea1 {
    public static void main(String[] args){
        MyLittleDecimal mld1 = new MyLittleDecimal("200,22");
        MyLittleDecimal mld2 = new MyLittleDecimal("10,11");
        MyLittleDecimal mld3=mld1.sumar(mld2);
        System.out.println(mld1.getValor()+" "+mld2.getValor()+" "+mld3.getValor());
        // 20022 1011 21033

        MyLittleDecimal mld11 = new MyLittleDecimal("200,22");
        MyLittleDecimal mld21 = new MyLittleDecimal("10,11");
        MyLittleDecimal mld31=mld11.sumar(mld2);
        System.out.println(mld31);
        // 210,33


        MyLittleDecimal mld12 = new MyLittleDecimal("-200,22");
        MyLittleDecimal mld22 = new MyLittleDecimal("10,11");
        MyLittleDecimal mld32=mld1.sumar(mld22);
        System.out.println(mld12.getValor()+" "+mld22.getValor()+" "+mld32.getValor());
        // -20022 1011 -19011

        MyLittleDecimal mld13 = new MyLittleDecimal("-200,22");
        MyLittleDecimal mld23 = new MyLittleDecimal("10,11");
        MyLittleDecimal mld33=mld13.sumar(mld23);
        System.out.println(mld33);
        // -190,11

        MyLittleDecimal mld14 = new MyLittleDecimal("-200,22");
        MyLittleDecimal mld24 = new MyLittleDecimal("10,11");
        MyLittleDecimal mld34=mld14.restar(mld24);
        System.out.println(mld34);
        // -210,33

        MyLittleDecimal mld15 = new MyLittleDecimal("-1,00");
        MyLittleDecimal mld25 = new MyLittleDecimal("3,00");
        MyLittleDecimal mld35=mld15.multiplicar(mld25);
        System.out.println(mld35);
        // -3,00

        MyLittleDecimal mld16 = new MyLittleDecimal("-1,00");
        MyLittleDecimal mld26 = new MyLittleDecimal("-3,00");
        MyLittleDecimal mld36=mld16.multiplicar(mld26);
        System.out.println(mld36);
        // 3,00

        MyLittleDecimal mld17 = new MyLittleDecimal("0,50");
        MyLittleDecimal mld27 = new MyLittleDecimal("1,25");
        MyLittleDecimal mld37=mld17.sumar(mld27);
        System.out.println(mld37);
        // 1,75

        MyLittleDecimal mld18 = new MyLittleDecimal("1,00");
        MyLittleDecimal mld28 = new MyLittleDecimal("1,00");
        MyLittleDecimal mld38=mld18.restar(mld28);
        System.out.println(mld38);
        // 0,00

        MyLittleDecimal mld19 = new MyLittleDecimal("0,50");
        MyLittleDecimal mld29 = new MyLittleDecimal("0,45");
        MyLittleDecimal mld39=mld19.restar(mld29);
        System.out.println(mld39);
        // 0,05

        MyLittleDecimal mld410 = new MyLittleDecimal("-0,02");
        System.out.println(mld410);
        // -0,02

        MyLittleDecimal mld111 = new MyLittleDecimal("100,00");
        MyLittleDecimal mld211 = new MyLittleDecimal("300,00");
        MyLittleDecimal mld311=mld111.dividir(mld211);
        System.out.println(mld311);
        // 0,33

        MyLittleDecimal mld112 = new MyLittleDecimal("5000,05");
        MyLittleDecimal mld212 = new MyLittleDecimal("2,00");
        MyLittleDecimal mld312=mld112.multiplicar(mld212);
        System.out.println(mld312);
        // 10000,10

        MyLittleDecimal mld113 = new MyLittleDecimal("0,00");
        System.out.println(mld113.getValor());
        System.out.println(mld113);
    }
}
