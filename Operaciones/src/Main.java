public class Main {
    public static void main(String[] args){

        Calculadora op= new Calculadora(12,10);

        System.out.println("Suma: "+op.Suma());
        System.out.println("Resta: "+op.Resta());
        System.out.println("Multiplicación: "+op.Multiplicacion());
        System.out.println("División: "+op.Division());
        System.out.println("Modulo: "+op.Modulo());

    }
}
