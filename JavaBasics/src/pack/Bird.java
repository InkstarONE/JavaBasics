package pack;

public class Bird extends Animal
{
    public String name;
    public String gege;
    Bird(String name,String gege) {
        super(name);
        this.gege = gege;
    }

    @Override
    public void enjoy() {
        System.out.println("geegege");
    }
}
