package Calculator;

public class Client {
    public double calculate(Factory factory, double a, double b) {
        Operation operation = factory.create();
        return operation.operate(a, b);
    }
}
