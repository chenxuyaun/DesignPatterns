package Calculator;

public class AddFactory extends Factory {
    public Operation create(){
        return new AddOperation();
    }
}
