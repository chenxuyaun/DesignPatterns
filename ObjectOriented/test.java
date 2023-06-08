package ObjectOriented;
import ObjectOriented.Cat;

public class test{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setShoutNum(5);
        System.out.println(cat.shout());
    }
}