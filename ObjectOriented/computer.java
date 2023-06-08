package ObjectOriented;

import java.util.Scanner;

public class computer {
    public static double getResult(double numberA, double numberB, String operate) {
        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
            default:
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字：");
            double numberA = Double.parseDouble(sc.nextLine());
            System.out.println("请输入运算符号：");
            String strOperate = sc.nextLine();
            System.out.println("请输入数字B：");
            double numberB = Double.parseDouble(sc.nextLine());
           
            Operation operation = OperationFactory.createOperation(strOperate);
            System.out.println("结果是：" + operation.getResult(numberA, numberB));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("您的输入有误：" + e);
        }
    }
}
