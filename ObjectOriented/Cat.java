package ObjectOriented;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public Cat(){
        super();
    }
    public String shout(){
        String result = "";
        for (int i = 0; i < this.shoutNum; i++) {
            result += " 喵";
        }
        return this.name + result;
    }
}
