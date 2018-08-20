package pack;

public class TestFinal {
    public static void main(String[] args) {
        T t = new T();
    }


    static class T{
        final public int i = 9;
    }

    class TT extends T{

    }
}
