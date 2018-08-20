package Thread;

public class TestFace implements Runnable {

    public int b = 100;

    @Override
    public void run() {
            m1();
    }

    synchronized void m1(){
        b = 1000;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(b);
    }

    synchronized void m2() throws InterruptedException {
        Thread.sleep(500);
        b = 3000;
    }

    public static void main(String[] args) {
        TestFace tf =new TestFace();
        Thread t =new Thread(tf);
        t.start();
        try {
            tf.m2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
