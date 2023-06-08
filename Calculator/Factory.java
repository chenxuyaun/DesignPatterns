package Calculator;

public abstract class Factory {
    private double currentValue = 0d;
    public abstract Operation create();    
}