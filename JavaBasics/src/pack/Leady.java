package pack;

public class Leady {
    private Animal a;
    private String name;

    public Leady(Animal a, String name) {
        this.a = a;
        this.name = name;
    }

    void mypet(Animal a){
        a.enjoy();
    }

//
//    public static void main(String[] args) {
//        Animal a = new Animal("animal");
//        Dog d = new Dog("dog","gg");
//        Cat c = new Cat("cat","cc");
//        Bird b = new Bird("12","geeg");
//        Leady l1 = new Leady(d,"l1");
//        Leady l2 = new Leady(c,"l2");
//        l1.mypet(d);
//        l2.mypet(b);
//    }
}
