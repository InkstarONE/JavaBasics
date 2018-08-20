package strudyGithubNote;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public class StudyGithub {

    public interface interfaceExample{
        void fun1();
        default void func2(){
            System.out.println("func2");
        }
        int x= 123;
        public int z= 111;
    }

    static class interfaceExampleimp implements interfaceExample{

        @Override
        public void fun1() {
            System.out.println("fun1");
        }
    }

    static class EqualExample{
        private int x;
        private int y;
        private int z;

        public EqualExample(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o){
            if (this == o)return true;
            if (o == null || getClass()!=o.getClass())return false;

            EqualExample that = (EqualExample) o;
            if (x != that.x)return false;
            if (y !=that.y)return false;
            return z == that.z;
        }
    }


    public static class CloneExample implements Cloneable{
        private int a;
        private int b;

        @Override
        protected CloneExample clone() throws CloneNotSupportedException {
            return (CloneExample) super.clone();
        }
    }

    class InnerClass{}
    static  class StaticInnerClass {}


//    class methodClass{
//
//        public methodClass() {
//        }
//
//        public final int fuck = 3;
//        public int add(int a,int b){
//            return a + b;
//        }
//        public int sub(int a,int b){
//            return a+b;
//        }
//    }



    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
       //String pool

        //        String s1 = new String("aaa");
//        String s2 = new String("aaa");
//        System.out.println(s1==s2);
//        String s3 = s1.intern();
//        System.out.println(s3==s1.intern());
//
//        String s4 = "bbbb";
//        String s5 = "bbbb";
//        System.out.println(s4 == s5);

//interdace
//        interfaceExample interfaceExample = new interfaceExampleimp();
//        interfaceExample.fun1();
//        interfaceExample.func2();
//        System.out.println(interfaceExample.x);
//        System.out.println(interfaceExample.z);

//        EqualExample e1 = new EqualExample(1,1,1);
//        EqualExample e2 = new EqualExample(1,1,1);
//        System.out.println(e1.equals(e2));
//        HashSet<EqualExample> set = new HashSet<>();
//        set.add(e1);
//        set.add(e2);
//        System.out.println(set.size());
//        CloneExample e1 = new CloneExample();
//        try {
//            CloneExample e2 = e1.clone();
//        }catch (CloneNotSupportedException e){
//            e.printStackTrace();
//        }

       // InnerClass innerClass = new InnerClass(); error
//        strudyGithubNote.StudyGithub studyGithub = new strudyGithubNote.StudyGithub();
//        InnerClass innerClass = studyGithub.new InnerClass();
//        StaticInnerClass staticInnerClass = new StaticInnerClass();

//        Class<?> kalss = int.class;
//        System.out.println(kalss);
//        Class<?> classInt = Integer.TYPE;
//        StringBuffer str = new StringBuffer();
//        Class<?> klass = str.getClass();
//        System.out.println(kalss);
//
//        Class<?> c = String.class;
//        try {
//            Object str = c.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        Constructor constructor = c.getConstructor(String.class);
//        Object obj = constructor.newInstance("23333");
//        System.out.println(obj);

        //反射获取方法
//        Class<?> c = methodClass.class;
//        Object object = c.newInstance();
//        Method[] methods = c.getMethods();
//        Method[] declareMethods = c.getDeclaredMethods();
//
//        Method method = c.getMethod("add",int.class,int.class);
//        System.out.println("getMethods获取方法");
//        for (Method m : methods){
//            System.out.println(m);
//        }
//
//        //getDeclaredMethods()方法获取的所有方法
//        System.out.println("getDeclaredMethods获取的方法：");
//        for(Method m:declareMethods)
//            System.out.println(m);

//        Class<?> klass = methodClass.class;
//        Object obj = klass.newInstance();
//
//        Method method = klass.getMethod("add", int.class, int.class);
//        Object result = method.invoke(obj,1,4);
//        System.out.println(result);

        Class<?> cls = Class.forName("java.lang.String");
        Object array = Array.newInstance(cls,25);
        Array.set(array,0,"a");
        Array.set(array,1,"b");
        Array.set(array,2,"c");
        System.out.println(Array.get(array,2));
    }
}
