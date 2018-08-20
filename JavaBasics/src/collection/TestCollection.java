package collection;

import javax.lang.model.element.Name;
import java.util.Collection;
import java.util.LinkedList;

public class TestCollection {
    public static void main(String[] args) {
        Collection c = new LinkedList();
        c.add("hello");
        c.add(new Integer(100));
        c.add(213);

        System.out.println(c.size());
    }
}
