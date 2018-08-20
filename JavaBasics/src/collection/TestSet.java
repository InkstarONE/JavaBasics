package collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        Set s2 = new HashSet();

        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        System.out.println(s1);
        s2.add("a");
        s2.add("b");
        s2.add("d");

        s1.retainAll(s2);
        System.out.println(s1);
        Set sn = new HashSet(s1);
        sn.addAll(s2);
        System.out.println(sn);

    }
}
