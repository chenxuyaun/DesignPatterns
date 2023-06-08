package Calculator;

public class main {
    public static void main(String[] args) {
        Client client = new Client();
        Factory factory1 = new AddFactory();
        Factory factory2 = new SubFactory();
        double result1 = client.calculate(factory1, 5.0, 3.0); // 执行 5 + 3
        double result2 = client.calculate(factory2, 5.0, 3.0); // 执行 5 - 3
        System.out.println("5.0 + 3.0 = " + result1); // 输出 8.0
        System.out.println("5.0 - 3.0 = " + result2); // 输出 2.0 
    }
}
