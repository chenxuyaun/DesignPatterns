package ObjectOriented;

import javax.crypto.spec.GCMParameterSpec;

public class Div extends Operation{
    public  double getResult(double numberA, double numberB){
        if(numberB == 0){
            System.out.println("除数不能为0");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
