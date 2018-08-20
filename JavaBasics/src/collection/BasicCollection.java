package collection;

import javafx.print.Collation;

import java.util.*;

public class BasicCollection {
    public static void main(String[] args) {
//        Collection c = new HashSet();
//        c.add("hello");
//        c.add(new Integer(100));
//        c.add(new name("f1","n1"));
//        System.out.println(c);
//        c.remove("hello");
//        c.remove(new Integer(100));
//        System.out.println(c.remove(new name("f1","n1")));
//        System.out.println(c);


        List<name> c = new LinkedList<name>();
        c.add(new name("karl","m"));
        c.add(new name("steven","lee"));
        c.add(new name("jhon","o"));
        c.add(new name("tom","m"));
        System.out.println(c);
        for (int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).getFirstName()+c.get(i).getLastName());
        }
        Collections.sort(c);
        System.out.println(c);
        for (int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).getFirstName()+c.get(i).getLastName());
        }


        for (Object o :c){
            System.out.println(o);
        }
//        Iterator i = c.iterator();
//        while (i.hasNext()){
//            name n = (name) i.next();
//            System.out.println(n.firstName+n.lastName);
//        }

        for (Iterator i = c.iterator(); i.hasNext(); ){
            name n = (name) i.next();
            if (n.getFirstName().length() >= 3){
                i.remove();
              //  c.remove(name); 不可以  ite锁
            }
        }
        System.out.println(c);


    }
}

class name implements Comparable{
    public String firstName;

    public String lastName;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof name){
            name n = (name) obj;
            return firstName.equals(n.firstName) && lastName.equals(n.lastName);

        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }


    @Override//不熟悉双目运算符
    public int compareTo(Object o) {
        name n = (name) o;
        int compare = lastName.compareTo(n.lastName);
        return (compare !=0 ?compare: firstName.compareTo(n.firstName));
    }
}