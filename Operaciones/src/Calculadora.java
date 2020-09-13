public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2){
        this.num1=num1;
        this.num2=num2;

    }

    public int Suma (){
        return this.num1+num2;
    }

    public int Resta (){
        return this.num1-num2;
    }

    public int Multiplicacion (){
        return this.num1*num2;
    }

    public int Division (){
        return this.num1/num2;
    }

    public int Modulo (){
        return this.num1%num2;
    }

}
