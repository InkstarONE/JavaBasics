package pet;

public class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Worker w = new Worker("gg");
        Nongming n = new Nongming("nm");
        Monster m = new Monster("ld");


        w.eat();
        n.eat();
        m.eat();


        w.play();
        n.play();
        m.play();
    }
}
