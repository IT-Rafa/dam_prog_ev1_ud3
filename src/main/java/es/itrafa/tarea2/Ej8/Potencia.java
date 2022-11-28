package es.itrafa.tarea2.Ej8;

public class Potencia {
    double base;
    int exponente;

    public Potencia(double base, int exponente) {
        this.base = base;
        this.exponente = exponente;
    }

    public String toString() {
        return this.base + "^" + this.exponente;
    }

    public double toReal() {
        double result = 1;
        double expPos = Math.abs(this.exponente);
        for (int i = 1; i <= expPos; i++) {
            result *= this.base;
        }
        if (this.exponente == 0) {
            return 1;
        } else if (this.exponente < 0) {
            return 1 / result;
        } else {
            return result;
        }
    }


    public Potencia multiplicarConIgualBase(Potencia p) {
        if (this.base == p.base) {
            return new Potencia(this.base, this.exponente + p.exponente);
        } else {
            return null;
        }
    }
}
