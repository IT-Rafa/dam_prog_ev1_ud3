package es.itrafa.tarea2.Ej8;

public class Potencia {
    double base;
    int exponente;

    public Potencia(double base ,int exponente){
        this.base = base;
        this.exponente = exponente;
    }

    public String toString(){
        return this.base + "^"+ this.exponente;
    }

    public double toReal(){
        double result= this.base;
        for(int i= 1; i < this.exponente; i++){
            result *= result;
        }
        return result;
    }

    public double multiplicarConIgualBase(Potencia p){
        double result = 0.0;
        if(this.base == p.base){

        }else{
            return 0.0;
        }
        for(int i= 1; i < p.exponente; i++){
            result *= result;
        }
        return result;
    }
}
