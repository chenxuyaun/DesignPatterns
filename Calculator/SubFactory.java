package Calculator;

public class SubFactory extends Factory {
    public Operation create(){
        return new SubOperation();
    }
}
