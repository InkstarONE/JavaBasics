package pack;

public class Cat extends Animal {
    public String name;
    public String color;
    Cat(String name,String color) {
        super(name);
        this.color = color;
    }

    public void enjoy(){
        System.out.println("miaomiao");
    }
}
