package Thread;

public class TestDeadLock implements Runnable {

    public int flag = 1;
    static Object o1 = new Object(), o2 = new Object();

    public static void main(String[] args) {
        TestDeadLock td1 = new TestDeadLock();
        TestDeadLock td2 = new TestDeadLock();
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);

        td1.flag = 1;
        td2.flag = 0;
        t1.start();t2.start();
    }

    @Override
    public void run() {
        synchronized (o1){
        if (flag == 1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){
                System.out.println("1");
            }
        }}

        synchronized (o2){
            if (flag == 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                System.out.println("0");
            }}
        }
    }
}
