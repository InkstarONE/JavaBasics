package IO;

import java.io.*;

public class TestObjectStyream {
    public static void main(String[] args) {
        T t =new T();
        t.c = 8.8;
        try {
            FileOutputStream fos = new FileOutputStream("/Users/zhanghao/Desktop/JAVA视频/src/oo.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(t);

            FileInputStream fis = new FileInputStream("/Users/zhanghao/Desktop/JAVA视频/src/oo.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                T tt = (T) ois.readObject();
                System.out.println(tt.c+"  "+tt.i+" "+tt.k);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            fos.close();oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class T implements Serializable{
        int i = 0;
        int k = 12;
        transient  double c = 3.3;
    }
}
