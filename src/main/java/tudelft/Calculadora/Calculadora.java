package tudelft.Calculadora;
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        System.out.println("No se puede");
        return(0);
    }
}
