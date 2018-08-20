package String;

public class T {
    public static void main(String[] args) {
        String s = "1,2;3,4,5;6,7,8";
        String sFirst[] = s.split(";");
        String a[][] = new String[sFirst.length][];
        for (int i = 0; i < sFirst.length; i++){
            System.out.println(sFirst[i]);
            String sSecond[] = sFirst[i].split(",");
            a[i] = new String[sSecond.length];
            for (int j = 0; j < sSecond.length; j++){ //字符数组的长度
                System.out.println(sSecond[j]);
                a[i][j] = sSecond[j];
            }
        }

        Double d[][] = new Double[a.length][];
        for (int i = 0; i < a.length; i++){
            d[i] = new Double[a[i].length];
            for (int j = 0; j < a[i].length; j++){
                System.out.println(a[i][j]);
                d[i][j] = Double.parseDouble(a[i][j]);
                System.out.println(d[i][j]);
            }
        }

    }
}
