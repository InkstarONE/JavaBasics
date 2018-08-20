package String;

public class Stringbuff {
    public static void main(String[] args) {
        String s = "hello";
        StringBuffer sb = new StringBuffer(s); // 别忘了（S） 里面➕S
        System.out.println(sb.append("11").append("ccc").append("word"));

        System.out.println(sb.delete(2,4));

        System.out.println(sb.insert(3,123));

        System.out.println(sb.reverse());
    }
}
