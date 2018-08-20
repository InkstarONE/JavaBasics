package Thread;

public class TestJoin {
    public static void main(String[] args) {
        Mythread2 mt = new Mythread2("thread2");
        mt.run();
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i =0 ; i < 10; i ++){
            System.out.println("i am mian thread");
        }
    }

    static class Mythread2 extends Thread{
            Mythread2(String name){
                super(name);
            }

        @Override
        public void run() {
                for (int i =0; i < 10; i ++){
            System.out.println(getName()+"hahaha");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                };
    }}
}
