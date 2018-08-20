package Thread;

import com.company.T;

public class ProductComsumer {
    static class wotou{
        int id;
        wotou(int id){
            this.id = id;
        }

        @Override
        public String toString() {
            return "wotou    --" + id;
        }
    }

    static class SyncStack{

        wotou warr[] = new wotou[6];
        int index = 0;

        synchronized void puts(wotou w){
            while (warr.length == index){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            this.notify();

            warr[index] = w;
            index++;
        }

        synchronized wotou pop(){
            while (index == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.notify();
            index--;
            return warr[index];

        }
    }

    static class Product implements Runnable{

        SyncStack ss = null;

        Product(SyncStack ss){
            this.ss = ss;
        }
        @Override
        public void run() {
            for (int i = 0;i < 6; i++){
                wotou w = new wotou(i);
                System.out.println("生产" + w.toString());
                ss.puts(w);
            }
        }
    }

    static class Comsumer implements Runnable{

        SyncStack ss = null;

        Comsumer(SyncStack ss){
            this.ss = ss;
        }
        @Override
        public void run() {
            for (int i = 0;i < 6; i++){

                wotou w = ss.pop();
                System.out.println("消费" + w.toString());
            }
        }
    }

    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        Product p =new Product(ss);
        Comsumer c =new Comsumer(ss);
        Thread tp = new Thread(p);
        Thread tc = new Thread(c);
        tp.start();
        tc.start();
    }
}
