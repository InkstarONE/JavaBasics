//package Thread;
//
//import java.util.Date;
//
//import static java.lang.Thread.sleep;
//
//public class Thread {
//    public Thread(String name) {
//    }
//    public static void main(String[] args) {
//        runner r = new runner();
//     //   r.run();
//        //避免使用同名类  记住傻逼
//        java.lang.Thread t = new java.lang.Thread(r);
//        t.start();
//        try {
//            java.lang.Thread.sleep(10000);
//            System.out.println("----");
//            t.interrupt();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    static  class runner implements Runnable{
//        public void run() {
//            while (true){
//                System.out.println(new Date());
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    return;
//                }
//            }
//        }
//
//    }
//
//}
