package strudyGithubNote;


public class Test {


    public static <T extends Comparable<T>> int contGreatThan(T[] anArray,T elem){
        int count = 0;
        for (T e : anArray){
            if (e.comparable(elem) > 0){
                count++;
            }
        }
        return count;
    }

    class Fruit{}
//    class Apple extends Fruit{}
    class Orange extends Fruit{}
    public static int value = 123;

    static {
        int i = 0;
        System.out.println(i);
    }
    static int i = 1;

    public static void main(String[] args) {
//         Integer [] a = {1,2,3};
//         Integer b = 1;
//         contGreatThan<int>(a,b);
//        System.out.println(contGreatThan(a,b));


  //      FruitInfoUtil.getFruitInfo(Apple.class);


        System.out.println(i);
    }
}
