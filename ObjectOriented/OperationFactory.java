package ObjectOriented;

public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
            default:
                break;
        }
        return oper;
    }
}
