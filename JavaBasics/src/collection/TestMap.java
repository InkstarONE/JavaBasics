package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap m1 = new HashMap();
        TreeMap m2 = new TreeMap();
        m1.put("one",new Integer(1));
        m1.put("two",new Integer(2));
        m1.put("tree",new Integer(3));
        System.out.println(m1);
        System.out.println( m1.containsKey("one"));
        System.out.println(m1.containsValue(1));
    }
}
