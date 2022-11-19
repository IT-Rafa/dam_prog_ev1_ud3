package es.itrafa.b7.prog_ev1_u3_b7_e4;

public class Factorial {
    public int calcularFactorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * calcularFactorial(n-1);
        }
    }
}
