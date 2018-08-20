package pet;

public class Monster extends Person implements CarePet{
    public String name;
    public Monster(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("my is lindao name is "+name+"with eat pet");
    }

    @Override
    public void play() {
        System.out.println("my is lindao name is "+name+"play with pet");
    }
}
