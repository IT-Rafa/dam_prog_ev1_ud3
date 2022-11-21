package es.itrafa.tarea1;
public class MyLittleDecimal{
    // ATTRIBUTES
    private int cantidad;

    // CONSTRUCTOR
    public MyLittleDecimal(String number) {
        String noComa = number.replace(",", "");
        this.cantidad = Integer.parseInt(noComa);

    }

    // METHODS


    public int getValor() {
        return this.cantidad;
    }

    public String toString() {
        String result;
        if (this.cantidad  >= 0){
            if(this.cantidad < 10 ){
                result = "00" + this.cantidad;
            }else if((this.cantidad < 100)){
                result = "0" + this.cantidad;
            }else{
                result = "" + this.cantidad;
            }
        }else{
            if(this.cantidad > -10 ){
                result = "-00" + -this.cantidad;
            }else if((this.cantidad > -100)){
                result = "-0" + -this.cantidad;
            }else{
                result = "-" + -this.cantidad;
            }
        }

        return result.substring(0, result.length()-2) + "," +
                result.substring(result.length()-2, result.length());
    }

    public MyLittleDecimal sumar(MyLittleDecimal newNumber) {
        int result = this.cantidad + newNumber.getValor();
        return new MyLittleDecimal(String.valueOf(result));
    }

    public MyLittleDecimal restar(MyLittleDecimal newNumber) {
        int result = this.cantidad - newNumber.getValor();
        return new MyLittleDecimal(String.valueOf(result));
    }

    public MyLittleDecimal multiplicar(MyLittleDecimal newNumber) {
        String result = String.valueOf(this.cantidad * newNumber.getValor());

        return new MyLittleDecimal(result.substring(0, result.length()-2) + "," +
                result.substring(result.length()-2, result.length()));
    }
    public MyLittleDecimal dividir(MyLittleDecimal newNumber) {
        String result = String.valueOf((this.cantidad * 100) / newNumber.getValor());

        return new MyLittleDecimal(result.substring(0, result.length()-2) + "," +
                result.substring(result.length()-2, result.length()));
    }

}
