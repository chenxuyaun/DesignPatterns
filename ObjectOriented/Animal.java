package ObjectOriented;
public class Animal {
    protected String name = "";
    public Animal(String name){
        this.name = name;
    }
    public Animal(){
        this.name = "无";
    }
    
    protected int shoutNum = 3;
    public void setShoutNum(int value){
        this.shoutNum = value;
    }
    public int getShoutNum(){
        return this.shoutNum;
    }
    public String shout(){
        return "";
    }
}
