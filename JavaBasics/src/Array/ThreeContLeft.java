package Array;

public class ThreeContLeft {
    public static void main(String[] args) {
        boolean a[] = new boolean[500];

        for (int i = 0; i < a.length; i++) {
            a[i] = true;
        }


        int leftCount = a.length;
        int index = 0;
        int countNum = 0;
        while (leftCount > 1) {
            if (a[index] == true) {
                countNum++;
                if (countNum == 3) {
                    countNum = 0;
                    a[index] = false;
                    leftCount--;
                }
            }
            index++;

            if (a.length == index) {
                index = 0;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i ] == true){
            System.out.println(i);
        }}
    }
    }
