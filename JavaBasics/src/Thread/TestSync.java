package Thread;

public class TestSync implements Runnable{
    Timer t = new Timer();
    @Override
    public void run() {
        t.add(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TestSync t = new TestSync();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();t2.start();
    }
    static class Timer{
        public static int num = 0;
        public synchronized void  add(String name){
            //synchronized
            num++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "你是第" + num + "个线程");
        }
    }
}
