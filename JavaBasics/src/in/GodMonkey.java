package in;

public class GodMonkey extends Animal implements Protectable,Valueable {
    @Override
    void enjoy() {
        System.out.println("mmmmmmmeeeeejjj");
    }

    @Override
    public void protect() {
        System.out.println("live in room");
    }

    @Override
    public double getMoney() {
        return 0;
    }

    public static void main(String[] args) {
        GodMonkey g = new GodMonkey();
        g.enjoy();
        System.out.println(g.getMoney());
        g.protect();

        Protectable pgm = new GodMonkey();
        pgm.protect();

        Valueable vogm = (Valueable) pgm;
        System.out.println(((Valueable) pgm).getMoney());
    }
}
