package Thread;

public class TestYield {
    public static void main(String[] args) {
        Mythread3 t1 = new Mythread3("1");
        Mythread3 t2 = new Mythread3("2");
        t1.start();t2.start();
    }

    static class Mythread3 extends Thread{
        Mythread3(String name){
            super(name);
        }

        @Override
        public void run() {
            for (int i =0; i < 100; i++){
                System.out.println(getName() + "     "+i);
                if (i % 10 == 0){
                    yield();
                }
            }
        }
    }
}
