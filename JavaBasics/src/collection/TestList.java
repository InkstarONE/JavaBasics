package collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List l = new ArrayList();
        for (int i = 0; i < 9; i++){
            l.add("A" + i);
        }
        System.out.println(l);

//        Collections.shuffle(l);
//        System.out.println(l);
//
//        Collections.sort(l);
//        System.out.println(l);
//
//        Collections.reverse(l);
//        System.out.println(l);

        System.out.println(Collections.binarySearch(l,"A3"));
        System.out.println(l.get(3));
    }
}
