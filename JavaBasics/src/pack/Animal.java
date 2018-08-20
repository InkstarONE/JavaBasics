package pack;

 abstract public class Animal {
    public String name;
    Animal(String name){
        this.name = name;
    }

//    void enjoy(){
//        System.out.println("i am a animal ahaahha");
//    }

    //抽象类
   public abstract void enjoy();
}
