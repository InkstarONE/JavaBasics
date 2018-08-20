package Thread;

import com.company.T;

public class TestPriority {
    public static boolean flag = true;

    public static void main(String[] args) {
        T1 tt = new T1();
        Thread t1 = new Thread(tt );
        Thread t2 = new Thread(new  T2());
        t1.setPriority(Thread.NORM_PRIORITY+5);
        t1.start();
        //tt.shut();
    }

    public static class T1 implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().isAlive());
            while (flag){
            for (int i = 0; i < 1000; i++){
                System.out.println("T1----" + i);
            }}
        }

        public void shut(){
            flag = false;
        }

    }

    public static class T2 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++){
                System.out.println("T2       " + i);
            }
        }
    }


}
