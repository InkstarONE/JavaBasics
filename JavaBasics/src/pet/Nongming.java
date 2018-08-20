package pet;

public class Nongming extends Person implements CarePet{
    public String name;

    public Nongming(String name ){
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("my is nognming name is "+name+"with eat pet");
    }

    @Override
    public void play() {
        System.out.println("my is nm name is "+name+"play with pet");
    }
}
