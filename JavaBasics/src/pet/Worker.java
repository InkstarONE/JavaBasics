package pet;

public class Worker extends Person implements CarePet {
    String name;
    public Worker(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("my is worker name is "+name+"with eat pet");
    }

    @Override
    public void play() {
        System.out.println("my is worker name is "+name+"play with pet");
    }
}
